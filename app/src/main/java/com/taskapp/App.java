package com.taskapp;

import com.taskapp.logic.UserLogic;
import com.taskapp.ui.TaskUI;
import com.taskapp.model.User;

public class App {
    private static final UserLogic USER_LOGIC = new UserLogic();
    private static User loginUser;
    public static void main(String[] args) {
        TaskUI ui = new TaskUI();
        ui.inputLogin();
        ui.displayMenu();
    }

    //ログインに必要な処理を受け付ける
}
