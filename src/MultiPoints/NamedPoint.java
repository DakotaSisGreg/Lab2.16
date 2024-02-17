package MultiPoints;

import java.awt.*;

public class NamedPoint extends Point {

    String redPoint;




    // *** make the Point sp


    public NamedPoint(double x, double y, String redPoint) {
        super((int) x, (int) y);
        this.redPoint = redPoint;
    }

    @Override
    public String toString() {

        return "Point " + redPoint + ": (" + getX() + "," + getY() + ")";
    }

}
