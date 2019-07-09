import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Actor {

    protected List<Image> imageStates = new ArrayList<Image>();
    protected ImageView currentImage;
    protected double initialX;
    protected double initialY;
    private double vX;
    private double vY;

    public Actor(double xLocation, double yLocation) {

        initialX = xLocation;
        initialY = yLocation;
    }

    public List<Image> getImageStates() {
        return imageStates;
    }

    public void setImageStates(List<Image> imageStates) {
        this.imageStates = imageStates;
    }

    public ImageView getCurrentImage() {
        return currentImage;
    }

    public void setCurrentImage(ImageView currentImage) {
        this.currentImage = currentImage;
    }

    public double getInitialX() {
        return initialX;
    }

    public void setInitialX(double initialX) {
        this.initialX = initialX;
    }

    public double getInitialY() {
        return initialY;
    }

    public void setInitialY(double initialY) {
        this.initialY = initialY;
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }
}
