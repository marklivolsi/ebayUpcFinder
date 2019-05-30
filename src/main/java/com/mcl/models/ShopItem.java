
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
        "Description",
        "ItemID",
        "EndTime",
        "ViewItemURLForNaturalSearch",
        "ListingType",
        "Location",
        "GalleryURL",
        "PictureURL",
        "PrimaryCategoryID",
        "PrimaryCategoryName",
        "BidCount",
        "ConvertedCurrentPrice",
        "ListingStatus",
        "TimeLeft",
        "Title",
        "ItemSpecifics",
        "Country",
        "AutoPay",
        "ConditionID",
        "ConditionDisplayName",
        "GlobalShipping"
})
public class ShopItem {

    @JsonProperty("Description")
    private String description;
    @JsonProperty("ItemID")
    private String itemID;
    @JsonProperty("EndTime")
    private String endTime;
    @JsonProperty("ViewItemURLForNaturalSearch")
    private String viewItemURLForNaturalSearch;
    @JsonProperty("ListingType")
    private String listingType;
    @JsonProperty("Location")
    private String location;
    @JsonProperty("GalleryURL")
    private String galleryURL;
    @JsonProperty("PictureURL")
    private List<String> pictureURL = null;
    @JsonProperty("PrimaryCategoryID")
    private String primaryCategoryID;
    @JsonProperty("PrimaryCategoryName")
    private String primaryCategoryName;
    @JsonProperty("BidCount")
    private Integer bidCount;
    @JsonProperty("ConvertedCurrentPrice")
    private ShopConvertedCurrentPrice shopConvertedCurrentPrice;
    @JsonProperty("ListingStatus")
    private String listingStatus;
    @JsonProperty("TimeLeft")
    private String timeLeft;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("ItemSpecifics")
    private ItemSpecifics itemSpecifics;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("AutoPay")
    private Boolean autoPay;
    @JsonProperty("ConditionID")
    private Integer conditionID;
    @JsonProperty("ConditionDisplayName")
    private String conditionDisplayName;
    @JsonProperty("GlobalShipping")
    private Boolean globalShipping;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ItemID")
    public String getItemID() {
        return itemID;
    }

    @JsonProperty("ItemID")
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    @JsonProperty("EndTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("EndTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("ViewItemURLForNaturalSearch")
    public String getViewItemURLForNaturalSearch() {
        return viewItemURLForNaturalSearch;
    }

    @JsonProperty("ViewItemURLForNaturalSearch")
    public void setViewItemURLForNaturalSearch(String viewItemURLForNaturalSearch) {
        this.viewItemURLForNaturalSearch = viewItemURLForNaturalSearch;
    }

    @JsonProperty("ListingType")
    public String getListingType() {
        return listingType;
    }

    @JsonProperty("ListingType")
    public void setListingType(String listingType) {
        this.listingType = listingType;
    }

    @JsonProperty("Location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("GalleryURL")
    public String getGalleryURL() {
        return galleryURL;
    }

    @JsonProperty("GalleryURL")
    public void setGalleryURL(String galleryURL) {
        this.galleryURL = galleryURL;
    }

    @JsonProperty("PictureURL")
    public List<String> getPictureURL() {
        return pictureURL;
    }

    @JsonProperty("PictureURL")
    public void setPictureURL(List<String> pictureURL) {
        this.pictureURL = pictureURL;
    }

    @JsonProperty("PrimaryCategoryID")
    public String getPrimaryCategoryID() {
        return primaryCategoryID;
    }

    @JsonProperty("PrimaryCategoryID")
    public void setPrimaryCategoryID(String primaryCategoryID) {
        this.primaryCategoryID = primaryCategoryID;
    }

    @JsonProperty("PrimaryCategoryName")
    public String getPrimaryCategoryName() {
        return primaryCategoryName;
    }

    @JsonProperty("PrimaryCategoryName")
    public void setPrimaryCategoryName(String primaryCategoryName) {
        this.primaryCategoryName = primaryCategoryName;
    }

    @JsonProperty("BidCount")
    public Integer getBidCount() {
        return bidCount;
    }

    @JsonProperty("BidCount")
    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    @JsonProperty("ConvertedCurrentPrice")
    public ShopConvertedCurrentPrice getShopConvertedCurrentPrice() {
        return shopConvertedCurrentPrice;
    }

    @JsonProperty("ConvertedCurrentPrice")
    public void setShopConvertedCurrentPrice(ShopConvertedCurrentPrice shopConvertedCurrentPrice) {
        this.shopConvertedCurrentPrice = shopConvertedCurrentPrice;
    }

    @JsonProperty("ListingStatus")
    public String getListingStatus() {
        return listingStatus;
    }

    @JsonProperty("ListingStatus")
    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
    }

    @JsonProperty("TimeLeft")
    public String getTimeLeft() {
        return timeLeft;
    }

    @JsonProperty("TimeLeft")
    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("ItemSpecifics")
    public ItemSpecifics getItemSpecifics() {
        return itemSpecifics;
    }

    @JsonProperty("ItemSpecifics")
    public void setItemSpecifics(ItemSpecifics itemSpecifics) {
        this.itemSpecifics = itemSpecifics;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("AutoPay")
    public Boolean getAutoPay() {
        return autoPay;
    }

    @JsonProperty("AutoPay")
    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    @JsonProperty("ConditionID")
    public Integer getConditionID() {
        return conditionID;
    }

    @JsonProperty("ConditionID")
    public void setConditionID(Integer conditionID) {
        this.conditionID = conditionID;
    }

    @JsonProperty("ConditionDisplayName")
    public String getConditionDisplayName() {
        return conditionDisplayName;
    }

    @JsonProperty("ConditionDisplayName")
    public void setConditionDisplayName(String conditionDisplayName) {
        this.conditionDisplayName = conditionDisplayName;
    }

    @JsonProperty("GlobalShipping")
    public Boolean getGlobalShipping() {
        return globalShipping;
    }

    @JsonProperty("GlobalShipping")
    public void setGlobalShipping(Boolean globalShipping) {
        this.globalShipping = globalShipping;
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
