import io.jbotsim.core.Point;

public class MyWayPointNode extends WaypointNode {
    @Override
    public void onStart() {
        Point p1 = new Point(72, 68);
        this.addDestination(p1);
        Point p2 = new Point(372, 68);
        this.addDestination(p2);
    }
}
