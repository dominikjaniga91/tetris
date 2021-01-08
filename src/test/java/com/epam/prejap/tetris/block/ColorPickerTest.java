package com.epam.prejap.tetris.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = "Color")
public class ColorPickerTest {

    @Test(dataProvider = "blocksWithColors")
    public void colorPickerShouldReturnAppropriateColor(Block block, Color color) {
        //given
        int expected = color.getIdentifier();

        //when
        int actual = ColorPicker.pick(block);

        //then
        assertEquals(actual, expected, "Inappropriate color identifier ");
    }

    @DataProvider
    private Object[][] blocksWithColors() {
        return new Object[][]{
                {new OBlock(), Color.RED},
                {new LBlock(), Color.GREEN},
                {new IBlock(), Color.BLUE}
        };
    }

    @Test
    public void colorPickerShouldReturnBlackIfBlockDoesNotExist() {
        //given
        int expected = Color.BLACK.getIdentifier();

        //when
        int actual = ColorPicker.pick(null);

        //then
        assertEquals(actual, expected, "Inappropriate color identifier ");
    }
}
