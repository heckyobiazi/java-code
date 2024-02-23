import java.util.ArrayList;

public class Drink implements BrandedElemet{

    private String name;
    private String brand;
    private EnumerationType drinktype ; 
    private ArrayList<String> ingredients = new ArrayList<String>();

    public Drink(String n, String bra)
    {
        this.name = n;
        this.brand = bra;
    }

    public Drink(String naming, String bran, EnumerationType drinkty)
    {
        this.name = naming;
        this.brand = bran;
        this.drinktype = drinkty;
    }

    public void addIngredient(String ing)
    {
         ingredients.add(ing);
    }

    public void removeIngredients(String ing)
    {
        ingredients.remove(ing);
    }

    public String getName()
    {
        return name;
    }

    public EnumerationType getDrinkType()
    {
        return drinktype;
    }

    public String getbrand()
    {
        return brand;
    }

    public ArrayList<String> getIngredients()
    {
        return ingredients;
    }

    public String toString()
    {
        return "Drink [ name = " + this.getName() + "; drinkType = " + this.getDrinkType() + "; brand = " + this.getBrand() + "; ingredients = " + this.getIngredients();
    }

    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return brand;
    }
}