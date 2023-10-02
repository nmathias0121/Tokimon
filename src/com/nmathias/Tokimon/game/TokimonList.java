/**
 * @author Neil Mathias
 * @version 1.0
 * Performs operations on tokimons such as adding and removing tokimons, altering the strength of tokimons, listing ca.sfu.cmpt213.as1.main menu and listing tokimons.
 */
package com.nmathias.Tokimon.game;

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

}