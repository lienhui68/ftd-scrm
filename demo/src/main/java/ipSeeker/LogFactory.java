package ipSeeker;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by David Li on 2016/1/4.
 */
public class LogFactory {
    private static final Logger logger;
    static {
        logger = Logger.getLogger("stdout");
        logger.setLevel(Level.DEBUG);
    }

    public static void log(String info, Level level, Throwable ex) {
        logger.log(level, info, ex);
    }

    public static Level getLogLevel(){
        return logger.getLevel();
    }
}
