package kg.it.receptionoffice.utils;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class UriHelper {

    private static final Logger LOG = Logger.getLogger(UriHelper.class);

    private final HttpServletRequest request;

    public UriHelper(HttpServletRequest request) {
        this.request = request;
    }

    public String getSimpleUrl(Map<String, Object> parameters) {
        return getSimpleUrl("", parameters);
    }

    public String getSimpleUrl(String path, Map<String, Object> parameters) {
        Map<String, String[]> map = new HashMap<>();

        for (String key : parameters.keySet()) {
            Object value = parameters.get(key);
            String str_value = null != value ? value.toString() : "";
            String[] values = new String[]{value.toString()};
            map.put(key, values);
        }

        return getUrl(path, map);
    }

    public String getUrl(Map<String, String[]> parameters) {
        return getUrl("", parameters);
    }

    public String getUrl(String path, Map<String, String[]> parameters) {
        String uri = request.getRequestURI();
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String key : parameterMap.keySet()) {
            if (!parameters.containsKey(key))
                parameters.put(key, parameterMap.get(key));
        }

        UriBuilder uriBuilder = new UriBuilder(uri);
        if (null != path && !path.isEmpty())
            uriBuilder.slash().add(path);

        uriBuilder.addParams(parameters);
        return uriBuilder.getUrl();
    }

    public Boolean isActiveUri(String url) {
        String uri = request.getRequestURI();
        return uri.equals(url);
    }

    public String getUriLastSegment() {
        String uri = request.getRequestURI();
        return uri.substring(uri.lastIndexOf("/") + 1);
    }

    public class UriBuilder {

        private String path;
        private String requestPart;

        public UriBuilder() {
            path = "";
            requestPart = "";
        }

        public UriBuilder(String path) {
            this.path = path;
            this.requestPart = "";
        }

        public UriBuilder slash() {
            this.path += "/";
            return this;
        }

        public UriBuilder add(String pathPart) {
            Assert.notNull(pathPart);
            this.path += pathPart;
            return this;
        }

        @Override
        public String toString() {
            return this.path;
        }

        public String getPath() {
            return path;
        }

        public UriBuilder addParams(Map<String, String[]> parameters) {
            Assert.notNull(parameters);
            for (String key : parameters.keySet())
                for (String value : parameters.get(key))
                    requestPart += requestPart.isEmpty() ? String.format("%s=%s", key, value) : String.format("&%s=%s", key, value);

            return this;
        }

        public String getUrl() {
            return String.format("%s?%s", path, requestPart);
        }
    }

}
