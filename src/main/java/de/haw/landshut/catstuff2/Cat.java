package de.haw.landshut.catstuff2;

public class Cat extends Animal implements CatFoodEater{
    public Cat(final int nutrition) {
        super(nutrition);
    }

    @Override
    public String getStatus() {
        if (isAlive()) {
            return "I am bored!";
        } else {
            return "I have 6 lives left anyway";
        }
    }

    @Override
    public void eat(final CatFood catFood) {
        nutrition += catFood.getNutrition();
    }
}
