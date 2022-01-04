package com.ljunggren.fedex.api.tracking.response;

public enum TrackingStatusCodes {

    AA("At Airport"),
    AC("At Canada Post facility"),
    AD("At Delivery"),
    AF("At FedEx Facility"),
    AP("At Pickup"),
    AR("Arrived at"),
    AX("At USPS facility"),
    CA("Shipment Cancelled"),
    CH("Location Changed"),
    DD("Delivery Delay"),
    DE("Delivery Exception"),
    DL("Delivered"),
    DP("Departed"),
    DR("Vehicle furnished but not used"),
    DS("Vehicle Dispatched"),
    DY("Delay"),
    EA("Enroute to Airport"),
    ED("Enroute to Delivery"),
    EO("Enroute to Origin Airport"),
    EP("Enroute to Pickup"),
    FD("At FedEx Destination"),
    HL("Hold at Location"),
    IT("In Transit"),
    IX("In transit (see Details)"),
    LO("Left Origin"),
    OC("Order Created"),
    OD("Out for Delivery"),
    OF("At FedEx origin facility"),
    OX("Shipment information sent to USPS"),
    PD("Pickup Delay"),
    PF("Plane in Flight"),
    PL("Plane Landed"),
    PM("In Progress"),
    PU("Picked Up"),
    PX("Picked up (see Details)"),
    RR("CDO requested"),
    RM("CDO Modified"),
    RC("CDO Cancelled"),
    RS("Return to Shipper"),
    RP("Return label link emailed to return sender"),
    LP("Return label link cancelled by shipment originator"),
    RG("Return label link expiring soon"),
    RD("Return label link expired"),
    SE("Shipment Exception"),
    SF("At Sort Facility"),
    SP("Split Status"),
    TR("Transfer"),
    UNKNOWN("Unknown");
    
    private String description;

    private TrackingStatusCodes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public static TrackingStatusCodes lookup(String id) {
        try {
            return TrackingStatusCodes.valueOf(id);
        } catch (IllegalArgumentException e) {
            return TrackingStatusCodes.UNKNOWN;
        }
    }
    
}
