
public class Tea extends Drink {
    private Boolean withCoffein;
    


    public Tea(String name, String brand, EnumerationType drinkType)
    {
        
        super(name,brand,drinkType);
        name = super.getName();
        drinkType = EnumerationType.STILL;
        
    }

    public String setWithCoffein()
    {
         return "with coffein";
    }

    public String setWithoutCoffein()
    {
        return "without coffein";
    }

    public boolean isWithCoffein()
    { 
       
         return withCoffein; 
         
    }


    @Override
    public void removeIngredients(String ing)
    {
        super.removeIngredients(ing);
        getIngredients().remove(ing);
    }

    public String toString()
    {
        if(isWithCoffein())
        {
        return "Tea [ name = " + this.getName() + "; drinkType = " + this.getDrinkType() + "; brand = " + this.getBrand() + "; ingredients = " + this.getIngredients() + "]" + setWithCoffein(); 
        }
        if(!isWithCoffein())
        {
        return "Tea [ name = " + this.getName() + "; drinkType = " + this.getDrinkType() + "; brand = " + this.getBrand() + "; ingredients = " + this.getIngredients() + "]" + setWithoutCoffein();
        }
        return "Tea [ name = " + this.getName() + "; drinkType = " + this.getDrinkType() + "; brand = " + this.getBrand() + "; ingredients = " + this.getIngredients() + "]" + setWithCoffein() 
        + "Tea [ name = " + this.getName() + "; drinkType = " + this.getDrinkType() + "; brand = " + this.getBrand() + "; ingredients = " + this.getIngredients() + "]" + setWithoutCoffein();
}
}
