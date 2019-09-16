package TestPackage;

import java.util.HashMap;

public final class Storage {

    private Storage() {
    }

    private static HashMap<String, String> storage = new HashMap<>();

    public static void put(String key, String value) {
        storage.put(key, value);
    }

    public static String get(String key) {
        return storage.get(key);
    }
}
