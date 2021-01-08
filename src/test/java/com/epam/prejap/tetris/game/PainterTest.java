package com.epam.prejap.tetris.game;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = "Color")
public class PainterTest {

    @Test(dataProvider = "colouredStringByteArrays")
    public void shouldReturnAppropriateByteArray_afterPaintString(byte[] expected,  int colorId) {

        //when
        byte[] actual = Painter.paint(colorId).getBytes();

        //then
        assertEquals(actual, expected);
    }

    @DataProvider
    private Object[][] colouredStringByteArrays() {
        byte sign = " ".getBytes()[0];

        return new Object[][]{
                {new byte[]{27, 91, 52, 48, 109, sign, 27, 91, 48, 109},  40},
                {new byte[]{27, 91, 52, 49, 109, sign, 27, 91, 48, 109},  41},
                {new byte[]{27, 91, 52, 50, 109, sign, 27, 91, 48, 109},  42},
                {new byte[]{27, 91, 52, 51, 109, sign, 27, 91, 48, 109},  43},
                {new byte[]{27, 91, 52, 52, 109, sign, 27, 91, 48, 109},  44},
                {new byte[]{27, 91, 52, 53, 109, sign, 27, 91, 48, 109},  45},
        };
    }
}
