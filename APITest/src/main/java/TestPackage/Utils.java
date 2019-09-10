package TestPackage;

        import java.util.Arrays;
        import java.util.List;

public class Utils {

    public static List<String> fieldFixer(String fieldForFix) {
        return Arrays.asList(fieldForFix
                .replaceAll("[],\\[]", "")
                .split(" "));
    }
}
