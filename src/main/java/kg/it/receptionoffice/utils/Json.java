package kg.it.receptionoffice.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.util.List;

public class Json {

    private final static Logger LOG = Logger.getLogger(Json.class);

    public Json() {
    }

    public static JsonNode toJson(Boolean value) {
        ObjectMapper mapper = new ObjectMapper();
        return (JsonNode) mapper.convertValue(value, JsonNode.class);
    }

    public static <T> JsonNode toJson(List<T> models) {
        ObjectMapper mapper = new ObjectMapper();
        return (JsonNode) mapper.convertValue(models, JsonNode.class);
    }

    public static JsonNode toJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        return (JsonNode) mapper.convertValue(obj, JsonNode.class);
    }

    public static JsonNode toJson(String str) {
        return (JsonNode) (new ObjectMapper()).convertValue(str, JsonNode.class);
    }

    public static JsonNode fromJsonString(String str) {
        try {
            return (new ObjectMapper()).readTree(str);
        } catch (Exception var2) {
            LOG.info(var2.getMessage(), var2);
            return null;
        }
    }

    public static <T> T fromJson(String str, Class<T> clazz) {
        try {
            JsonNode e = fromJsonString(str);
            return (new ObjectMapper()).treeToValue(e, clazz);
        } catch (Exception var3) {
            LOG.info(var3.getMessage(), var3);
            return null;
        }
    }

    public static <T> T fromJson(JsonNode json, Class<T> clazz) {
        try {
            return (new ObjectMapper()).treeToValue(json, clazz);
        } catch (Exception var3) {
            LOG.info(var3.getMessage(), var3);
            return null;
        }
    }

}
