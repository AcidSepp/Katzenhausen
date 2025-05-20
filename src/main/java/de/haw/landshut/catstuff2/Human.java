package de.haw.landshut.catstuff2;

public class Human extends Animal implements HumanFoodEater{

    public Human(final int nutrition) {
        super(nutrition);
    }

    @Override
    public String getStatus() {
        if (!isAlive()) {
            return "I am dead. *Sad human noises*";
        }
        if (nutrition >= 0) {
            return "I want some food!!! *Sad human noises*";
        }
        return "Now that I am fed, I want some entertainment!";
    }

    @Override
    public void eat(final HumanFood humanFood) {

    }
}
