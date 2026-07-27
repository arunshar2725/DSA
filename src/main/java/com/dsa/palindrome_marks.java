package com.dsa;

import java.io.CharArrayReader;

public class palindrome_marks {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
                if (!Character.isLetterOrDigit(str.charAt(i))) {
                    i++;
                } else if (!Character.isLetterOrDigit(str.charAt(j))) {
                    j--;
                } else if (Character.toLowerCase(str.charAt(i))
                        != Character.toLowerCase(str.charAt(j))) {

                    System.out.println("Not Palindrome");
                    return;
                }
                    else{
                        i++;
                        j--;
                    }

                }
                System.out.println("Palindrome");
            }
        }
