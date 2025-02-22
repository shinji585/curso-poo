package Interfaces3.Main;

import Interfaces3.Service.Robot;
import Interfaces3.Util.*;
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // solicitamos valores para el robot 
        System.out.println("ingrese lo que el robot quiere decir");
        String valor = Util.validaString();
        robot.Hablar(valor);

    }
}
