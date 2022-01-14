package request;

import org.testng.annotations.Test;

public class OpenSiteTest {

    SendLogToMail sendEmail = new SendLogToMail();
    Log logger = new Log();
    @Test
    public void openSite() {

        OpenSite openSiteTest = new OpenSite();
        String sitename = "https://www.google.com";
        logger.info("");
        openSiteTest.openSite(sitename);
        sendEmail.logMail("This mail should be sent");

    }
}
