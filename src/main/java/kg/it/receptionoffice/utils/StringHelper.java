package kg.it.receptionoffice.utils;

/**
 * Created by abdysamat on 2/2/18.
 * n.u.abdysamat@gmail.com
 */
public class StringHelper {
    private StringHelper() {
    }

    private static StringHelper instance;

    public synchronized static StringHelper getInstance() {
        if (instance == null)
            instance = new StringHelper();
        return instance;
    }

    public static String replace(String s) {
        return s.replaceAll("\\[\\d+]", "");
    }

    public static String hide(String s) {
        if (s.length() > 25)
            return String.format("%s...", s.substring(0, 24));
        return s;
    }
}
