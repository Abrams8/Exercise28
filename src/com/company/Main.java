package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String newText = in.nextLine();
        newText = newText.trim();

        Pattern p = Pattern.compile("\\W+");
        Matcher m = p.matcher(newText);
        while (m.find()) {
            int a = m.start() - 1;
            System.out.print(newText.charAt(a));
        }
        Pattern pLast = Pattern.compile("\\w$");
        Matcher mLast = pLast.matcher(newText);
        while (mLast.find()) {
            int a = mLast.start();
            System.out.print(newText.charAt(a));
        }
    }
}
