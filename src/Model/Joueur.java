package Model;

import Toolbox.Path;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class Joueur {
    private ImageView spritePlayer;
    private Scene scene;

    public Joueur(Scene scene){
        this.scene = scene;

        spritePlayer = new ImageView(Path.joueurFullHealth);
        spritePlayer.setX(250);
        spritePlayer.setY(250);
    }

}
