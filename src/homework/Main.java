/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        String nextline = null;
        String inputstring = "";
        System.out.println("Enter big text. in the end print - end");
        while ((nextline = scan1.nextLine()) != "end") {
            if (nextline.equals("end")) {
                break;
            } else {
                inputstring = inputstring + " " + nextline;
            }
        }
        System.out.println(inputstring);
        String forsplit = inputstring.toLowerCase().replaceAll("[^a-zа-яA-ZА-Я $]", "");

        Map<String, Integer> m1 = new HashMap<>();
        String[] spitted = forsplit.split(" ");

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
        System.out.println("Колиство слов в тексте - " + spitted.length);
        System.out.println("Колиство уникальных слов в тексте - " + m1.size());

    }
}
