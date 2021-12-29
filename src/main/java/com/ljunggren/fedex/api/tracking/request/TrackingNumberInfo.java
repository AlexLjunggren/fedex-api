package com.ljunggren.fedex.api.tracking.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class TrackingNumberInfo {

    private String trackingNumber;
    private String carrierCode;
    private String trackingNumberUniqueId;
    
    public TrackingNumberInfo(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

}
