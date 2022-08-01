package com.example.basic4_quakereport;


/**
 * {@link Earthquake} represents a single Android platform release.
 * Each object has 3 properties: magnitude, location, and date.
 */
public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;


    /** Time of the earthquake */
    private long mTimeInMilliseconds;

   // private String mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */

    /** Website URL of the earthquake */
    private String mUrl;



    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }



    public double getMagnitude() {
        return  mMagnitude;
    }


    public String getLocation() {
        return   mLocation ;
    }



    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }



}
