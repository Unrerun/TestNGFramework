package TestPackage;


/**
 * Данный класс при обращении к методу возвращает определенные тестовые данные.
 */

public class TestData {

    private static final String userLogin = "TrelloTestUser@yandex.ru";
    private static final String userPassword = "TrelloTestUser";
    private static final String url = "https://trello.com/";
    private static final String template = "TrelloTestUser";

    /**
     * Получение логина пользователя
     * @return
     */
    public static String getUserLogin() {
        return userLogin;
    }

    /**
     * Получение пароля пользователя
     * @return
     */
    public static String getUserPassword() {
        return userPassword;
    }

    /**
     * Получение URL продукта
     * @return
     */
    public static String getUrl() {
        return url;
    }

    /**
     * Получение шаблона для ввода
     * @return
     */
    public static String getTemplate() {
        return template;
    }

    /**
     * Получение уникального шаблона для ввода
     * @return
     */
    public static String getRandomTemplate() {
        return template.concat(String.valueOf(Math.random()));
    }
}
