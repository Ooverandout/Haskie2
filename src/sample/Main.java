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

import java.math.BigInteger;
import java.nio.charset.Charset;
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
            String base = "file:///C:\\Users\\ADMROZIK\\IdeaProjects\\Haskie\\images\\" + mate;
            cards[i] = new ChallengeCard(mate.substring(0,3),base + "img.jpg",base + "blackimg.jpg", mate + "vic.mp3", mate + "fail.mp3");
            i++;
        }
        Scenery scenery = new Scenery();
        for(ChallengeCard chalCard:cards) {
            scenery.hbox.getChildren().add(chalCard.card);
        }
        primaryStage.setScene(new Scene(scenery.hbox, 300, 275));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
