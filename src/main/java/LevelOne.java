import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LevelOne {

    private Level level;
    private Image playerImage;
    private Player player;

    public LevelOne() { this.level = new Level();}

    public Level setupLevel() {

        loadImageAssets();
        createActors();
        createCast();
        addNodes();
        //addActors();

        return level;
    }

    private void loadImageAssets() {

        level.setBackgroundImage(new Image("bg.png"));

        //if this if for the player we definitely don't want it here...
        playerImage = new Image("player.png");
    }

    public void createActors() {

        player = new Player(0,0);
    }

    private void createCast() {
        Cast cast = new Cast();
        cast.addCurrentCast(player);
        level.setCast(cast);
    }

    private void addNodes(){

        ImageView screenBackplate = new ImageView();
        screenBackplate.setImage(level.getBackgroundImage());
        level.getChildren().add(screenBackplate);
    }
/*    private void addActors(){

        level.getChildren().add(player.getCurrentImage());
    }*/
}
