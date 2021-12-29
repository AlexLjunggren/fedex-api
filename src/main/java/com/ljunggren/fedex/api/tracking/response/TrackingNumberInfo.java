package com.ljunggren.fedex.api.tracking.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingNumberInfo {

    private String trackingNumber;
    private String carrierCode;
    private String trackingNumberUniqueId;
    
}
