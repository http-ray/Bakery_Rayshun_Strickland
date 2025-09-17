package Homework_Bakery;

public class Bread {
    private double flour;        // cups
    private double water;        // cups
    private double salt;         // tsp
    private double sugar;        // tbsp
    private double bakingPowder; // tsp
    private double yeast;        // tsp
    private String breadName;
    private String state;        // "not baked" or "baked"
    private String recipe;

    public Bread() {
        this(2.0, 1.0, 1.0, 0.0, 0.0, 1.0,
                "Generic Bread", "not baked",
                "Mix ingredients, knead 8–10 min, rise 1 hr, shape, proof 30 min, bake 375°F ~30 min.");
    }

    public Bread(double flour, double water, double salt, double sugar,
                 double bakingPowder, double yeast, String breadName,
                 String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    // Getters/Setters
    public double getFlour() { return flour; }
    public void setFlour(double flour) { this.flour = flour; }
    public double getWater() { return water; }
    public void setWater(double water) { this.water = water; }
    public double getSalt() { return salt; }
    public void setSalt(double salt) { this.salt = salt; }
    public double getSugar() { return sugar; }
    public void setSugar(double sugar) { this.sugar = sugar; }
    public double getBakingPowder() { return bakingPowder; }
    public void setBakingPowder(double bakingPowder) { this.bakingPowder = bakingPowder; }
    public double getYeast() { return yeast; }
    public void setYeast(double yeast) { this.yeast = yeast; }
    public String getBreadName() { return breadName; }
    public void setBreadName(String breadName) { this.breadName = breadName; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getRecipeString() { return recipe; }
    public void setRecipeString(String recipe) { this.recipe = recipe; }

    public void bake() {
        if ("baked".equalsIgnoreCase(state)) {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        } else {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        }
    }

    public String getIngredients() {
        return String.format(
                "Ingredients of %s are:\n" +
                        "%.2f cups of flour\n" +
                        "%.2f cups of water\n" +
                        "%.2f tsps of salt\n" +
                        "%.2f tbsps of sugar\n" +
                        "%.2f tsps of baking powder\n" +
                        "%.2f tsps of yeast",
                breadName, flour, water, salt, sugar, bakingPowder, yeast
        );
    }

    public String recipe() { return recipe; }

    @Override
    public String toString() {
        return "Bread{" +
                "name='" + breadName + '\'' +
                ", state='" + state + '\'' +
                ", flour=" + flour +
                ", water=" + water +
                ", salt=" + salt +
                ", sugar=" + sugar +
                ", bakingPowder=" + bakingPowder +
                ", yeast=" + yeast +
                '}';
    }
}
