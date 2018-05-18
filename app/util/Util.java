package util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;

/**
 * Created by Kuylim on 1/9/2017.
 */
public class Util {
    public static ObjectNode createRespone(
      Object response, boolean ok){
        ObjectNode result = Json.newObject();
        result.put("isSuccessfull", ok);
        if(response instanceof String){
            result.put("body", (String) response);
        }
        else{
            result.put("body", (JsonNode) response);
        }
        return result;
    }
}
