package Homework_Bakery;

public class Pastry extends Bread {
    private double butter; // cups
    private double milk;   // cups

    public Pastry() {
        super(2.0, 0.5, 1.0, 0.33, 0.0, 0.0,
                "Pastry", "not baked",
                "Cut cold butter into flour; add sugar, milk, salt. Fold, chill, shape, bake 375°F 20–25 min.");
        this.butter = 0.5;
        this.milk = 0.5;
    }

    public Pastry(double flour, double water, double salt, double sugar,
                  double bakingPowder, double yeast, String breadName,
                  String state, String recipe, double butter, double milk) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.butter = butter;
        this.milk = milk;
    }

    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }
    public double getMilk() { return milk; }
    public void setMilk(double milk) { this.milk = milk; }

    @Override
    public String getIngredients() {
        return super.getIngredients() +
                String.format("\n%.2f cups cold butter\n%.2f cups milk", butter, milk);
    }

    @Override
    public String recipe() {
        return "Pastry Method:\n" +
                "1) Whisk dry; cut in cold butter to pea-sized.\n" +
                "2) Add milk/water to combine. Fold for layers.\n" +
                "3) Chill 30+ min, roll, shape.\n" +
                "4) Bake 375°F for 20–25 min.";
    }
}
