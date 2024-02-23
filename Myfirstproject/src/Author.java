public class Author {
    public String name;
    public int yearBorn;  
    public int passYear;

    public Author(int yBorn, String n)
    {
        this.yearBorn = yBorn;
        this.name = n;
    }

    public void setPassYear(int year)
    {
        this.passYear = year;
    }

    public String getName()
    {
      return name;
    }

    public int getAge()
    {
        return this.passYear - yearBorn;
    }

}
