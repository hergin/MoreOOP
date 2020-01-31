package model;

import interfaces.DisplayModifier;

public class CustomDisplayModifer implements DisplayModifier {
    @Override
    public boolean isBorderEnabled() {
        return false;
    }

    @Override
    public int getBorderWidth() {
        return 0;
    }

    @Override
    public boolean addVerticalSpace() {
        return false;
    }
}
