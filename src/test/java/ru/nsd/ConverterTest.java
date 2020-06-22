package ru.nsd;

import org.junit.Test;
import ru.nsd.exceptions.InputException;
import ru.nsd.exceptions.OverFlowException;

import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void countResult() throws OverFlowException, InputException {
        String result = Converter.countResult("123", 10, 2);
        assertEquals("Wrong result", "1111011", result);

    }

    @Test
    public void countResultWithZerosAtFrontTest() throws OverFlowException, InputException {
        String result = Converter.countResult("00000123", 10, 10);
        assertEquals("Wrong result", "123", result);
    }
}
