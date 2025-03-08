package com.celeritate.jql.lexic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class SourcePositionTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void instantiationOk() {
        SourcePosition position = new SourcePosition();        
        assertEquals(position.row, 0);
        assertEquals(position.col, 0);
        position = null;

        position = new SourcePosition(10, 20);
        assertEquals(position.row, 10);
        assertEquals(position.col, 20);
        position = null;        
    }
}
