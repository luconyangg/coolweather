package com.coolweather.android.coolweather.gson;

/**
 * Created by Apta on 2017/11/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
