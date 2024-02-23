import java.util.TreeSet;

public class Runner{


    public static void main(String[] args) {
        
    }

    public Drink drinkWithTheMostIngredients(TreeSet<Drink> drink)
    {
        Drink cnt = new Drink("fanta", "coca-cola", EnumerationType.SPARKLING);

        Tea nice = new Tea("Lipton Black tea", "Lipton", EnumerationType.STILL);

        TreeSet<Drink> drinkname = new TreeSet<Drink>();
        drinkname.add(new Drink("Fan","coca-cola"));
        drinkname.add(new Drink("Coke","coca-cola"));
        drinkname.add(new Drink("Sprite","coca-cola"));
        drinkname.add(new Drink("7up","ashwork"));
        drinkname.add(new Drink("Pepsi","ashwork"));

        for (Drink drin : drinkname) {
            System.out.println(drin.getName());
        }
        return cnt;
    }
}