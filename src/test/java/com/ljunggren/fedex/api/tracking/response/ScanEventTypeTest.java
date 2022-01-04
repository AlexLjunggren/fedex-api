package com.ljunggren.fedex.api.tracking.response;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScanEventTypeTest {

    @Test
    public void getDescriptionTest() {
        String description = ScanEventType.AA.getDescription();
        assertEquals("At Airport", description);
    }
    
    @Test
    public void lookupTest() {
        ScanEventType scanEventType = ScanEventType.lookup("AA");
        assertEquals(ScanEventType.AA, scanEventType);
    }
    
    @Test
    public void lookupUnknownTest() {
        ScanEventType scanEventType = ScanEventType.lookup("ZZ");
        assertEquals(ScanEventType.UNKNOWN, scanEventType);
        
    }

}
