/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sonnt
 */
public class TVK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1_1 = "aaa33bbcc35";
        int countNumbers = TVK2.CountNumber(input1_1);
        System.out.println(countNumbers); //PRINT CODE -->4;

        String input1_2 = "aaabbccdd";
        countNumbers = TVK2.CountNumber(input1_2);
        System.out.println(countNumbers); //PRINT CODE -->0;

        String input2_1 = "aaa33bbcc35";
        int sumNumbers = TVK2.SumNumber(input2_1);
        System.out.println(sumNumbers); //PRINT CODE -->68;

        String input2_2 = "aaabbcc";
        sumNumbers = TVK2.SumNumber(input2_2);
        System.out.println(sumNumbers); //PRINT CODE -->0;

        String input2_3 = "13aaabbcc6";
        sumNumbers = TVK2.SumNumber(input2_3);
        System.out.println(sumNumbers); //PRINT CODE -->19;

    }

    private static int CountNumber(String input1) {
        int result = 0;
        
        String[] s = input1.split("");
        for (String string : s) {
            if(string.charAt(0) >= '0' && string.charAt(0) <= '9') {
                result++;
            }
        }
        return result;

    }

    private static int SumNumber(String input2_1) {
        int result = 0;

        String[] numbers = input2_1.split("\\D+");

        for (String number : numbers) {
            if (!number.isEmpty()) {
                result += Integer.parseInt(number);
            }
        }
        
        return result;
    }

}
