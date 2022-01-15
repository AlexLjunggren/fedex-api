package com.ljunggren.fedex.api.tracking.response;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrackingStatusCodeTest {

    @Test
    public void getDescriptionTest() {
        String description = TrackingStatusCode.AA.getDescription();
        assertEquals("At Airport", description);
    }
    
    @Test
    public void lookupTest() {
        TrackingStatusCode scanEventType = TrackingStatusCode.lookup("AA");
        assertEquals(TrackingStatusCode.AA, scanEventType);
    }
    
    @Test
    public void lookupUnknownTest() {
        TrackingStatusCode scanEventType = TrackingStatusCode.lookup("ZZ");
        assertEquals(TrackingStatusCode.UNKNOWN, scanEventType);
        
    }

}
