// https://exercism.org/tracks/java/exercises/logs-logs-logs

public class LogLine {

    private final String line;

    public LogLine(String logLine) {
        this.line = logLine;
    }

    public LogLevel getLogLevel() {
        String code = line.substring(1, 4);

        switch (code) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel level = this.getLogLevel();
        String message = line.substring(line.indexOf(":") + 2);
        int encoded;

        switch (level) {
            case TRACE:
                encoded = 1;
                break;
            case DEBUG:
                encoded = 2;
                break;
            case INFO:
                encoded = 4;
                break;
            case WARNING:
                encoded = 5;
                break;
            case ERROR:
                encoded = 6;
                break;
            case FATAL:
                encoded = 42;
                break;
            default:
                encoded = 0;
                break;
        }
        return encoded + ":" + message;
    }
}
