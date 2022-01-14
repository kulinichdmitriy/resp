package request;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {

    private static final Logger logger = LogManager.getLogger(Log.class);

    public void info(String info){
        logger.info(info);
    }


}
