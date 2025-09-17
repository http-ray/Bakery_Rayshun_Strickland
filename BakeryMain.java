package Homework_Bakery;

public class BakeryMain {
    public static void main(String[] args) {
        Bread generic = new Bread();
        SourdoughBread sourdough = new SourdoughBread();
        Pastry pastry = new Pastry();
        Muffin muffin = new Muffin();
        Baguette baguette = new Baguette();
        BananaBread banana = new BananaBread();

        Bread[] menu = { generic, sourdough, pastry, muffin, baguette, banana };

        for (Bread b : menu) {
            System.out.println("\n" + b.getBreadName());
            System.out.println(b.getIngredients());
            System.out.println("\nRecipe of " + b.getBreadName() + ":\n" + b.recipe());
            b.bake();
            b.bake(); // demonstrate "already baked"
        }
    }
}
