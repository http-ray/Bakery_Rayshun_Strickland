package Homework_Bakery;

public class Muffin extends Bread {
    private int eggs;
    private double butter; // cups, melted
    private double milk;   // cups

    public Muffin() {
        super(2.0, 0.75, 0.5, 0.5, 2.0, 0.0,
                "Muffins", "not baked",
                "Dry bowl + wet bowl; combine; portion into tins; bake 375°F 18–22 min.");
        this.eggs = 2;
        this.butter = 0.5;
        this.milk = 1.0;
    }

    public Muffin(double flour, double water, double salt, double sugar,
                  double bakingPowder, double yeast, String breadName,
                  String state, String recipe, int eggs, double butter, double milk) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.eggs = eggs;
        this.butter = butter;
        this.milk = milk;
    }

    public int getEggs() { return eggs; }
    public void setEggs(int eggs) { this.eggs = eggs; }
    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }
    public double getMilk() { return milk; }
    public void setMilk(double milk) { this.milk = milk; }

    @Override
    public String getIngredients() {
        return super.getIngredients() +
                String.format("\n%d egg(s)\n%.2f cups melted butter\n%.2f cups milk", eggs, butter, milk);
    }

    @Override
    public String recipe() {
        return "Muffin Method:\n" +
                "1) Dry: flour, sugar, salt, baking powder.\n" +
                "2) Wet: milk, eggs, melted butter.\n" +
                "3) Combine until just mixed; fill tins 3/4.\n" +
                "4) Bake 375°F for 18–22 min.";
    }
}
