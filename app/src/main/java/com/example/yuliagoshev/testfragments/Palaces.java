package com.example.yuliagoshev.testfragments;

public class Palaces  {
    private String mNamesSights;

    private int mImageResourceId;

    public Palaces (String namesSights, int imageResourceId) {
        mNamesSights = namesSights;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID of the palaces.
     */
    public String getNamesSights() {
        return mNamesSights;
    }

    /**
     * Return the image resource ID of the palaces.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
