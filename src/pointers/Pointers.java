package pointers;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] args) {

//        Variables
        int  num1 = 11;
        int num2 = num1; //11
        num1 = 22; // num2 remains 11 (values doesn't change)

        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

//        pointers
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("value", 11);
        map2 = map1; // both value become 22 (value change with map1)
        map1.put("value", 22);

        System.out.println("map1: "+map1);
        System.out.println("map2: "+map2);
    }
}
