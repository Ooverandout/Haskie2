package sample;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.awt.*;

public class ChallengeCard {
    final double sizeX = 0, sizeY = 0;
    String  imgPath, victorySoundPath, failSoundPath;

    ChallengeCard( String imgPath, String victorySoundPath, String failSoundPath) {
        this.imgPath = imgPath;
        this.victorySoundPath = victorySoundPath;
        this.failSoundPath = failSoundPath;
    }

    static VBox createCard() {
        VBox card=new VBox();
        Button cardButton = new Button();
        TextField password = new TextField();

        card.getChildren().addAll(cardButton,password);
        return card;

    }
}

