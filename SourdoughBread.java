package Homework_Bakery;

public class SourdoughBread extends Bread {
    private double starter;    // cups
    private double proofHours; // hours total

    public SourdoughBread() {
        super(3.0, 2.1, 1.5, 0.0, 0.0, 0.0,
                "Sourdough Bread", "not baked",
                "Autolyse, mix with starter/salt, bulk with folds, shape, cold proof, bake 475°F in Dutch oven.");
        this.starter = 1.5;
        this.proofHours = 16.0;
    }

    public SourdoughBread(double flour, double water, double salt, double sugar,
                          double bakingPowder, double yeast, String breadName,
                          String state, String recipe, double starter, double proofHours) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.starter = starter;
        this.proofHours = proofHours;
    }

    public double getStarter() { return starter; }
    public void setStarter(double starter) { this.starter = starter; }
    public double getProofHours() { return proofHours; }
    public void setProofHours(double proofHours) { this.proofHours = proofHours; }

    @Override
    public String getIngredients() {
        return super.getIngredients() +
                String.format("\n%.2f cup(s) sourdough starter", starter);
    }

    @Override
    public String recipe() {
        return "Sourdough Method:\n" +
                "1) Autolyse flour+water 30–60 min.\n" +
                "2) Add starter+salt, mix.\n" +
                "3) Bulk ferment " + proofHours + " hrs with periodic folds.\n" +
                "4) Shape, cold proof 8–12 hrs.\n" +
                "5) Bake 475°F: 20 min covered, 20–25 min uncovered.";
    }
}
