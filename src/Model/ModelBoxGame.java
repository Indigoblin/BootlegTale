package Model;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ModelBoxGame {
    private Group root;

    public ModelBoxGame(Group root){
        Rectangle r1 = new Rectangle(465,460,270,250);
        r1.setStroke(Color.WHITE);
        r1.setFill(null);
        r1.setStrokeWidth(8);
        root.getChildren().add(r1);
    }
}
