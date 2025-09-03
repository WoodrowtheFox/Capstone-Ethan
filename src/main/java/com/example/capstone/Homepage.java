package com.example.capstone;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.paint.Color.*;

public class Homepage extends Application {

    PerodicTable table = new PerodicTable();
    PerodicGame game = new PerodicGame();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane mainpane = new Pane();
        Scene scene = new Scene(mainpane, 1000, 1000);

        VBox buttonbox = new VBox();

        Button periodic = new Button("Chemistry Basics");
        periodic.setMinHeight(100);
        periodic.setMinWidth(150);

        Button periodicgamne = new Button("Chemistry Game");
        periodicgamne.setMinHeight(100);
        periodicgamne.setMinWidth(150);

        periodic.setOnAction(this::perodictable);
        periodicgamne.setOnAction(this::perodicgames);

        buttonbox.getChildren().addAll(periodic, periodicgamne);
        mainpane.getChildren().add(buttonbox);
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();
    }
    public void perodictable(ActionEvent e){
        Stage stage = new Stage();
        try{table.start(stage);} catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void perodicgames(ActionEvent e) {
        Stage stage = new Stage();
        try{game.start(stage);} catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
