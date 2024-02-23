package package2;

import java.util.Scanner;

public class point {
    private double x;
    private double y;
    static int count = 0;
    public point () {
        x = 0;
        y = 0;
        count++;
    }
    public point (double m, double n)
    {
        x = m;
        y = n;
        count++;
    }
    public point(int a)
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter x:");
            x =  s.nextDouble();
            System.out.println("Enter y: ");
            y = s.nextDouble();
        }
        count++;
    }

    public void display()
    {
        System.out.println("x = "+ x + "y= " + y);
     }
        public void Set(double m, double  n)
        {
            x = m;
            y = n;
        }
        public void Distance_From_Origin()
        {
            double result = Math.sqrt(x*x + y*y);
            System.out.println(result);
        }

        public double Distance_between_points(point p)
        {
            double result = Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
            System.out.println(result);
            return result;
        }
    
}
