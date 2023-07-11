package hw28;

import java.io.File;

public class FileLoggerConfiguration {
    private File logFile;
    private LoggingLevel loggingLevel;
    private long maxFileSize;
    private String logFormat;

    public FileLoggerConfiguration (File logFile, LoggingLevel loggingLevel, long maxFileSize, String logFormat) {
        this.logFile = logFile;
        this.logFormat = logFormat;
        this.maxFileSize = maxFileSize;
        this.loggingLevel = loggingLevel;
    }

    public static FileLoggerConfiguration load (File configFile) {
        return null;
    }

    public File getLogFile () {
        return logFile;
    }

    public LoggingLevel getLoggingLevel () {
        return loggingLevel;
    }

    public long getMaxFileSize () {
        return maxFileSize;
    }

    public String getLogFormat () {
        return logFormat;
    }

    public void setLogFile (File logFile) {
    }

    public void setMaxFileSize (long l) {
    }
}