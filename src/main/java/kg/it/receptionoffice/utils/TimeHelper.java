package kg.it.receptionoffice.utils;

import java.time.format.DateTimeFormatter;

public class TimeHelper {
    public static final String DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm";
    public static final String DATE_TIME_SS_FORMAT = "dd.MM.yyyy HH:mm:ss";
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final String DATE_TIME_SS_FORMAT_REVERSE = "yyyy-MM-dd HH:mm:ss";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
    public static final DateTimeFormatter DATE_TIME_SS_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_SS_FORMAT);
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    public static final DateTimeFormatter DATE_TIME_SS_REVERSE_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_SS_FORMAT_REVERSE);
}
