package de.haw.landshut;

public enum CatFood {
    WISH_WISH(true),
    CAT_NIP(true),
    CAN_CAT(false),
    MOIST(false);

    private final boolean isDry;

    CatFood(boolean isDry) {
        this.isDry = isDry;
    }

    public boolean isDry() {
        return isDry;
    }
}
