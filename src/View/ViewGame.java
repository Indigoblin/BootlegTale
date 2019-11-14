package View;

import Controller.ControllerGame;
import Model.Joueur;
import Controller.ControllerKeyboard;
import Model.Npc;
import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class ViewGame {
    private Group root;
    private Button btnBackMainP;
    private ViewHandler vhGame;
    private Font fontScreenText;
    private ControllerKeyboard keyListen;
    private Joueur player;
    private Npc npcDoggo;
    private Rectangle r1;
    private ImageView spritePlayer;
    private int speed;
    public static final String up = "Up";
    public static final String left = "Left";
    public static final String right = "Right";
    public static final String down = "Down";


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

    public void checkPosition(){
        if (spritePlayer.getLayoutX() < -117) {
            spritePlayer.setLayoutX(-117);
        }
        if (spritePlayer.getLayoutX() > 117){
            spritePlayer.setLayoutX(117);
        }
        if (spritePlayer.getLayoutY() > 80){
            spritePlayer.setLayoutY(80);
        }
        if (spritePlayer.getLayoutY() < -134){
            spritePlayer.setLayoutY(-134);
        }
    }


    public ViewGame(ViewHandler vhGame, Group root, Joueur player) {
        this.vhGame = vhGame;
        this.root = root;
        this.player = player;
        btnBackMainP = initButton(940,750,"Back");
        r1 = initRectangle(465,460,270,250);

        spritePlayer = new ImageView(Path.joueurFullHealth);
        spritePlayer.setFitHeight(100);
        spritePlayer.setFitWidth(140);
        spritePlayer.setX(530);
        spritePlayer.setY(560);
        speed = 7;
    }

    void initView() {
        root.getChildren().clear();
        npcDoggo = new Npc(root);
        root.getChildren().add(btnBackMainP);
        root.getChildren().add(spritePlayer);
        root.getChildren().add(r1);

    }

    private Button initButton(int longeur, int largeur, String texteDuBouton) {
        Button b = new Button();
        b.setLayoutX(longeur);
        b.setLayoutY(largeur);
        b.setText(texteDuBouton);
        b.setBackground(null);
        fontScreenText = Font.loadFont(getClass().getResourceAsStream(Path.fontDTMSans), 60);
        b.setFont(fontScreenText);
        b.setTextFill(Color.WHITE);
        return b;
    }

    private Rectangle initRectangle(int x, int y, int width, int height){
        Rectangle r1 = new Rectangle();
        r1.setX(x);
        r1.setY(y);
        r1.setWidth(width);
        r1.setHeight(height);
        r1.setStroke(Color.WHITE);
        r1.setFill(null);
        r1.setStrokeWidth(8);
        return r1;
    }

    public void setEventsBack(ControllerGame mc) {
        btnBackMainP.setOnMouseClicked(mc);
    }

    public Button getBtnBackMainP() {
        return btnBackMainP;
    }

    public void setEvents(ControllerKeyboard kl){
        root.getScene().setOnKeyPressed(kl);
        root.getScene().setOnKeyReleased(kl);
    }

    public Joueur getPlayer() {
        return player;
    }

    public Rectangle getR1() {
        return r1;
    }
}
