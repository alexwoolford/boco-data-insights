package io.woolford;

import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GeocodeTest {

    private static final double TOLERANCE = 0.00001;

    @Value("${google.geocode.api.key}")
    String googleGeocodeApiKey;

    @Test
    public void geocodeTest() throws InterruptedException, ApiException, IOException {

        Geocode geocode = new Geocode(googleGeocodeApiKey);
        GeocodingResult[] results = geocode.geocode("407 Arbor Drive, Lafayette, CO 80026");

        Double lat = results[0].geometry.location.lat;
        Double lng = results[0].geometry.location.lng;

        assertTrue(approxEqual(lat, 40.001709));
        assertTrue(approxEqual(lng, -105.0993501));

    }

    public static boolean approxEqual(final double d1, final double d2) {
        return Math.abs(d1 - d2) < TOLERANCE;
    }

}
