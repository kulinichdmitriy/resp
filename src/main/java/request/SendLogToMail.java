package request;

import org.apache.log4j.Logger;

public class SendLogToMail {
    private static final Logger logger = Logger.getLogger(SendLogToMail.class);

    public void logMail(String mailString) {
        logger.info(mailString);
    }

}