package sample;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class Scenery {
    HBox hbox = new HBox();
    Scenery(){
        GridPane pane= new GridPane();
        HBox mainHbox= new HBox();
        TextField txt=new TextField();
        BorderPane bPane= new BorderPane();
        HBox hbox= new HBox();
        bPane.setCenter(hbox);


    }
    Scenery(VBox vbox){
        GridPane pane= new GridPane();
        HBox mainHbox= new HBox();
        TextField txt=new TextField();
        BorderPane bPane= new BorderPane();
        HBox hbox= new HBox();
        hbox.getChildren().add(this.hbox);
        bPane.setCenter(hbox);


    }

}
