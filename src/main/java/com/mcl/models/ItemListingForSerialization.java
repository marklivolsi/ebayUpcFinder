package com.mcl.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

public class ItemListingForSerialization {

    private Item item;
    @JsonProperty
    private String itemId;
    @JsonProperty
    private String title;
    @JsonProperty
    private String categoryId;
    @JsonProperty
    private String categoryName;
    @JsonProperty
    private String viewItemUrl;
    @JsonProperty
    private String sellingState;
    @JsonProperty
    private String buyItNowAvailable;
    @JsonProperty
    private String startTime;
    @JsonProperty
    private String endTime;
    @JsonProperty
    private String conditionDisplayName;
    @JsonProperty
    private String location;
    @JsonProperty
    private String currencyId;
    @JsonProperty
    private String watchCount;
    @JsonProperty
    private String conditionId;
    @JsonProperty
    private String bidCount;
    @JsonProperty
    private String shippingPrice;
    @JsonProperty
    private String salePrice;
    @JsonProperty
    private String description;
    @JsonProperty
    private String listingType;
    @JsonProperty
    private List<String> pictureUrls;

    public ItemListingForSerialization(Item item) {
        this.item = item;
        setFields();
    }

    private void setFields() {
        setItemId();
        setTitle();
        setCategoryId();
        setCategoryName();
        setViewItemUrl();
        setSellingState();
        setBuyItNowAvailable();
        setStartTime();
        setEndTime();
        setWatchCount();
        setConditionDisplayName();
        setLocation();
        setCurrencyId();
        setConditionId();
        setBidCount();
        setShippingPrice();
        setSalePrice();
        setDescription();
        setPictureUrls();
        setListingType();
    }

    private void setListingType() {
        try {
            listingType = item.getListingInfo().get(0).getListingType().get(0);
        }
        catch (NullPointerException e) {
            listingType = "";
        }
    }

    private void setItemId() {
        try {
            itemId = item.getItemId().get(0);
        }
        catch (NullPointerException e) {
            itemId = "";
        }
    }

    private void setTitle() {
        try {
            title = item.getTitle().get(0);
        }
        catch (NullPointerException e) {
            title = "";
        }
    }

    private void setCategoryId() {
        try {
            categoryId = item.getPrimaryCategory().get(0).getCategoryId().get(0);
        }
        catch (NullPointerException e) {
            categoryId = "";
        }
    }

    private void setCategoryName() {
        try {
            categoryName = item.getPrimaryCategory().get(0).getCategoryName().get(0);
        }
        catch (NullPointerException e) {
            categoryName = "";
        }
    }

    private void setViewItemUrl() {
        try {
            viewItemUrl = item.getViewItemURL().get(0);
        }
        catch (NullPointerException e) {
            viewItemUrl = "";
        }
    }

    private void setSellingState() {
        try {
            sellingState = item.getSellingStatus().get(0).getSellingState().get(0);
        }
        catch (NullPointerException e) {
            sellingState = "";
        }
    }

    private void setBuyItNowAvailable() {
        try {
            buyItNowAvailable = item.getListingInfo().get(0).getBuyItNowAvailable().get(0);
        }
        catch (NullPointerException e) {
            buyItNowAvailable = "";
        }
    }

    private void setStartTime() {
        try {
            startTime = item.getListingInfo().get(0).getStartTime().get(0);
        }
        catch (NullPointerException e) {
            startTime = "";
        }
    }

    private void setEndTime() {
        try {
            endTime = item.getListingInfo().get(0).getEndTime().get(0);
        }
        catch (NullPointerException e) {
            endTime = "";
        }
    }

    private void setWatchCount() {
        try {
            watchCount = item.getListingInfo().get(0).getWatchCount().get(0);
        }
        catch (NullPointerException e) {
            watchCount = "";
        }
    }

    private void setConditionDisplayName() {
        try {
            conditionDisplayName = item.getCondition().get(0).getConditionDisplayName().get(0);
        }
        catch (NullPointerException e) {
            conditionDisplayName = "";
        }
    }

    private void setLocation() {
        try {
            location = item.getLocation().get(0);
        }
        catch (NullPointerException e) {
            location = "";
        }
    }

    private void setCurrencyId() {
        try {
            currencyId = item.getSellingStatus().get(0).getCurrentPrice().get(0).getCurrencyId();
        }
        catch (NullPointerException e) {
            currencyId = "";
        }
    }

    private void setConditionId() {
        try {
            conditionId = item.getCondition().get(0).getConditionId().get(0);
        }
        catch (NullPointerException e) {
            conditionId = "";
        }
    }

    private void setBidCount() {
        try {
            bidCount = item.getSellingStatus().get(0).getBidCount().get(0);
        }
        catch(NullPointerException e) {
            bidCount = "";
        }
    }

    private void setShippingPrice() {
        try {
            shippingPrice = item.getShippingInfo().get(0).getShippingServiceCost().get(0).getValue();
        }
        catch (NullPointerException e) {
            shippingPrice = "";
        }
    }

    private void setSalePrice() {
        try {
            salePrice = item.getSellingStatus().get(0).getCurrentPrice().get(0).getValue();
        }
        catch (NullPointerException e) {
            salePrice = "";
        }
    }

    private void setDescription() {
        try {
            description = item.getItemDetailsRoot().getItem().getDescription();
        }
        catch (NullPointerException e) {
            description = "";
        }
    }

    private void setPictureUrls() {
        try {
            pictureUrls = item.getItemDetailsRoot().getItem().getPictureURL();
        }
        catch (NullPointerException e) {
            pictureUrls = Collections.emptyList();
        }
    }

}
