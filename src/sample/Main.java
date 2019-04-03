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

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String[] people = {"Maciek","Jakub","Robert","Adam","Wawrzyniec"};
        ChallengeCard[] cards = new ChallengeCard[people.length];

        int i=0;
        for(String mate:people){
            String base = "file:///C:\\" + mate;
            cards[i] = new ChallengeCard("x",base + "img.jpg",base + "blackimg.jpg",base + "vic.mp3",base + "fail.mp3");
            i++;
        }

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Image playI=new Image("file:///C:\\test.jpg");
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
        //hbox.getChildren().addAll(ChallengeCard.createCard(),ChallengeCard.createCard(),ChallengeCard.createCard());

        bPane.setCenter(hbox);


        System.out.println("DUPATESTGIT");
        System.out.println("DUPATESTGIT2");


        primaryStage.setScene(new Scene(bPane, 300, 275));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
