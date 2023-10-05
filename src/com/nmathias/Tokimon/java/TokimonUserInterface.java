/**
 * @author Neil Mathias
 * @version 1.0
 * Provides an interface for the user to add, remove, alter strength, display main menu and list of tokimons.
 */
package src.com.nmathias.Tokimon.java;

import java.util.Scanner;
import static src.com.nmathias.Tokimon.java.TokimonList.*;

public class TokimonUserInterface {
    /*
    Method provides an interface for the user with the main menu.
     */
    public static void show() {
        boolean isDone = false;
        while (!isDone) {
            displayMainMenu();

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            switch (option) {
                case 1:
                    displayAllTokis();
                    break;
                case 2:
                    addNewToki();
                    break;
                case 3:
                    deleteToki();
                    break;
                case 4:
                    alterToki();
                    break;
                case 5:
                    for (Tokimon tok : getTokimonList()) {
                        System.out.println(tok.toString());
                    }
                    break;
                case 6:
                    isDone = true;
                    break;
                default:
                    System.out.println("Wrong input. Enter 6 to exit and any other number to return to the main menu: ");
                    option = input.nextInt();
                    if (option == 6) {
                        isDone = true;
                        break;
                    }
                    else {
                        show();
                        isDone = true;
                    }
                    break;
            }
        }
    }
}
