package interfaces;

public interface DisplayModifier {

    /**
     * Draws a border on the first and the last line if enabled!
     *
     * @return
     */
    boolean isBorderEnabled();

    /**
     * The number of characters while printing the borders.
     *
     * @return
     */
    int getBorderWidth();

    /**
     * Adds extra lines in between each line if enabled!
     *
     * @return
     */
    boolean addVerticalSpace();

}
