package com.epam.prejap.tetris.block;

/**
 * @author Dominik Janiga
 * @since 0.6
 */
public enum Color {

    BLACK(30),
    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    MAGENTA(35),
    CYAN(36),
    WHITE(37);

    /**
     * Color identifiers from ANSI escape codes
     *
     * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     * @since 0.6
     */
    private final int colorId;

    Color(int colorId) {
        this.colorId =  colorId;
    }

    public byte getIdentifier() {
        return (byte) colorId;
    }
}
