package edu.angel.viveros.actividad1.ui;

import edu.angel.viveros.actividad1.process.Switch;

public class CLI {
    public static void start(){
        Switch switch_wifi;
        switch_wifi = new Switch();
        System.out.println("hola, bienvenido al programa");
        System.out.println("Estado inicial del switch: "+ (switch_wifi.isOn()));
        if(switch_wifi.isOn()) {
            System.out.println("desea apagar el switch");
        }else {
            System.out.println("desea prender el switch");
        }
        System.out.println("el swtich esta "+switch_wifi.isOn());
    }
}