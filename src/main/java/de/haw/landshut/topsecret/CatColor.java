package de.haw.landshut.topsecret;

import de.haw.landshut.Color;

public class CatColor {

    private Color primaryColor;
    private Color secondaryColor;
    private Color tertiaryColor;

    public CatColor(Color primaryColor, Color secondaryColor, Color tertiaryColor) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.tertiaryColor = tertiaryColor;
    }

    public CatColor(Color primaryColor, Color secondaryColor) {
        this(primaryColor, primaryColor, secondaryColor);
    }

    public CatColor(Color primaryColor) {
        this(primaryColor, primaryColor, primaryColor);
    }

    public CatColor(CatColor other) {
        this(other.getPrimaryColor(), other.getSecondaryColor(), other.getTertiaryColor());
    }

    public Color getPrimaryColor() {
        return primaryColor;
    }

    public Color getSecondaryColor() {
        return secondaryColor;
    }

    public Color getTertiaryColor() {
        return tertiaryColor;
    }

    public boolean isOneColor() {
        return primaryColor == secondaryColor && secondaryColor == tertiaryColor;
    }

    public boolean isTwoColor() {
        if (isOneColor()) {
            return false;
        }
        return primaryColor == secondaryColor || primaryColor == tertiaryColor || secondaryColor == tertiaryColor;
    }

    public boolean isThreeColor() {
        return primaryColor != secondaryColor && secondaryColor != tertiaryColor;
    }

    public void setPrimaryColor(final Color primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setSecondaryColor(final Color secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public void setTertiaryColor(final Color tertiaryColor) {
        this.tertiaryColor = tertiaryColor;
    }

    @Override
    public String toString() {
        if (isOneColor()) {
            return primaryColor.toString();
        }
        if (isTwoColor()) {
            return "primary: " + primaryColor.toString() + " secondary: " + secondaryColor.toString();
        }
        return "primary: " + primaryColor.toString() + " secondary: " + secondaryColor.toString() + " tertiary: " + tertiaryColor.toString();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final var otherCatColor = (CatColor) obj;

        if (this.primaryColor != otherCatColor.getPrimaryColor()) {
            return false;
        }

        if (this.secondaryColor != otherCatColor.getSecondaryColor()) {
            return false;
        }

        if (this.tertiaryColor != otherCatColor.getTertiaryColor()) {
            return false;
        }
        return true;
    }
}
