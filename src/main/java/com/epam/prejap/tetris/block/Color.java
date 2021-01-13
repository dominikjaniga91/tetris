package com.epam.prejap.tetris.block;

/**
 * @author Dominik Janiga
 * @since 0.6
 */
public enum Color {

    BLACK(1, 30),
    RED(2, 31),
    GREEN(3, 32),
    YELLOW(4, 33),
    BLUE(5, 34),
    MAGENTA(6, 35),
    CYAN(7, 36),
    WHITE(8, 37);

    /**
     * Color identifiers from ANSI escape codes
     *
     * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     * @since 0.6
     */
    private final int colorId;
    private final int ansiCode;

    Color(int colorId, int ansiCode) {
        this.colorId =  colorId;
        this.ansiCode =  ansiCode;
    }

    public byte getId() {
        return (byte) colorId;
    }



    /**
     * Set up color to string using Control Sequence Introducer from ANSI escape codes
     *
     * @param blockMark the mark that represent block on the game field
     * @return          painted block's mark string
     * @since           0.6
     * @see             <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     */
    String applyFor(String blockMark) {
        String escape = "\u001B[";
        String finalByte = "m";
        String resetColor = escape + "0" + finalByte;
        return escape + ansiCode + finalByte + blockMark + resetColor;
    }


}
