package com.example.thuantnt.retrofit3.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thuan.tnt on 28/12/2017.
 */

public class Photo {
    @SerializedName("id")
    private String id;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("camera")
    private String camera;
    @SerializedName("lens")
    private Integer lens;
    @SerializedName("focal_length")
    private String focalLength;
    @SerializedName("iso")
    private String iso;
    @SerializedName("shutter_speed")
    private String shutterSpeed;
    @SerializedName("aperture")
    private String aperture;
    @SerializedName("times_viewed")
    private Double timesViewed;
    @SerializedName("rating")
    private Double rating;
    @SerializedName("status")
    private Integer status;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("category")
    private String category;
    @SerializedName("location")
    private Double location;
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("longitude")
    private Double longtitude;
    @SerializedName("taken_at")
    private String takenAt;
    @SerializedName("hi_res_uploaded")
    private Integer hiResUpload;
    @SerializedName("for_sale")
    private Boolean forSale;
    @SerializedName("width")
    private Double width;
    @SerializedName("height")
    private Double height;
    @SerializedName("votes_count")
    private Integer votesCount;
    @SerializedName("favorites_count")
    private Integer favoritesCount;
    @SerializedName("comments_count")
    private Integer commentsCount;
    @SerializedName("nsfw")
    private Boolean nsfw;
    @SerializedName("sales_count")
    private Integer salesCount;
    @SerializedName("for_sale_date")
    private String forSaleDate;
    @SerializedName("highest_rating")
    private Double highestRating;
    @SerializedName("highest_rating_date")
    private String highestRatingDate;
    @SerializedName("license_type")
    private Integer licenseType;
    @SerializedName("converted")
    private Integer converted;
    @SerializedName("collections_count")
    private Integer collectionCount;
    @SerializedName("crop_version")
    private Integer cropVersion;
    @SerializedName("privacy")
    private Boolean privacy;
    @SerializedName("profile")
    private Boolean profile;
    @SerializedName("for_critique")
    private Boolean forCritique;
    @SerializedName("critiques_callout_dismissed")
    private Boolean critiquesCalloutDismissed;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("image")
    private List<String> images = new ArrayList<>();


    public Photo(String id, String userId, String name, String description, String camera,
                 Integer lens, String focalLength, String iso, String shutterSpeed, String aperture,
                 Double timesViewed, Double rating, Integer status, String createdAt, String category,
                 Double location, Double latitude, Double longtitude, String takenAt, Integer hiResUpload,
                 Boolean forSale, Double width, Double height, Integer votesCount, Integer favoritesCount,
                 Integer commentsCount, Boolean nsfw, Integer salesCount, String forSaleDate, Double highestRating,
                 String highestRatingDate, Integer licenseType, Integer converted, Integer collectionCount,
                 Integer cropVersion, Boolean privacy, Boolean profile, Boolean forCritique, Boolean critiquesCalloutDismissed,
                 String imageUrl, List<String> images) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.camera = camera;
        this.lens = lens;
        this.focalLength = focalLength;
        this.iso = iso;
        this.shutterSpeed = shutterSpeed;
        this.aperture = aperture;
        this.timesViewed = timesViewed;
        this.rating = rating;
        this.status = status;
        this.createdAt = createdAt;
        this.category = category;
        this.location = location;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.takenAt = takenAt;
        this.hiResUpload = hiResUpload;
        this.forSale = forSale;
        this.width = width;
        this.height = height;
        this.votesCount = votesCount;
        this.favoritesCount = favoritesCount;
        this.commentsCount = commentsCount;
        this.nsfw = nsfw;
        this.salesCount = salesCount;
        this.forSaleDate = forSaleDate;
        this.highestRating = highestRating;
        this.highestRatingDate = highestRatingDate;
        this.licenseType = licenseType;
        this.converted = converted;
        this.collectionCount = collectionCount;
        this.cropVersion = cropVersion;
        this.privacy = privacy;
        this.profile = profile;
        this.forCritique = forCritique;
        this.critiquesCalloutDismissed = critiquesCalloutDismissed;
        this.imageUrl = imageUrl;
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Integer getLens() {
        return lens;
    }

    public void setLens(Integer lens) {
        this.lens = lens;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    public Double getTimesViewed() {
        return timesViewed;
    }

    public void setTimesViewed(Double timesViewed) {
        this.timesViewed = timesViewed;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getLocation() {
        return location;
    }

    public void setLocation(Double location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public String getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(String takenAt) {
        this.takenAt = takenAt;
    }

    public Integer getHiResUpload() {
        return hiResUpload;
    }

    public void setHiResUpload(Integer hiResUpload) {
        this.hiResUpload = hiResUpload;
    }

    public Boolean getForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getVotesCount() {
        return votesCount;
    }

    public void setVotesCount(Integer votesCount) {
        this.votesCount = votesCount;
    }

    public Integer getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public String getForSaleDate() {
        return forSaleDate;
    }

    public void setForSaleDate(String forSaleDate) {
        this.forSaleDate = forSaleDate;
    }

    public Double getHighestRating() {
        return highestRating;
    }

    public void setHighestRating(Double highestRating) {
        this.highestRating = highestRating;
    }

    public String getHighestRatingDate() {
        return highestRatingDate;
    }

    public void setHighestRatingDate(String highestRatingDate) {
        this.highestRatingDate = highestRatingDate;
    }

    public Integer getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    public Integer getConverted() {
        return converted;
    }

    public void setConverted(Integer converted) {
        this.converted = converted;
    }

    public Integer getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Integer collectionCount) {
        this.collectionCount = collectionCount;
    }

    public Integer getCropVersion() {
        return cropVersion;
    }

    public void setCropVersion(Integer cropVersion) {
        this.cropVersion = cropVersion;
    }

    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    public Boolean getProfile() {
        return profile;
    }

    public void setProfile(Boolean profile) {
        this.profile = profile;
    }

    public Boolean getForCritique() {
        return forCritique;
    }

    public void setForCritique(Boolean forCritique) {
        this.forCritique = forCritique;
    }

    public Boolean getCritiquesCalloutDismissed() {
        return critiquesCalloutDismissed;
    }

    public void setCritiquesCalloutDismissed(Boolean critiquesCalloutDismissed) {
        this.critiquesCalloutDismissed = critiquesCalloutDismissed;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
