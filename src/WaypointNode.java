import io.jbotsim.core.Node;
import io.jbotsim.core.Point;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WaypointNode extends Node {
    private double speed = 1;
    private Queue<Point> destinations = new LinkedList<>();

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {

        this.speed = speed;
    }

    public void addDestination(Point point) {
        destinations.add(point);
    }

    public void onArrival() {}

    @Override
    public void onClock() {
        if (!destinations.isEmpty()) {
            Point p = destinations.element();
            if (distance(p) > speed) {
                setDirection(p);
            } else {
                destinations.remove();
                setLocation(p);
            }
            move(speed);
            wrapLocation();
        }
    }
}
