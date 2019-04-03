package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
            String base = "file:///C:\\Users\\ADMROZIK\\IdeaProjects\\Haskie2\\src\\images\\" + mate;
            cards[i] = new ChallengeCard(mate.substring(0,3),base + "img.jpg",base + "blackimg.jpg", mate + "vic.mp3", mate + "fail.mp3");
            i++;
        }
        Scenery scenery = new Scenery();
        BorderPane bpane=new BorderPane();

        Image playI=new Image("file:///C:\\Users\\ADMROZIK\\IdeaProjects\\Haskie2\\src\\images\\ponnies.jpg");
        ImageView iv1=new ImageView(playI);
        iv1.setFitHeight(950);
        iv1.setFitWidth(1800);
        bpane.getChildren().add(iv1);


        scenery.hbox.setAlignment(Pos.BOTTOM_CENTER);
        scenery.hbox.setSpacing(40);
        for(ChallengeCard chalCard:cards) {
            scenery.hbox.getChildren().add(chalCard.card);
        }
        bpane.setCenter(scenery.hbox);
        Text header= new Text("MACIEK QUEST");
        header.setFont(Font.font("Verdana",50));
        bpane.setTop(header);
        BorderPane.setAlignment(bpane.getCenter(),Pos.CENTER);
        BorderPane.setAlignment(bpane.getTop(),Pos.CENTER);

        //Scene scene = new Scene(bpane,1800,950)




        primaryStage.setScene(new Scene(bpane, 1800, 950));


        primaryStage.show();
    }

        //fafa
    public static void main(String[] args) {
        launch(args);
    }
}
