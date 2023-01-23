package com.example.umorili;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UPost {

    @SerializedName("id")
    @Expose
    private int id;

    /**
     * @return The elementPureHtml
     */
    public int getElementPureHtml() {
        return id;
    }
}