package TestPackage;


/**
 * Данный класс при обращении к методу возвращает определенные тестовые данные.
 */

public class TestData {

    private static String userLogin = "TrelloTestUser@yandex.ru";
    private static String userPassword = "TrelloTestUser";
    private static String url = "https://trello.com/";
    private static String template = "TrelloTestUser";

    public static String getUserLogin() {
        return userLogin;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static String getUrl() {
        return url;
    }

    public static String getTemplate() {
        return template;
    }

}
