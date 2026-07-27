package com.dsa;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Size_K {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str = "abciiidef";

        int k = 3;
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }

            int max = count;

            for (int i = k; i < str.length(); i++) {
                if(isVowel(str.charAt(i-k))){
                    count--;
                }
                if(isVowel(str.charAt(i))){
                    count++;
                }
                if(count>max){
                    max=count;
                }
            }
            System.out.println(max);
        }


}
