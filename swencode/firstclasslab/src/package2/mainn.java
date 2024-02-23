package package2;

public class mainn {
    public static void main(String[] args) {
        point p1 = new point(5,10);
        point p2 = new point();
        point p3 = new point(0);

        p1.display();
        p2.display();
        p3.display();
        p3.Distance_From_Origin();
        p3.Distance_between_points(p1);

        line line1 = new line(3,4,-3,-4);
        line1.Display();
    }
    
}
