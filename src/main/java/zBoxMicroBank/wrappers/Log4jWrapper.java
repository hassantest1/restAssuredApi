package zBoxMicroBank.wrappers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.EnvironmentPropertySource;


public class Log4jWrapper {
    private static final Logger LOGGER = LogManager.getLogger(Log4jWrapper.class);

    public static void info(String message) {
        LOGGER.info(message);
    }
    public static void debug(String message) {
        LOGGER.debug(message);
    }
    public static void error(String message) {
        LOGGER.error(message);
    }
    public static void error(String message, Throwable throwable) {
        LOGGER.error(message, throwable);
    }
    public static void warn(String message) {
        LOGGER.warn(message);
    }
    public static void trace(String message) {
        LOGGER.trace(message);
    }
}

