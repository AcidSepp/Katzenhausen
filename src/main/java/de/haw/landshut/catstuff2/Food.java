package de.haw.landshut.catstuff2;

public abstract class Food {

    private final int nutrition;

    public Food(final int nutrition) {
        this.nutrition = nutrition;
    }

    public int getNutrition() {
        return nutrition;
    }
}
