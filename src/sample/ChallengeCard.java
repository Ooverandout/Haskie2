package sample;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.awt.*;

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

    }

    static VBox createCard() {
        VBox card=new VBox();
        Button cardButton = new Button("lalala");
        TextField password = new TextField();

        card.getChildren().addAll(cardButton,password);
        return card;

    }
    void setImage(String url){
        javafx.scene.image.Image playI=new Image(url);
        ImageView iv1=new ImageView(playI);
        iv1.setFitHeight(67);
        iv1.setFitWidth(69);
        cardButton.setGraphic(iv1);

    }
    void init(){
        card.getChildren().addAll(cardButton,password);
    }
}

