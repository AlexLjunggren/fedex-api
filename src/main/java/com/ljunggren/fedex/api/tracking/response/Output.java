package com.ljunggren.fedex.api.tracking.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Output {

    private List<CompleteTrackResult> completeTrackResults;
    @JsonProperty("alerts")
    private String alert;
    
}
