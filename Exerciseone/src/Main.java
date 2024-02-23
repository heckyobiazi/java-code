import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        
     Dog newdog = new Dog("Robin", 2);
     newdog.setBreed("Border Collie");
     newdog.setisMammal(true);
     newdog.getAll();

    Animal newanimal = new Animal("Besty", 6);
    newanimal.setBreed("Bengal Cart");
    newanimal.setisMammal(true);
    
    JOptionPane.showMessageDialog(null, newanimal.name + " " + newanimal.age + " " + newanimal.breed + " " + newanimal.isMamal);

    }
}