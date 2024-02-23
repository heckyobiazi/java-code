package vm.exm;

 public class A
    {
        public int a;
        private int b;
        protected int c;
        public static int d =0 ;
        public A(int m, int n)
        {
            a = m;
            b = n;
            System.out.println("A is created");
            d++;
        }
        public void showb()
        {
            System.out.println("b = " + b);

    }
}
 