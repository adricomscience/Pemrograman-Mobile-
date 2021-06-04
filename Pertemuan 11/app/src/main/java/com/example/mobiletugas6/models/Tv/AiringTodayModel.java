package com.example.mobiletugas6.models.Tv;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AiringTodayModel {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    private String title;

    private String overview;

    public AiringTodayModel() {
    }

    @SerializedName("first_air_date")
    private String firstAirDate;

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    @SerializedName("poster_path")
    private String imgUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
