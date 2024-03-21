package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VersionNumberTest {

    @Test
    public void versionNumberUsesCases(){
        assertEquals(0, VersionNumber.compare("15", "15.0"));
        assertEquals(0, VersionNumber.compare("10.1", "10.1.0"));
        assertEquals(-1, VersionNumber.compare("10.1", "10.1.1"));
        assertEquals(1, VersionNumber.compare("10.1.2", "10.1.1"));
    }
}
