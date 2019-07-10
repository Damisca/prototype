import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LevelOne {

    private Level level;
    private Image playerImage;
    private Player player;
    Image levelOneBackground;
    ImageView levelOneImageView;

    public LevelOne() { this.level = new Level();}

    public Level setupLevel() {

        loadImageAssets();
        createActors();
        createCast();
        addNodes();
        addActors();
        return level;
    }

    private void loadImageAssets() {

        levelOneBackground = new Image("bg.png");
        levelOneImageView = new ImageView(levelOneBackground);
        level.getChildren().add(levelOneImageView);

        //if this if for the player we definitely don't want it here...
        playerImage = new Image("player.png");
    }

    public void createActors() {

        player = new Player(250,400);
        player.setCurrentImage(new ImageView(playerImage));
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
    private void addActors(){

        level.getChildren().add(player.getCurrentImage());
        for (Actor a : level.getCast().getCurrentCast()) {
            a.getCurrentImage().setTranslateX(a.getInitialX());
            a.getCurrentImage().setTranslateY(a.getInitialY());
        }
    }
}
