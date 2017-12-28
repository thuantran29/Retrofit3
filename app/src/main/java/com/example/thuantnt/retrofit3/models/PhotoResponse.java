package com.example.thuantnt.retrofit3.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thuan.tnt on 28/12/2017.
 */

public class PhotoResponse {
    @SerializedName("current_page")
    private int currentPage;
    @SerializedName("photos")
    private List<Photo> photos;
    @SerializedName("total_items")
    private int totalItems;
    @SerializedName("total_pages")
    private int totalPages;

    public PhotoResponse(int currentPage, List<Photo> photos, int totalItems, int totalPages) {
        this.currentPage = currentPage;
        this.photos = photos;
        this.totalItems = totalItems;
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
