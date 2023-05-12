package com.techelevator.TakeOff.models.responses.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OfferDetails {
    @JsonProperty("data")
    private OfferData offerData;
    private Meta meta;

    public void setOfferData(OfferData offerData) {
        this.offerData = offerData;
    }

    public OfferData getOfferData() {
        return offerData;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }
}
