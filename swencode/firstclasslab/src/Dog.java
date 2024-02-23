import javax.swing.*;

public class Dog {
    public int age;
    public String breed;
    public String name;

    public Dog(int a, String b)
    {
        this.age = a;
        this.breed = b;
    }
    public Dog(String breed, int age)
    {
        this.breed = breed;
        this.age = age;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public void bark()
    {
        String woof = "WOOF, WOOF";
       JOptionPane.showMessageDialog(null, woof);
    }
}
