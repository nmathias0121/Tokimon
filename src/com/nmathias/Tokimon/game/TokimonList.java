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
}