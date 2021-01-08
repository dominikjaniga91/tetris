package com.epam.prejap.tetris.block;

/**
 *
 * @author Dominik Janiga
 * @version 0.2
 * @since 0.2
 */
public final class ColorPicker {

    /**
     * Pick specific color identifier for each block type
     *
     * @param block instance of specific game's block
     * @return Color identifier from ANSI escape codes
     * @since 0.2
     * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI Escape codes</a>
     */
    public static byte pick(Block block) {

        Color color = Color.BLACK;

        if(block instanceof OBlock) {
            color = Color.RED;
        } else if (block instanceof LBlock) {
            color = Color.GREEN;
        }
        return color.getIdentifier();
    }


}
