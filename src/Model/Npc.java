package Model;

import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class Npc {
    private Group root;
    private ImageView npcDoggo;

    public Npc(Group root) {
        this.root = root;
        npcDoggo = new ImageView(Path.doggo);
        npcDoggo.setY(50);
        npcDoggo.setX(450);

        root.getChildren().add(npcDoggo);
    }
}
