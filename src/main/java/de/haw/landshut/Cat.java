package de.haw.landshut;

import de.haw.landshut.topsecret.CatColor;

import java.util.Objects;

/**
 * This class represents a real life cat. Everyone knows what a cat is.
 */
public class Cat {

    /**
     * The name of the cat, must not be null or blank.
     */
    private String name;
    private int age;
    private CatColor catColor;
    private CatFood favouriteFood;

    /**
     * Creates a cat
     * @param name the name of the cat
     * @param age the age of the cat
     * @param catColor the {@link CatColor}
     * @param favouriteFood the preferred {@link CatFood}
     */
    public Cat(String name, int age, CatColor catColor, CatFood favouriteFood) {
        this.name = name;
        this.age = age;
        this.catColor = catColor;
        this.favouriteFood = favouriteFood;
    }

    /**
     * This deeply copies a cat.
     * @param other the cat to copy.
     */
    public Cat(Cat other) {
        this(other.getName(), other.getAge(), new CatColor(other.getCatColor()), other.getFavouriteFood());
    }

    public void meow() {
        System.out.println(name + " meows!");
    }

    public void birthday() {
        age++;
    }

    public void rename(String newName) {
        if (newName == null) {
            return;
        }
        if (newName.isBlank()) {
            return;
        }
        name = newName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", catColor=" + catColor +
                ", favouriteFood=" + favouriteFood +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CatColor getCatColor() {
        return catColor;
    }

    public CatFood getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(final CatFood favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        final var otherAsCat = (Cat) other;

        if (!Objects.equals(name, otherAsCat.name)) {
            return false;
        }

        if (age != otherAsCat.getAge()) {
            return false;
        }

        if (!Objects.equals(favouriteFood, otherAsCat.getFavouriteFood())) {
            return false;
        }

        if (!Objects.equals(catColor, otherAsCat.getCatColor()))  {
            return false;
        }

        return true;
    }
}
