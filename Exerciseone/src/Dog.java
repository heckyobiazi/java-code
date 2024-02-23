import javax.swing.*;


public class Dog extends Animal{

    private String breed;
    private String name;
    private int age;

    public Dog()
    {

    }

    public Dog(String name, int age)
    {
      super(name,age);
     this.name = name;
     this.age = age;
    }

    public void getAll()
    {
        JOptionPane.showMessageDialog(null, name + " " + age + " " + getBreed() + " " + getisMamal());
    }
}