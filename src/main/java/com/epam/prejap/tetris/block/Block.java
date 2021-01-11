package com.epam.prejap.tetris.block;

import java.util.Objects;

public abstract class Block {

    final byte[][] image;
    final int rows;
    final int cols;

    Block(byte[][] dots, Color color) {
        rows = dots.length;
        if (dots.length == 0) {
            throw new IllegalArgumentException("Image has height equal to 0");
        }
        cols = dots[0].length;
        image = new byte[rows][cols];
        for (int i = 0; i < dots.length; i++) {
            if (dots[i].length != cols) {
                throw new IllegalArgumentException("Image is not a rectangle");
            }
            for (int j = 0; j < cols; j++) {
                byte dot = dots[i][j];
                if (dot < 0) {
                    throw new IllegalArgumentException("Invalid dot value");
                }

                image[i][j] = dot == 0 ? dot : getColorId(color);
            }
        }
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }

    public byte dotAt(int i, int j) {
        return image[i][j];
    }

    private byte getColorId(Color color) {
        return Objects.requireNonNullElse(color, Color.BLACK).getIdentifier();
    }

}
