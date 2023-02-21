package views;

import java.util.ArrayList;

import models.Property;

public class MainConsole {
    
    public MainConsole() {

    }

    public void printProperties(ArrayList<Property> props) {
        
        for (Property prop : props) {
            System.out.println(prop.getCity());
        }
    }
}
