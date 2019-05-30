
package com.mcl.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Timestamp",
    "Ack",
    "Build",
    "Version",
    "Item"
})
public class ShoppingApiRoot {

    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("Ack")
    private String ack;
    @JsonProperty("Build")
    private String build;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("Item")
    private ShopItem item;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Ack")
    public String getAck() {
        return ack;
    }

    @JsonProperty("Ack")
    public void setAck(String ack) {
        this.ack = ack;
    }

    @JsonProperty("Build")
    public String getBuild() {
        return build;
    }

    @JsonProperty("Build")
    public void setBuild(String build) {
        this.build = build;
    }

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("Item")
    public ShopItem getItem() {
        return item;
    }

    @JsonProperty("Item")
    public void setItem(ShopItem item) {
        this.item = item;
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
