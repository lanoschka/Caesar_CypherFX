module com.caesar_cypherfx.caesar_cypherfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.caesar_cypherfx.caesar_cypherfx to javafx.fxml;
    exports com.caesar_cypherfx.caesar_cypherfx;
}