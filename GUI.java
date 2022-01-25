package PedrosCompany;

import java.util.ArrayList;
import java.util.Random;

public class GUI {

    public static void main(String[] args) {
        //Names the array list commonItems
        ArrayList commonItems = new ArrayList();

        //List of Items in array list
        commonItems.add("TriTipDagger");
        commonItems.add("Tougher Times");
        commonItems.add("Bustling Fungus");
        commonItems.add("Paul's Goat Hoof");
        commonItems.add("Soldier's Syringe");

        //loops and will add as many items as are in the list
        //for (int i = 0; i < commonItems.size(); i++)

        for (int i = 0; i < 10; i++) {
            // generating the index using Math.random()
            int index = (int) (Math.random() * commonItems.size());

            System.out.println("Random Element is :"
                    + commonItems.get(index));
        }


    }

}
