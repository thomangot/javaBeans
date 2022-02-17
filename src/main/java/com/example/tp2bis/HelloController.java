package com.example.tp2bis;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

import java.util.ServiceLoader;

public class HelloController {
    @FXML private Button chooseDirectory;
    @FXML private Button first;
    @FXML private Button previous;
    @FXML private Button last;
    @FXML private Button next;
    @FXML private Label imageNumber;
    @FXML private CheckBox loopRead;
    @FXML private CheckBox diaporama;
    @FXML private Slider slider;
    @FXML private Pane imageZone;
}