import java.util.ArrayList;
import java.util.List;

public class VideoProject {
    private List<VideoElement> elements = new ArrayList<>();

    public void addElement(VideoElement element) {
        elements.add(element);
    }

    public void accept(VideoVisitor visitor) {
        for (VideoElement element : elements) {
            element.accept(visitor);
        }
    }
}
