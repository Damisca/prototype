import javafx.animation.AnimationTimer;

public class RunLoop extends AnimationTimer {

    private Prototype application;

    public RunLoop(Prototype prototype) {
        this.application = prototype;
    }

    @Override
    public void handle(long now) {

        for (Level l : application.levelList) {
            l.updateLevel(application.isLeft(), application.isRight());
        }
    }
}
