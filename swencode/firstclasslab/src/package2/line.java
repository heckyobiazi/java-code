package package2;



public class line {
    private point p1, p2;
    private double length;
    public line (double x1, double y1, double x2, double y2)
    {
        p1 = new point(x1, y1);
        p2 = new point(x2, y2);
        length = p1.Distance_between_points(p2);
    }

    public void Display()
    {
        p1.display();
        p2.display();
        System.out.println("length = " + length);
    }
    
}
