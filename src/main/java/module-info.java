module com.example.jedimanager {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.jedimanager to javafx.fxml;
    exports com.example.jedimanager;
}