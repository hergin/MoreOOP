import interfaces.DisplayModifier;

public class CustomDisplayModifier implements DisplayModifier {


    @java.lang.Override
    public boolean isBorderEnabled() {
        return false;
    }

    @java.lang.Override
    public int getBorderWidth() {
        return 0;
    }

    @java.lang.Override
    public boolean addVerticalSpace() {
        return false;
    }
}
