package model;

import interfaces.DisplayModifier;

public class AnotherDisplayModifier implements DisplayModifier {


    @Override
    public boolean isBorderEnabled() {
        return true;
    }

    @Override
    public int getBorderWidth() {
        return 25;
    }

    @Override
    public boolean addVerticalSpace() {
        return true;
    }
}
