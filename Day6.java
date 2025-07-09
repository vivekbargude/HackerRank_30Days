

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        sc.nextLine();  // consume the newline after the integer
        
        // Process each string
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            printString(s);
        }
        
        sc.close();
    }
    
    public static void printString(String s){
        StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            // Loop through the string characters
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even.append(s.charAt(j));
                } else {
                    odd.append(s.charAt(j));
                }
            }
            
            // Print even-indexed and odd-indexed characters
            System.out.println(even + " " + odd);
    }

}
