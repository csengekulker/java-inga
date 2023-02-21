package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Property;
import models.RestApi;
import views.MainConsole;

public class MainController {

    MainConsole console;
    RestApi api;

    public MainController() {
        this.console = new MainConsole();
        this.api = new RestApi();
        this.showProperties();
    }

    private void showProperties() {
        String res = this.api.getProperties();
        ArrayList<Property> propList = convertStringToArray(res);

        this.console.printProperties(propList);
    }

    private ArrayList<Property> convertStringToArray(String text) {
        ArrayList<Property> propList = null;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        Property[] propArray = gson.fromJson(text, Property[].class);

        propList = new ArrayList<>(Arrays.asList(propArray));

        return propList;
        
    }
}