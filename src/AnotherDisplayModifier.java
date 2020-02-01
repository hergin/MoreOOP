import interfaces.DisplayModifier;

public class AnotherDisplayModifier implements DisplayModifier {

    //Add unimplemented methods to make IDE happy

    @Override
    public boolean isBorderEnabled() {  //Border enabled returns true
        return true;
    }

    @Override
    public int getBorderWidth() {  //Border width is 25
        return 25;
    }

    @Override
    public boolean addVerticalSpace() {  //Add vertical space returns true
        return true;
    }

}
