package TestPackage.DataPackage;


import java.util.Calendar;
import java.util.HashMap;

/**
 * Данный класс при обращении к методу возвращает определенные тестовые данные.
 */

 public class TestData {

    private static final String BASE_URL = "https://api.trello.com/1/";
    private static final String TEMPLATE = "TrelloTestAPI";
    private static final String API_KEY = "b52c8730b04f7610752d0013707aad19";
    private static final String API_TOKEN = "4486e625ecf7d67c88ae4c73e863b4abd5c65eedbd8f90b4abc178fb93639a1a";

    /**
     * Получение шаблона для ввода
     *
     * @return
     */
    public static String getTemplate() {
        return TEMPLATE + Calendar.getInstance().getTime().toString();
    }

    /**
     * Получение уникального шаблона для ввода
     *
     * @return
     */
    public  static String getRandomTemplate() {
        return TEMPLATE.concat(String.valueOf(Math.random()));
    }

    /**
     * Получение ключа
     *
     * @return
     */
    public static String getApiKey() {
        return API_KEY;
    }

    /**
     * Получение токена
     *
     * @return
     */
    public static String getApiToken() {
        return API_TOKEN;
    }

    /**
     * Получение базовой ссылки
     *
     * @return
     */
    public static String getBaseUrl() {
        return BASE_URL;
    }

    /**
     * Получение параметров
     *
     * @return
     */

    public static HashMap<String, String> AuthParams() {
        HashMap <String, String> params = new HashMap<>();
        params.put("key", TestData.getApiKey());
        params.put("token", TestData.getApiToken());
        return params;
    }
}
