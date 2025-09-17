package Homework_Bakery;

public class BananaBread extends Bread {
    private int bananas;   // count
    private int eggs;      // count
    private double butter; // cups, melted

    public BananaBread() {
        super(2.0, 0.25, 0.5, 0.5, 1.0, 0.0,
                "Banana Bread", "not baked",
                "Mash bananas, whisk with eggs & melted butter; fold into dry; bake 350°F 55–65 min.");
        this.bananas = 3;
        this.eggs = 2;
        this.butter = 0.5;
    }

    public BananaBread(double flour, double water, double salt, double sugar,
                       double bakingPowder, double yeast, String breadName,
                       String state, String recipe, int bananas, int eggs, double butter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.bananas = bananas;
        this.eggs = eggs;
        this.butter = butter;
    }

    public int getBananas() { return bananas; }
    public void setBananas(int bananas) { this.bananas = bananas; }
    public int getEggs() { return eggs; }
    public void setEggs(int eggs) { this.eggs = eggs; }
    public double getButter() { return butter; }
    public void setButter(double butter) { this.butter = butter; }

    @Override
    public String getIngredients() {
        return super.getIngredients() +
                String.format("\n%d ripe banana(s)\n%d egg(s)\n%.2f cups melted butter", bananas, eggs, butter);
    }

    @Override
    public String recipe() {
        return "Banana Bread Method:\n" +
                "1) Mash bananas; whisk in eggs and melted butter.\n" +
                "2) Stir into dry until just combined.\n" +
                "3) Bake 350°F in greased loaf pan 55–65 min (toothpick clean).";
    }
}
