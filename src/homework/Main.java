/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Max
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan1 = new Scanner(System.in);
        String input1 = scan1.nextLine().toLowerCase().replaceAll("[^a-zà-ÿA-ZÀ-ß $]", "");

        Map<String, Integer> m1 = new HashMap<>();
        String[] spitted = input1.split(" ");

        for (String str : spitted) {
            m1.put(str, 0);
        }
        
        for (String str : spitted) {
            if (m1.containsKey(str)) {
                int i = m1.get(str);
                i++;
                m1.put(str, i);
            }
        }

        System.out.println(m1);
    }

}
