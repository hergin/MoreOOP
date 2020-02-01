import interfaces.DisplayModifier;

public class CustomDisplayModifier implements DisplayModifier {

    //Add unimplemented methods to make IDE happy

    @Override
    public boolean isBorderEnabled() {  //Border enabled returns false
        return false;
    }

    @Override
    public int getBorderWidth() {  //Border width is 0
        return 0;
    }

    @Override
    public boolean addVerticalSpace() {  //Add vertical space returns false
        return false;
    }
}


