
package com.example.thuantnt.retrofit3.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Photo {

    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_items")
    @Expose
    private Integer totalItems;
    @SerializedName("photos")
    @Expose
    private List<com.example.thuantnt.retrofit3.models.Photo_> photos = null;
    @SerializedName("filters")
    @Expose
    private Filters filters;
    @SerializedName("feature")
    @Expose
    private String feature;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<com.example.thuantnt.retrofit3.models.Photo_> getPhotos() {
        return photos;
    }

    public void setPhotos(List<com.example.thuantnt.retrofit3.models.Photo_> photos) {
        this.photos = photos;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

}
