
/*
* File: MainConsole.java
* Author: Balogh Csenge
* Copyright: 2023, Balogh Csenge
* Group: Szoft_II_N
* Date: 2023-02-21
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

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
