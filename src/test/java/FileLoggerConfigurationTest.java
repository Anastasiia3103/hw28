import hw28.FileLoggerConfiguration;
import hw28.LoggingLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

public class FileLoggerConfigurationTest {

    @Test
    public void testGetLogFile() {
        File logFile = new File("log.txt");
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(logFile, LoggingLevel.DEBUG, 1000L, "yyyy-MM-dd");
        Assertions.assertEquals(logFile, configuration.getLogFile());
    }

    @Test
    public void testGetLoggingLevel() {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(new File("log.txt"), LoggingLevel.INFO, 1000L, "yyyy-MM-dd");
        Assertions.assertEquals(LoggingLevel.INFO, configuration.getLoggingLevel());
    }

    @Test
    public void testGetMaxFileSize() {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(new File("log.txt"), LoggingLevel.DEBUG, 1000L, "yyyy-MM-dd");
        Assertions.assertEquals(1000L, configuration.getMaxFileSize());
    }

    @Test
    public void testGetLogFormat() {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(new File("log.txt"), LoggingLevel.DEBUG, 1000L, "yyyy-MM-dd");
        Assertions.assertEquals("yyyy-MM-dd", configuration.getLogFormat());
    }

    @Test
    public void testSetLogFile() {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(new File("log.txt"), LoggingLevel.DEBUG, 1000L, "yyyy-MM-dd");
        File newLogFile = new File("newLog.txt");
        configuration.setLogFile(newLogFile);
        Assertions.assertEquals(newLogFile, configuration.getLogFile());
    }

    @Test
    public void testSetMaxFileSize() {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(new File("log.txt"), LoggingLevel.DEBUG, 1000L, "yyyy-MM-dd");
        long newMaxSize = 2000L;
        configuration.setMaxFileSize(newMaxSize);
        Assertions.assertEquals(newMaxSize, configuration.getMaxFileSize());
    }
}
