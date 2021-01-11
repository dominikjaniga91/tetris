package com.epam.prejap.tetris.block;

public enum Color {

    BLACK(30),
    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(33),
    MAGENTA(35),
    CYAN(36),
    WHITE(37);

    /**
     * Color identifier from ANSI escape codes
     * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     */
    private final int colorId;
    private final int backgroundColorId;

    Color(int colorId) {
        this.colorId =  colorId;
        this.backgroundColorId = this.colorId +  10;
    }

    byte getIdentifier() {
        return (byte) colorId;
    }

    public String paint(String blockMark) {

        String escape =  "\u001B[";
        String finalByte = "m";
        String breakSign = ";";
        String resetColor = escape + "0" + finalByte;
        return escape + colorId + breakSign + backgroundColorId + finalByte + blockMark + resetColor;
    }
}
