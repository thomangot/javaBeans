module com.example.tp2bis {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.tp2bis to javafx.fxml;
    exports com.example.tp2bis;
}