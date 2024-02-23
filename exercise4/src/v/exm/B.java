package v.exm;

import vm.exm.A;

public class B extends A{
    public int a ;
    private int p;

    public B(int x1, int x2, int x3, int x4, int x5)
    {
        super(x1,x2);
        this.a = x3;
        c = x4;
        this.p =x5;
        System.out.println("B is created");
    }
    public void showd()
    {
System.out.println("d = " + d);
    }
    public void showa()
    {
System.out.println("a= " + a + " " + super.a);
    }
    
}