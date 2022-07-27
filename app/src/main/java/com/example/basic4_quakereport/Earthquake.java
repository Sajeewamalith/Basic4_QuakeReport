package com.example.basic4_quakereport;


/**
 * {@link Earthquake} represents a single Android platform release.
 * Each object has 3 properties: magnitude, location, and date.
 */
public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;



    public Earthquake(String magnitude, String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }



    public String getMagnitude() {
        return  mMagnitude;
    }


    public String getLocation() {
        return   mLocation ;
    }



    public String getDate() {
        return  mDate;
    }



}
