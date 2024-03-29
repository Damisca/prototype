import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Prototype extends Application {

    public List<Level> levelList;
    public Scene scene;
    public Level levelOne;
    public static final double WIDTH = 640, HEIGHT = 512;
    private RunLoop runLoop;
    private boolean left, right;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        LevelOne levelOneSetup = new LevelOne();
        levelOne = levelOneSetup.setupLevel();
        levelList = new ArrayList<>();
        levelList.add(levelOne);

        scene = new Scene(levelOne, WIDTH, HEIGHT);
        primaryStage.setTitle("Prototype");
        primaryStage.setScene(scene);
        primaryStage.show();

        createSceneEventHandling();
        scene.setRoot(levelOne);
        runLoop = new RunLoop(this);
        runLoop.start();
    }

    private void createSceneEventHandling() {
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case LEFT:
                    left = true;
                    break;
                case RIGHT:
                    right = true;
                    break;
            }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case LEFT:  left  = false; break;
                case RIGHT: right = false; break;
            }
        });
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
