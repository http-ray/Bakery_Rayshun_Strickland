BreadLab – ITEC 2150 Lab
============================

Class Design
------------
1. Bread (Superclass)
    - Instance Variables: flour, water, salt, sugar, bakingPowder, yeast,
      breadName, state, recipe
    - Constructors:
      • Default constructor (general bread recipe)
      • Full constructor (all parameters)
    - Methods:
      • Getters and setters
      • toString()
      • getIngredients() – returns all ingredients as a formatted string
      • recipe() – returns recipe steps
      • bake() – changes state from "not baked" to "baked", or prints a warning if already baked

2. SourdoughBread (Subclass)
    - Unique Vars: starter, proofHours
    - Overrides recipe() and getIngredients()

3. Pastry (Subclass)
    - Unique Vars: butter, milk
    - Overrides recipe() and getIngredients()

4. Muffin (Subclass)
    - Unique Vars: eggs, butter, milk
    - Overrides recipe() and getIngredients()

5. Baguette (Subclass)
    - Unique Vars: bulkFermentHours, steamBake (boolean)
    - Overrides recipe()

6. BananaBread (Subclass)
    - Unique Vars: bananas, eggs, butter
    - Overrides recipe() and getIngredients()

7. BakeryApp (Main Class)
    - Creates instances of each subclass
    - Prints name, ingredients, and recipe
    - Calls bake() twice to demonstrate state handling

Expected Output
---------------
For each bread type:
- Prints bread name
- Displays ingredient list
- Displays recipe instructions
- Calls bake(): first time → "Bread is baked now", second time → "Can't bake, already baked."

Notes
-----
- The Bread superclass includes general variables for all breads.
- Some ingredients may appear as 0.00 if not used by that subclass (e.g., yeast in Pastry).
- Subclasses can override getIngredients() to hide unused fields.

Author
------
Rayshun Strickland

ITEC 2150 – Fall 2025
