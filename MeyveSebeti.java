package arraylist;

import java.util.ArrayList;

public class MeyveSebeti {


    public static void main(String[] args) {


        ArrayList<String> meyveler = new ArrayList<>();


        meyveler.add("Alma");
        meyveler.add("Armud");
        meyveler.add("Portağal");


        System.out.println("Sebetden Goturulen Meyve Budur : " + meyveler.get(1));
        System.out.println("Yerde Qalan Meyveler ise Bunlardir : " + meyveler.get(0) + " : " + meyveler.get(2));

    }


}
