package io.woolford.datafeed;

import com.univocity.parsers.csv.CsvRoutines;
import io.woolford.entities.Permit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

@Component
public class PermitsFeed {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<Permit> getPermitRecords() throws IOException {

        URL permitsURL = new URL("http://assessor.boco.solutions/ASR_PublicDataFiles/Permits.csv");
        InputStream permitInputStream = permitsURL.openStream();
        List<Permit> permitList = new CsvRoutines().parseAll(Permit.class, permitInputStream);

        return permitList;
    }

}
