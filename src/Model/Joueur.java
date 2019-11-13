package Model;

import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class Joueur {
    private Group root;
    private ImageView spritePlayer;
    private int speed;
    public static final String up = "Up";
    public static final String left = "Left";
    public static final String right = "Right";
    public static final String down = "Down";

    public Joueur(Group root){
        this.root = root;
        spritePlayer = new ImageView(Path.joueurFullHealth);
        spritePlayer.setFitHeight(100);
        spritePlayer.setFitWidth(140);
        spritePlayer.setX(530);
        spritePlayer.setY(560);
        speed = 7;
        root.getChildren().add(spritePlayer);
    }

    public void move(String direction){
        switch (direction){
            case up:
                spritePlayer.setLayoutY(spritePlayer.getLayoutY()-speed);
                break;

            case left:
                spritePlayer.setLayoutX(spritePlayer.getLayoutX()-speed);
                break;

            case right:
                spritePlayer.setLayoutX(spritePlayer.getLayoutX()+speed);
                break;

            case down:
                spritePlayer.setLayoutY(spritePlayer.getLayoutY()+speed);
                break;
        }
    }

}
