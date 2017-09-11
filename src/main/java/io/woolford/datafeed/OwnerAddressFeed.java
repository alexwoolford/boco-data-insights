package io.woolford.datafeed;

import com.univocity.parsers.csv.CsvRoutines;
import io.woolford.entities.OwnerAddressRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;


public class OwnerAddressFeed {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void persistOwnerAddress() throws IOException {

        URL ownerAddressURL = new URL("http://assessor.boco.solutions/ASR_PublicDataFiles/Owner_Address.csv");
        InputStream ownerAddressInputStream = ownerAddressURL.openStream();
        List<OwnerAddressRecord> ownerAddressRecordList = new CsvRoutines().parseAll(OwnerAddressRecord.class, ownerAddressInputStream);

        for (OwnerAddressRecord ownerAddressRecord : ownerAddressRecordList){
            logger.info(ownerAddressRecord.toString());
        }

    }

}
