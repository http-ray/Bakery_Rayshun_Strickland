package Homework_Bakery;

public class Baguette extends Bread {
    private double bulkFermentHours;
    private boolean steamBake;

    public Baguette() {
        super(3.5, 2.3, 1.5, 0.0, 0.0, 0.75,
                "Baguette", "not baked",
                "Mix, short knead, long bulk ferment, shape, proof, score, bake hot with steam.");
        this.bulkFermentHours = 3.0;
        this.steamBake = true;
    }

    public Baguette(double flour, double water, double salt, double sugar,
                    double bakingPowder, double yeast, String breadName,
                    String state, String recipe, double bulkFermentHours, boolean steamBake) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.bulkFermentHours = bulkFermentHours;
        this.steamBake = steamBake;
    }

    public double getBulkFermentHours() { return bulkFermentHours; }
    public void setBulkFermentHours(double bulkFermentHours) { this.bulkFermentHours = bulkFermentHours; }
    public boolean isSteamBake() { return steamBake; }
    public void setSteamBake(boolean steamBake) { this.steamBake = steamBake; }

    @Override
    public String recipe() {
        return "Baguette Method:\n" +
                "1) Mix/knead briefly; bulk " + bulkFermentHours + " hrs with a few folds.\n" +
                "2) Pre-shape, rest, shape into baguettes; proof until puffy.\n" +
                "3) Score; bake 475–500°F " + (steamBake ? "with steam" : "dry") + " for 20–25 min.";
    }
}
