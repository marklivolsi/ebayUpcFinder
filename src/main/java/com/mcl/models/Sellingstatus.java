
package com.mcl.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentPrice",
    "convertedCurrentPrice",
    "sellingState",
    "bidCount"
})
public class Sellingstatus {

    @JsonProperty("currentPrice")
    private List<CurrentPrice> currentPrice = null;
    @JsonProperty("convertedCurrentPrice")
    private List<ConvertedCurrentPrice> convertedCurrentPrice = null;
    @JsonProperty("sellingState")
    private List<String> sellingState = null;
    @JsonProperty("bidCount")
    private List<String> bidCount = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currentPrice")
    public List<CurrentPrice> getCurrentPrice() {
        return currentPrice;
    }

    @JsonProperty("currentPrice")
    public void setCurrentPrice(List<CurrentPrice> currentPrice) {
        this.currentPrice = currentPrice;
    }

    @JsonProperty("convertedCurrentPrice")
    public List<ConvertedCurrentPrice> getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    @JsonProperty("convertedCurrentPrice")
    public void setConvertedCurrentPrice(List<ConvertedCurrentPrice> convertedCurrentPrice) {
        this.convertedCurrentPrice = convertedCurrentPrice;
    }

    @JsonProperty("sellingState")
    public List<String> getSellingState() {
        return sellingState;
    }

    @JsonProperty("sellingState")
    public void setSellingState(List<String> sellingState) {
        this.sellingState = sellingState;
    }

    @JsonProperty("bidCount")
    public List<String> getBidCount() {
        return bidCount;
    }

    @JsonProperty("bidCount")
    public void setBidCount(List<String> bidCount) {
        this.bidCount = bidCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
