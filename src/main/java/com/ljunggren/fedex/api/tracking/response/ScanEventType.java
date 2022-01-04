package com.ljunggren.fedex.api.tracking.response;

public enum ScanEventType {

    AA("At Airport"),
    AD("At Delivery"),
    AF("At FedEx Facility"),
    AP("At Pickup"),
    CA("Shipment Canceled"),
    CH("Location Changed"),
    DE("Delivery Exception"),
    DL("Delivered"),
    DP("Departed FedEx Location"),
    DR("Vehicle Furnished, Not Used"),
    DS("Vehicle Dispatched"),
    DY("Delay"),
    EA("Enroute to Airport delay"),
    ED("Enroute to Delivery"),
    EO("Enroute to Origin airport"),
    EP("Enroute to Pickup"),
    FD("At FedEx Destination"),
    HL("Hold at Location"),
    IT("In Transit"),
    LO("Left Origin"),
    OC("Order Created"),
    OD("Out for Delivery"),
    PF("Plane in Flight"),
    PL("Plane Landed"),
    PU("Picked Up"),
    RS("Return to Shipper"),
    SE("Shipment Exception"),
    SF("At Sort Facility"),
    SP("Split status - multiple statuses"),
    TR("Transfer"),
    UNKNOWN("Unknown");
    
    private String description;

    private ScanEventType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public static ScanEventType lookup(String id) {
        try {
            return ScanEventType.valueOf(id);
        } catch (IllegalArgumentException e) {
            return ScanEventType.UNKNOWN;
        }
    }
    
}
