package controllers;

import models.RestApi;
import views.MainConsole;

public class MainController {

    MainConsole console;
    RestApi api;

    public MainController() {
        this.console = new MainConsole();
        this.api = new RestApi();
    }
}