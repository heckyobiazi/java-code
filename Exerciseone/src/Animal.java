public class Animal
{
    protected String breed;
    protected int age;
    protected String name;
    protected boolean isMamal = true;

    public Animal()
    {

    }

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setBreed(String value)
    {
        this.breed = value;
    }

    public void setisMammal(boolean value)
    {
        this.isMamal = value;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getBreed()
    {
        return breed;
    }

    public boolean getisMamal()
    {
        return isMamal;
    }

}