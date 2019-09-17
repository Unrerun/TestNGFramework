package TestPackage.DataPackage;

import TestPackage.Utils.Storage;

public class Endpoints {

    public static String boards() {
        return "/boards";
    }

    public static String currentBoard() {
        return "/boards/" + Storage.get("BoardId");
    }

    public static String defaultList() {
        return "/boards/" + Storage.get("BoardId") + "/lists/open";
    }

    public static String createdList() {
        return "/lists/" + Storage.get("defaultListId");
    }

    public static String lists() {
        return "/lists";
    }

    public static String nameOfCreatedList() {
        return "/lists/" + Storage.get("createdListID") + "/name";
    }

    public static String cards() {
        return "/cards";
    }

    public static String createdCard() {
        return "/cards/" + Storage.get("createdCardID");
    }

    public static String checklist() {
        return "/cards/" + Storage.get("createdCardID") + "/checklists";
    }

    public static String checklistItems() {
        return "/checklists/" + Storage.get("checkListID") + "/checkItems";
    }

    public static String firstChecklistItemCondition() {
        return "/cards/" + Storage.get("createdCardID") + "/checkItem/" + Storage.get("checkListItemID 1");
    }
}
