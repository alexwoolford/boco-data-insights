package io.woolford.datafeed;


import com.univocity.parsers.csv.CsvRoutines;
import io.woolford.entities.AccountParcelRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;


public class AccountParcelFeed {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void persistAccountParcel() throws IOException {

        URL accountParcelURL = new URL("http://assessor.boco.solutions/ASR_PublicDataFiles/Account_Parcels.csv");
        InputStream accountParcelStream = accountParcelURL.openStream();
        List<AccountParcelRecord> buildingRecordList = new CsvRoutines().parseAll(AccountParcelRecord.class, accountParcelStream);

        for (AccountParcelRecord accountParcelRecord : buildingRecordList){
            logger.info(accountParcelRecord.toString());
        }


    }


}

