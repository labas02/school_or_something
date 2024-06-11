package com.example.muj_ne_prvni_project_v_gitu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.shape.Polygon;

public class HelloController {
    @FXML
    private Polygon auto;
    @FXML
    private ColorPicker barva;


    public void zmenBarvu(ActionEvent event) {
        auto.setFill(barva.getValue());
    }
}