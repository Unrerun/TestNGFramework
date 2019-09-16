package TestPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Utils {

    protected static List<String> fieldFixer(String fieldForFix) {
        return Arrays.asList(fieldForFix
                .replaceAll("[],\\[]", "")
                .split(" "));
    }

    public static HashMap<String, String> AuthParams() {
        HashMap <String, String> params = new HashMap<>();
        params.put("key", TestData.getApiKey());
        params.put("token", TestData.getApiToken());
        return params;
    }

}
