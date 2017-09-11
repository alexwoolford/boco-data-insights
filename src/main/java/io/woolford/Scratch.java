package io.woolford;


import io.woolford.datafeed.PermitsFeed;
import io.woolford.entities.Permit;
import io.woolford.services.BocoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;

@Component
public class Scratch {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    BocoService bocoService;


//    @Value("${google.geocode.api.key}")
//    String googleGeocodeApiKey;
//
//    @PostConstruct
//    private void scratch() throws InterruptedException, ApiException, IOException {
//
//        Geocode geocode = new Geocode(googleGeocodeApiKey);
//
//        GeocodingResult[] geocodingResults = geocode.geocode("407 Arbor Drive, Lafayette, CO 80026");
//
//        logger.info(geocodingResults.toString());
//
//    }


    @PostConstruct
    private void scratch() throws IOException {

        PermitsFeed permitsFeed = new PermitsFeed();

        for (Permit permit : permitsFeed.getPermitRecords()){

            try {
                bocoService.mergePermit(permit);
            } catch (Exception e) {
                logger.error(e.getMessage());
            }

        }

//


//        AccountParcelFeed accountParcelFeed = new AccountParcelFeed();
//        accountParcelFeed.persistAccountParcel();
//
//        OwnerAddressFeed ownerAddressFeed = new OwnerAddressFeed();
//        ownerAddressFeed.persistOwnerAddress();

//        BuildingFeed buildingFeed = new BuildingFeed();
//        buildingFeed.persistBuildings();

//        AccountParcelRecord accountParcelRecord = new AccountParcelRecord();
//        accountParcelRecord.setStrap("A");
//        accountParcelRecord.setParcelno("B");
//
//        dbMapper.insertAccountParcel(accountParcelRecord);



    }

}
