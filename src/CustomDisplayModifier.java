import interfaces.DisplayModifier;

public class CustomDisplayModifier implements DisplayModifier {

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
