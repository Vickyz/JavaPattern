public class ClientTest {
    public static void main(String[] args) {
        Logger logger = AppLogger.getLogger();

        logger.log(LogLevel.INFO, "Info message");
        logger.log(LogLevel.DEBUG, "Debug message");
        logger.log(LogLevel.ERROR, "Error message");
        logger.log(LogLevel.FATAL, "Factal message");
    }
}
