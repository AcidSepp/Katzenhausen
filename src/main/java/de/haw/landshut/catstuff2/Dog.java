package de.haw.landshut.catstuff2;

public class Dog extends Animal implements CatFoodEater, DogFoodEater, HumanFoodEater {

    public Dog(final int nutrition) {
        super(nutrition);
    }

    @Override
    public String getStatus() {
        if (!isAlive()) {
            return "BARK!!!";
        }
        if (nutrition >= 0) {
            return "BARK!!! I am hungry!!!";
        }
        return "I am happy! BARK!";
    }

    @Override
    public void eat(final CatFood catFood) {
        nutrition += catFood.getNutrition();
    }

    @Override
    public void eat(final DogFood dogFood) {
        nutrition += dogFood.getNutrition();

    }

    @Override
    public void eat(final HumanFood humanFood) {
        nutrition += humanFood.getNutrition();
    }
}
