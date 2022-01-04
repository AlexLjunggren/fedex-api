package com.ljunggren.fedex.api.tracking.response;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrackingStatusCodesTest {

    @Test
    public void getDescriptionTest() {
        String description = TrackingStatusCodes.AA.getDescription();
        assertEquals("At Airport", description);
    }
    
    @Test
    public void lookupTest() {
        TrackingStatusCodes scanEventType = TrackingStatusCodes.lookup("AA");
        assertEquals(TrackingStatusCodes.AA, scanEventType);
    }
    
    @Test
    public void lookupUnknownTest() {
        TrackingStatusCodes scanEventType = TrackingStatusCodes.lookup("ZZ");
        assertEquals(TrackingStatusCodes.UNKNOWN, scanEventType);
        
    }

}
