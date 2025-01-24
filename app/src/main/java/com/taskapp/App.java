package com.taskapp;

import com.taskapp.logic.UserLogic;
import com.taskapp.ui.TaskUI;
import com.taskapp.model.User;

public class App {
    public static void main(String[] args) {
        TaskUI ui = new TaskUI();
        ui.inputLogin();
        ui.displayMenu();
    }
}
