package Controller;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class ControllerKeyboard implements EventHandler<KeyEvent> {
    private boolean upPressed = false;
    private boolean rightPressed = false;
    private boolean downPressed = false;
    private boolean leftPressed = false;
    private Group root;

    public ControllerKeyboard(Group root) {
        this.root = root;
        root.getScene().setOnKeyPressed(this);
    }

    boolean isUpPressed() {
        System.out.println("Haut");
        return upPressed;
    }

    boolean isRightPressed() {
        System.out.println("Droite");
        return rightPressed;
    }

    boolean isDownPressed() {
        System.out.println("Bas");
        return downPressed;
    }

    boolean isLeftPressed() {
        System.out.println("Gauche");
        return leftPressed;
    }

    @Override
    public void handle(KeyEvent keyEvent) {
        if( keyEvent.getEventType().equals(KeyEvent.KEY_PRESSED) ) {
            if( keyEvent.getCode() == KeyCode.UP || keyEvent.getCode() == KeyCode.KP_UP || keyEvent.getCode() == KeyCode.Z ) {
                System.out.println("Haut");
                upPressed = true;
            }
            if( keyEvent.getCode() == KeyCode.RIGHT || keyEvent.getCode() == KeyCode.KP_RIGHT || keyEvent.getCode() == KeyCode.D ) {
                System.out.println("Droite");
                rightPressed = true;
            }
            if( keyEvent.getCode() == KeyCode.DOWN || keyEvent.getCode() == KeyCode.KP_DOWN || keyEvent.getCode() == KeyCode.S ) {
                System.out.println("Bas");
                downPressed = true;
            }
            if( keyEvent.getCode() == KeyCode.LEFT || keyEvent.getCode() == KeyCode.KP_LEFT || keyEvent.getCode() == KeyCode.Q ) {
                System.out.println("Gauche");
                leftPressed = true;
            }
        } else if( keyEvent.getEventType().equals(KeyEvent.KEY_RELEASED) ) {
            if( keyEvent.getCode() == KeyCode.UP || keyEvent.getCode() == KeyCode.KP_UP || keyEvent.getCode() == KeyCode.Z ) {
                System.out.println("Haut");
                upPressed = false;
            }
            if( keyEvent.getCode() == KeyCode.RIGHT || keyEvent.getCode() == KeyCode.KP_RIGHT || keyEvent.getCode() == KeyCode.D ) {
                System.out.println("Droite");
                rightPressed = false;
            }
            if( keyEvent.getCode() == KeyCode.DOWN || keyEvent.getCode() == KeyCode.KP_DOWN || keyEvent.getCode() == KeyCode.S ) {
                System.out.println("Bas");
                downPressed = false;
            }
            if( keyEvent.getCode() == KeyCode.LEFT || keyEvent.getCode() == KeyCode.KP_LEFT || keyEvent.getCode() == KeyCode.Q ) {
                System.out.println("Gauche");
                leftPressed = false;
            }
        }

    }
}