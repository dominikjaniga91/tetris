package com.epam.prejap.tetris.game;

import com.epam.prejap.tetris.block.Color;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = "Color")
public class PainterTest {

    @Test(dataProvider = "colors")
    public void shouldReturnAppropriateByteArray_afterPaintString(Color color) {
        //given
        int colorId = color.getIdentifier();
        String escape =  "\u001B[";
        String finalByte = "m";
        String resetColor = escape + "0" + finalByte;
        String blockMark = "#";
        String expected = escape + colorId + finalByte + blockMark + resetColor;

        //when
        String actual = Painter.paint(blockMark, colorId);

        //then
        assertEquals(actual, expected);
    }

    @DataProvider
    private Object[] colors() {
        return new Object[]{
                Color.BLACK,
                Color.RED,
                Color.GREEN,
                Color.YELLOW,
                Color.BLUE,
                Color.MAGENTA,
                Color.CYAN,
                Color.WHITE,
        };
    }
}
