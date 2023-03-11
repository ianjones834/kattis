import java.util.ArrayList;

public class Polygon {
  private ArrayList<Point> points;

  Polygon() {
    this.points = new ArrayList<Point>();
  }

  public void addPoint(Point point) {
    this.points.add(point);
    return;
  }

  public double getArea() {
    int sum = 0;

    for (int i = 1; i < points.size(); i++) {
      sum += (points.get(i - 1).getX() * points.get(i).getY()) - (points.get(i - 1).getY() * points.get(i).getX());
    }

    sum += (points.get(points.size() - 1).getX() * points.get(0).getY()) - (points.get(0).getX() * points.get(points.size() - 1).getY());

    return sum / 2.0;
  }
}