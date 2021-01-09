package com.epam.prejap.tetris.game;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = "Color")
public class PainterTest {

    @Test(dataProvider = "getColorId")
    public void shouldReturnAppropriateByteArray_afterPaintString(int colorId) {
        //given
        String expected = "\u001B[" + colorId + "m \u001B[0m";

        //when
        String actual = Painter.paint(" ", colorId);

        //then
        assertEquals(actual, expected);
    }

    @DataProvider
    private Object[] getColorId() {
        return new Object[]{ 40, 41, 42, 43, 44, 45, };
    }
}
