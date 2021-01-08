package com.epam.prejap.tetris.block;

enum Color {

    BLACK(40),
    RED(41),
    GREEN(42),
    YELLOW(43),
    BLUE(44),
    MAGENTA(45),
    CYAN(46),
    WHITE(47);

    /**
     * Color identifier from ANSI escape codes
     * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     */
    private final byte identifier;

    Color(int identifier) {
        this.identifier = (byte) identifier;
    }

    byte getIdentifier() {
        return identifier;
    }
}
