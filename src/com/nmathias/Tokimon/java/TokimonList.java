/**
 * @author Neil Mathias
 * @version 1.0
 * Performs operations on tokimons such as adding and removing tokimons, altering the strength of tokimons, listing ca.sfu.cmpt213.as1.main menu and listing tokimons.
 */
package src.com.nmathias.Tokimon.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TokimonList {
    private static final List<Tokimon> tokiList = new ArrayList<>();

    public static List<Tokimon> getTokimonList() {
        return tokiList;
    }

    /*
    Display a main menu for the user to select the desired operation to
    be performed on the Tokimon
     */
    public static void displayMainMenu() {
        for (int i = 0; i < 13; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("* Main Menu *\n");
        for (int i = 0; i < 13; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("1. List Tokimons\n");
        System.out.print("2. Add a new Tokimon\n");
        System.out.print("3. Remove a Tokimon\n");
        System.out.print("4. Change Tokimon strength\n");
        System.out.print("5. DEBUG: Dump objects (toString)\n");
        System.out.print("6. Exit\n");
    }

    /*
    Display the entire list of Tokimons so that the user can keep track
    and find a particular Tokimon much more efficiently
     */
    public static void displayAllTokis() {
        for (int i = 0; i < 21; i++) {
            System.out.print("*");
        }

        System.out.print("\n");
        System.out.print("* List of Tokimons: *\n");

        for (int i = 0; i < 21; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        for (int i = 0; i < tokiList.size(); i++) {
            System.out.print((i + 1) + ". Toki " + tokiList.get(i).getName() + ", "
                    + tokiList.get(i).getHeight() + "m height, "
                    + tokiList.get(i).getWeight() + "g weight, "
                    + tokiList.get(i).getType() + " ability, "
                    + tokiList.get(i).getStrength() + " strength\n");
        }
    }

    /*
    Add a new Tokimon to the list after enquiring the user about the characteristics of the Tokimon
    */
    public static void addNewToki() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Tokimon's name: ");
        String name = input.nextLine();

        System.out.print("Enter Tokimon's type: ");
        String type = input.nextLine();

        System.out.print("Enter Tokimon's height: ");
        double height = input.nextDouble();

        System.out.print("Enter Tokimon's weight: ");
        double weight = input.nextDouble();

        Tokimon toki = new Tokimon(name, type, height, weight, 0);
        tokiList.add(toki);
    }

    /*
    Remove the desired Tokimon from the list
     */
    public static void deleteToki() {
        displayAllTokis();
        System.out.print("(Enter 0 to cancel)");

        System.out.print("Enter the tokimon number to be deleted: ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if (option <= tokiList.size()) {
            tokiList.remove(option - 1);
        } else {
            while (option > tokiList.size() || option <= 0) {
                System.out.print("Sorry, Wrong input. Try again: ");
                option = input.nextInt();
            }
            tokiList.remove(option - 1);
        }
    }

    /*
    Change the strength of the desired Tokimon
     */
    public static void alterToki() {
        displayAllTokis();
        System.out.print("(Enter 0 to cancel)");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if (option == 0) {
            return;
        } else {
            while (option > tokiList.size() || option < 0) {
                System.out.print("Wrong input. Please try again: ");
                option = input.nextInt();
            }
            System.out.print("By how much?: ");
            double str = input.nextDouble();
            while (str < 0 || str > 100) {
                System.out.print("Wrong input. Please try again: ");
                str = input.nextDouble();
            }
            tokiList.get(option - 1).setStrength(str);
            System.out.print("Toki " + tokiList.get(option - 1).getName()
                    + " now has strength " + str + "!\n");
        }
    }
}
