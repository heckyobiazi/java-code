package realpackage;

public class Feecalc{
    private int home = 600;
    private int international = 2000;
    private String Fname;
    private int numberofcourses = 0;
    private double TotalFee = 0;
    private boolean ishome = false;


    public Feecalc(String Fname, int numberofcourses, boolean ishome)
    {
        this.Fname = Fname;
        this.numberofcourses = numberofcourses;
        this.ishome = ishome;
    }

    public double CalculateTotalFee()
    {
        int pricepeercourse = 0;

        if(this.ishome)
        {
            pricepeercourse = home;
        }
        else
        {
            pricepeercourse = international;
        }

        TotalFee = pricepeercourse * numberofcourses;

        return TotalFee;
    }
}