package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class BookingData {
    private List<AssociatedRecordsItem> associatedRecords;
    private String providerConfirmationId;
    private String id;
    private String type;

    public void setAssociatedRecords(List<AssociatedRecordsItem> associatedRecords) {
        this.associatedRecords = associatedRecords;
    }

    public List<AssociatedRecordsItem> getAssociatedRecords() {
        return associatedRecords;
    }

    public void setProviderConfirmationId(String providerConfirmationId) {
        this.providerConfirmationId = providerConfirmationId;
    }

    public String getProviderConfirmationId() {
        return providerConfirmationId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}