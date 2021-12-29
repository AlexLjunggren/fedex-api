package com.ljunggren.fedex.api;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FedexPropertiesTest {

    @Test
    public void getOauthUrlSandboxTest() {
        FedexProperties properties = new FedexProperties(FedexEnvironment.SANDBOX);
        String url = properties.getOauthUrl();
        assertNotNull(url);
    }

    @Test
    public void getOauthUrlProductionTest() {
        FedexProperties properties = new FedexProperties(FedexEnvironment.PRODUCTION);
        String url = properties.getOauthUrl();
        assertNotNull(url);
    }
    
    @Test
    public void getTrackingUrlSandboxTest() {
        FedexProperties properties = new FedexProperties(FedexEnvironment.SANDBOX);
        String url = properties.getTrackingUrl();
        assertNotNull(url);
    }

    @Test
    public void getTrackingUrlProductionTest() {
        FedexProperties properties = new FedexProperties(FedexEnvironment.PRODUCTION);
        String url = properties.getTrackingUrl();
        assertNotNull(url);
    }

}
