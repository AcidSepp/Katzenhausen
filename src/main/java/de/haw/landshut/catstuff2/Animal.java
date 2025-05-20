package de.haw.landshut.catstuff2;

public abstract class Animal implements Updateable, Stateful {

    protected int nutrition;
    private boolean isAlive;

    public Animal(final int nutrition) {
        this.nutrition = nutrition;
        this.isAlive = true;
    }

    public int getNutrition() {
        return nutrition;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void update() {
        if (nutrition > 0) {
            isAlive = false;
        }
    }
}
