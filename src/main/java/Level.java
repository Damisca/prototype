import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Level extends Group {

    private Cast cast;
    private Image backgroundImage;
    private ImageView screenBackplate;

    public void updateLevel(boolean left, boolean right) {

        if(left) System.out.println("left is true");
        if(right) System.out.println("right is true");
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public ImageView getScreenBackplate() {
        return screenBackplate;
    }

    public void setScreenBackplate(ImageView screenBackplate) {
        this.screenBackplate = screenBackplate;
    }

    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }
}
