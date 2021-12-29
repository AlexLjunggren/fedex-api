package com.ljunggren.fedex.api.tracking;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.ljunggren.fedex.api.tracking.response.TrackingResponse;
import com.ljunggren.jsonUtils.JsonUtils;

public class TrackingResponseTest {
    
    private String readFromResources(String file) throws IOException {
        return IOUtils.toString(this.getClass().getResourceAsStream(file), "UTF-8");
    }

    @Test
    public void deserializeTest() throws IOException {
        String json = readFromResources("/trackingResponse.json");
        TrackingResponse response = JsonUtils.jsonToObject(json, TrackingResponse.class);
        assertNotNull(response);
    }
    
    @Test
    public void serializeTest() throws IOException {
        String json = readFromResources("/trackingResponse.json");
        TrackingResponse response = JsonUtils.jsonToObject(json, TrackingResponse.class);
        String serializedResponse = JsonUtils.objectToJson(response);
        assertTrue(JsonUtils.areEqual(json, serializedResponse));
    }

}
