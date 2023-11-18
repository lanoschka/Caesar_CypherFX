package com.caesar_cypherfx.caesar_cypherfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Caesar_Cypher extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sentence Encryption");

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 10;");
        Scene scene = new Scene(root, 400, 200);

        Label sentenceLabel = new Label("Enter a sentence:");
        TextField sentenceField = new TextField();

        Label keyLabel = new Label("Enter a key:");
        TextField keyField = new TextField();

        Button encryptButton = new Button("Encrypt");
        Label resultLabel = new Label();

        encryptButton.setOnAction(e -> {
            String sentence = sentenceField.getText();
            int key = Integer.parseInt(keyField.getText());
            String encryptedSentence = encryptSentence(sentence, key);
            resultLabel.setText("Encrypted sentence is: " + encryptedSentence);
        });

        root.getChildren().addAll(sentenceLabel, sentenceField, keyLabel, keyField, encryptButton, resultLabel);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static String encryptSentence(String sentence, int key){
        char[] chars = sentence.toCharArray();
        StringBuilder encryptedSentence = new StringBuilder();

        for (char c : chars) {
            c += (char) key;
            encryptedSentence.append(c);
        }

        return encryptedSentence.toString();
    }


    public static void main(String[] args) {
        launch();
    }
}