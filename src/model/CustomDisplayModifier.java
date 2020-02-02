package model;

import interfaces.DisplayModifier;

public class CustomDisplayModifier implements DisplayModifier
{
    //add variables?


    public boolean isBorderEnabled()
    {
        return false;
    }

    public int getBorderWidth()
    {
        return 0;
    }

    public boolean addVerticalSpace()
    {
        return false;
    }
}
