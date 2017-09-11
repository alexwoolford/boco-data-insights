package io.woolford;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

class Geocode {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private String googleGeocodeApiKey;

    Geocode(String googleGeocodeApiKey) {
        this.googleGeocodeApiKey = googleGeocodeApiKey;
    }

    GeocodingResult[] geocode(String address) throws InterruptedException, ApiException, IOException {

        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(this.googleGeocodeApiKey)
                .build();
        GeocodingResult[] results =  GeocodingApi.geocode(context, address).await();

        return results;

    }

}
