package com.epam.prejap.tetris.game;

/**
 * Class used to colour string character
 *
 * @author Dominik Janiga
 * @version 0.2
 * @since 0.2
 */
final class Painter {

    private static final String ESCAPE = "\u001B[";
    private static final String FINAL_BYTE = "m";
    private static final String RESET_COLOR = ESCAPE + "0" + FINAL_BYTE;

    /**
     * Set up background color to empty string using Control Sequence Introducer
     * from ANSI escape codes
     *
     * @param colorId color identifier from ANSI
     * @return painted empty string
     * @since 0.2
     * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     */
    static String paint(int colorId) {
        return ESCAPE + colorId + FINAL_BYTE + " " + RESET_COLOR;
    }
}
