package com.epam.prejap.tetris.game;

/**
 * Colour string character
 *
 * @author      Dominik Janiga
 * @since       0.6
 */
final class Painter {

    private static final String ESCAPE = "\u001B[";
    private static final String FINAL_BYTE = "m";
    private static final String RESET_COLOR = ESCAPE + "0" + FINAL_BYTE;

    /**
     * Set up color to string using Control Sequence Introducer from ANSI escape codes
     *
     * @param colorId   color identifier from ANSI
     * @return          painted block sign string
     * @since           0.6
     * @see             <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     */
    static String paint(String blockSign, int colorId) {
        return ESCAPE + colorId + FINAL_BYTE + blockSign + RESET_COLOR;
    }
}