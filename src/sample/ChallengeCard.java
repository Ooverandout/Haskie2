package sample;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import java.net.URL;
import java.awt.*;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;

public class ChallengeCard {
    final double sizeX = 0, sizeY = 0;
    String  imgPath, blackImgPath, victorySoundPath, failSoundPath;
    VBox card=new VBox();
    Button cardButton = new Button();
    TextField password = new TextField();
    ChallengeCard(){
        card.getChildren().addAll(cardButton,password);
    }
    ChallengeCard( String imgPath, String blackImgPath, String victorySoundPath, String failSoundPath) {
        this.blackImgPath = blackImgPath;
        this.imgPath = imgPath;
        this.victorySoundPath = victorySoundPath;
        this.failSoundPath = failSoundPath;
        setImage(blackImgPath);
        card.getChildren().addAll(cardButton,password);

    }

    static VBox createCard() {
        VBox card=new VBox();
        Button cardButton = new Button("lalala");
        TextField password = new TextField();

        card.getChildren().addAll(cardButton,password);
        return card;

    }
    public static String toHex(String arg) {
        return String.format("%x", new BigInteger(1, arg.getBytes(Charset.defaultCharset())));
    }
    private void playSound(String path){
        final URL resource = getClass().getResource(path);
        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        card.getChildren().add(mediaView);
    }
        private void setImage(String path){
        javafx.scene.image.Image playI=new Image(path);
        ImageView iv1=new ImageView(playI);
        iv1.setFitHeight(67);
        iv1.setFitWidth(69);
        cardButton.setGraphic(iv1);;
    }
    void init(){
        card.getChildren().addAll(cardButton,password);
    }
}

