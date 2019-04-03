package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.Random;
import java.util.stream.IntStream;

public class Main extends Application  {


    int suma(int a,int b){
        return a+b;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Image playI=new Image("file:///C:\\Users\\Ja\\Desktop\\JPG\\Ja.png");
        ImageView iv1=new ImageView(playI);
        iv1.setFitHeight(67);
        iv1.setFitWidth(69);
        GridPane pane= new GridPane();
        HBox mainHbox= new HBox();
        TextField txt=new TextField();
        mainHbox.getChildren().add(new Button("",iv1));
        mainHbox.getChildren().add(txt);

        BorderPane bPane= new BorderPane();
        HBox hbox= new HBox();
        hbox.getChildren().addAll(ChallengeCard.createCard(),ChallengeCard.createCard(),ChallengeCard.createCard(),ChallengeCard.createCard());

        bPane.setCenter(hbox);


        System.out.println("DUPATESTGIT");


        primaryStage.setScene(new Scene(bPane, 300, 275));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
