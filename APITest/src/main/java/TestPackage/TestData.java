package TestPackage;


/**
 * Данный класс при обращении к методу возвращает определенные тестовые данные.
 */

public class TestData {

    private static final String userLogin = "TrelloTestUser@yandex.ru";
    private static final String userPassword = "TrelloTestUser";
    private static final String url = "https://trello.com/";
    private static final String baseUrl = "https://api.trello.com/1/";
    private static final String template = "TrelloTestUser";
    private static final String apiKey = "b52c8730b04f7610752d0013707aad19";
    private static final String auth = "https://trello.com/1/authorize?expiration=1day&name=MyPersonalToken&scope=read&response_type=token&key={4486e625ecf7d67c88ae4c73e863b4abd5c65eedbd8f90b4abc178fb93639a1a}";
    private static final String apiToken = "577f87700cf555a346e339d8191a0e81b46d15bfa842bcfb8ff50b0e583d73bb";

    /**
     * Получение логина пользователя
     *
     * @return
     */
    public static String getUserLogin() {
        return userLogin;
    }

    /**
     * Получение пароля пользователя
     *
     * @return
     */
    public static String getUserPassword() {
        return userPassword;
    }

    /**
     * Получение URL продукта
     *
     * @return
     */
    public static String getUrl() {
        return url;
    }

    /**
     * Получение шаблона для ввода
     *
     * @return
     */
    public static String getTemplate() {
        return template;
    }

    /**
     * Получение уникального шаблона для ввода
     *
     * @return
     */
    public static String getRandomTemplate() {
        return template.concat(String.valueOf(Math.random()));
    }

    /**
     * Получение ключа
     *
     * @return
     */
    public static String getApiKey() {
        return apiKey;
    }

    /**
     * Получение токена
     *
     * @return
     */
    public static String getApiToken() {
        return apiToken;
    }

    /**
     * Получение ключа
     *
     * @return
     */
    public static String getBaseUrl (){
        return baseUrl;
    }
}
