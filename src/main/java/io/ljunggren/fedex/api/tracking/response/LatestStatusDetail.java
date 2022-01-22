package io.ljunggren.fedex.api.tracking.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatestStatusDetail {

    private Address scanLocation;
    private String code;
    private String derivedCode;
    private List<AncillaryDetail> ancillaryDetails;
    private String statusByLocale;
    private String description;
    private DelayDetail delayDetail;
    
}
