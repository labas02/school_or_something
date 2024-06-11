module com.example.muj_ne_prvni_project_v_gitu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.muj_ne_prvni_project_v_gitu to javafx.fxml;
    exports com.example.muj_ne_prvni_project_v_gitu;
}