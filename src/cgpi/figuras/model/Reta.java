package cgpi.figuras.model;

import javafx.geometry.Point2D;

/**
 * @author vitor.alves
 */
public class Reta extends Figura {

    private static final String POINTO_A = "A";

    private static final String POINTO_B = "B";

    public Reta(Point2D pointA, Point2D pointB) {
        this.addPoint(POINTO_A, pointA);
        this.addPoint(POINTO_B, pointB);
    }

    public Point2D getPointA() {
        return this.getPoint(POINTO_A);
    }

    public Point2D getPointB() {
        return this.getPoint(POINTO_B);
    }

    public double[] getPointACoordinates() {
        return new double[]{this.getPointA().getX(), this.getPointA().getY()};
    }

    public double[] getPointBCoordinates() {
        return new double[]{this.getPointB().getX(), this.getPointB().getY()};
    }
}