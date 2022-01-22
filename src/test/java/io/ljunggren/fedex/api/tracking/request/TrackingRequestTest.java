package io.ljunggren.fedex.api.tracking.request;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import io.ljunggren.jsonUtils.JsonUtils;

public class TrackingRequestTest {

    private String readFromResources(String file) throws IOException {
        return IOUtils.toString(this.getClass().getResourceAsStream(file), "UTF-8");
    }

    @Test
    public void deserializeTest() throws IOException {
        String json = readFromResources("/trackingRequest.json");
        TrackingRequest request = JsonUtils.jsonToObject(json, TrackingRequest.class);
        assertNotNull(request);
    }

    @Test
    public void serializeTest() throws IOException {
        String json = readFromResources("/trackingRequest.json");
        TrackingRequest request = JsonUtils.jsonToObject(json, TrackingRequest.class);
        String serializedRequest = JsonUtils.objectToJson(request);
        assertTrue(JsonUtils.areEqual(json, serializedRequest));
    }

}
