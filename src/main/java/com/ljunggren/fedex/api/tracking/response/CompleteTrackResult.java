package com.ljunggren.fedex.api.tracking.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompleteTrackResult {

    private String trackingNumber;
    private List<TrackResult> trackResults;
    
}
