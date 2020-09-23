import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args){
        Topology tp = new Topology();
        tp.setDefaultNodeModel(MyWayPointNode.class);
        tp.setTimeUnit(5);
        new JViewer(tp);
        tp.start();
    }
}
