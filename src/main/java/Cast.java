import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cast {

    private final List<Actor> CURRENT_CAST;

    public Cast() {
        CURRENT_CAST = new ArrayList<>();
    }

    public List<Actor> getCurrentCast() {
        return CURRENT_CAST;
    }
    public void addCurrentCast(Actor... actors) {
        if (actors.length > 1) {
            CURRENT_CAST.addAll(Arrays.asList(actors));
        } else {
            CURRENT_CAST.add(actors[0]);
        }
    }
    public void removeCurrentCast(Actor... actors) {
        CURRENT_CAST.removeAll(Arrays.asList(actors));
    }
    public void resetCurrentCast() {
        CURRENT_CAST.clear();
    }
}
