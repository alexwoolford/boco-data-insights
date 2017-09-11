package io.woolford.datafeed;


import com.univocity.parsers.csv.CsvRoutines;
import io.woolford.entities.BuildingRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class BuildingFeed {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void persistBuildings() throws IOException {

        URL buildingURL = new URL("http://assessor.boco.solutions/ASR_PublicDataFiles/Buildings.csv");
        InputStream permitInputStream = buildingURL.openStream();
        List<BuildingRecord> buildingRecordList = new CsvRoutines().parseAll(BuildingRecord.class, permitInputStream);

        for (BuildingRecord buildingRecord : buildingRecordList){
            logger.info(buildingRecord.toString());
        }

    }


}
