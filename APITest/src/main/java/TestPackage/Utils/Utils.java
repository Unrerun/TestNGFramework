package TestPackage.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Небольшие вспомогательные методы
 */
public class Utils {

    public static List<String> fieldFixer(String fieldForFix) {
        return Arrays.asList(fieldForFix
                .replaceAll("[],\\[]", "")
                .split(" "));
    }

}
