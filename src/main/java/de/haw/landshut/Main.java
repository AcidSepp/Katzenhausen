package de.haw.landshut;

import de.haw.landshut.topsecret.CatColor;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        final var boris1 = new Cat("boris", 4, new CatColor(Color.WHITE), CatFood.WISH_WISH);
        final var boris2 = new Cat("boris", 4, new CatColor(Color.WHITE, Color.BLACK), CatFood.WISH_WISH);
        final var boris3 = new Cat("boris", 4, new CatColor(Color.WHITE, Color.BLACK), CatFood.WISH_WISH);
        final var boris4 = new Cat("boris", 4, new CatColor(Color.WHITE, Color.BLACK), CatFood.WISH_WISH);
        final var boris5 = new Cat("boris", 4, new CatColor(Color.WHITE, Color.BLACK), CatFood.WISH_WISH);
        final var boris6 = new Cat("boris", 4, new CatColor(Color.WHITE, Color.BLACK), CatFood.WISH_WISH);

        final var objects = new LinkedList<Cat>();


        objects.add(boris1);
        objects.add(boris2);
        objects.add(boris3);
        objects.add(boris4);
        objects.add(boris5);
        objects.add(boris6);
        objects.add(new Cat("boris", 4, new CatColor(Color.WHITE, Color.BLACK), CatFood.WISH_WISH));

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }

        for (final var object : objects) {
            System.out.println(object);
        }
    }
}