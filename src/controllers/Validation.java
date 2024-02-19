package controllers;

import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    
    public int inputNum() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }

    
    public float inputFloat() {
        try {
            return Float.parseFloat(sc.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }
    
    
    public String inputString() {
        return sc.nextLine().trim();
    }
    
    public boolean checkNum(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkDate(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i == 2 || i == 5) {
                if (s.charAt(i) != '/') {
                    return false;
                }
            } else {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
