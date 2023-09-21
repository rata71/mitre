package com.mitre.attack.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TacticRefTest {

    private TacticRef tacticRef;

    @BeforeEach
    public void setUp() {
        tacticRef = new TacticRef();
    }

    @Test
    void testTacticRefSettersAndGetters() {
        Long expectedId = 1L;
        String expectedTacticReference = "testReference";

        tacticRef.setId(expectedId);
        tacticRef.setTacticReference(expectedTacticReference);

        assertEquals(expectedId, tacticRef.getId());
        assertEquals(expectedTacticReference, tacticRef.getTacticReference());
    }

    @Test
    void testTacticRefConstructor() {
        String expectedTacticReference = "testReference";

        TacticRef tacticRefWithConstructor = new TacticRef(expectedTacticReference);
        assertEquals(expectedTacticReference, tacticRefWithConstructor.getTacticReference());
    }
}