
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author ADMIN
 */
public class DemoQ1 {

//    public static void main(String[] args) {
//        String s = "a 10 b 20";
//        int result = 0;
//
//        String regex = "0";
//
//        for (int i = 0; i < s.length(); i++) {
//            if ((int) s.charAt(i) >= '0' && (int) s.charAt(i) <= '9') {
//                regex += s.charAt(i);
//            } else {
//                result += Integer.parseInt(regex);
//                regex = "0";
//            }
//        }
//        result += Integer.parseInt(regex);
//
//        System.out.println(result);
//    }
    
        public static void main(String[] args) {
        String s = "a 10 b 20 kjasjdkjasndkjasnkjasndkjasnd 123";
        int result = 0;

        String[] numbers = s.split("\\D+");

        for (String number : numbers) {
            if (!number.isEmpty()) {
                result += Integer.parseInt(number);
            }
        }

        System.out.println(result);
    }
}
