package io.ljunggren.fedex.api.authorization;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import io.ljunggren.json.utils.JsonUtils;

public class OauthResponseTest {

    private String readFromResources(String file) throws IOException {
        return IOUtils.toString(this.getClass().getResourceAsStream(file), "UTF-8");
    }

    @Test
    public void deserializeTest() throws IOException {
        String json = readFromResources("/oauthResponse.json");
        OauthResponse response = JsonUtils.jsonToObject(json, OauthResponse.class);
        assertNotNull(response);
    }
    
    @Test
    public void serializeTest() throws IOException {
        String json = readFromResources("/oauthResponse.json");
        OauthResponse response = JsonUtils.jsonToObject(json, OauthResponse.class);
        String serializeResponse = JsonUtils.objectToJson(response);
        assertTrue(JsonUtils.areEqual(json, serializeResponse));
    }

    @Test
    public void deserializeWithErrorTest() throws IOException {
        String json = readFromResources("/oauthErrorResponse.json");
        OauthResponse response = JsonUtils.jsonToObject(json, OauthResponse.class);
        assertNotNull(response);
    }
    
    @Test
    public void serializeWithErrorTest() throws IOException {
        String json = readFromResources("/oauthErrorResponse.json");
        OauthResponse response = JsonUtils.jsonToObject(json, OauthResponse.class);
        String serializeResponse = JsonUtils.objectToJson(response);
        assertTrue(JsonUtils.areEqual(json, serializeResponse));
    }

}
