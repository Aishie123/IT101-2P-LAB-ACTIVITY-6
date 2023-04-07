// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;
import java.util.Arrays;

public class Activity4 {

    private static int[] nums;
    private static int number, ctr = 1;
    private static boolean stopInput = false;
    private static StringBuilder strNums = new StringBuilder();
    private static final StringBuilder text = new StringBuilder("-- Activity 4 --");

    public static void main(String[] args){

        while(!stopInput){
            enterInteger();
            if (!stopInput){
                strNums.append(number).append(", ");
            }
        } // end of while

        strNums = new StringBuilder(strNums.substring(0, strNums.length() - 2));
        nums = new int[ctr - 1];

        String[] numbersArray = String.valueOf(strNums).split(", "); // splitting string by spaces
        for (int i = 0; i < numbersArray.length; i++){ nums[i] = Integer.parseInt(numbersArray[i]); }

        Arrays.sort(nums);
        displayNumbers();
    } // end of main

    private static void displayNumbers(){
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nThe array values are:\n").append(strNums).append("\n");
        int i = 0;
        int n;
        while( i < nums.length ){
            n = countN(nums[i]);
            System.out.println(n);
            if (n > 1){
                text.append("\n").append(nums[i]).append("\t-> ").append(n).append(" times");
                i+=n;
            } else { i++; }
        } // end of while

        JTextArea textArea = new JTextArea(String.valueOf(text));
        JScrollPane scrollArea = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static int countN(int n){
        int count = 0;
        for (int num : nums){
            if (num == n){count++;}
        } return count;
    } // end of countN method

    private static void enterInteger(){
        try {
            String str = JOptionPane.showInputDialog(null, "Enter integer " + ctr +
                    ": (Leave blank to stop)");
            if (str.equals("")){
                if (ctr >= 20){
                    stopInput=true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter at least 20 integers.",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    enterInteger();
                }
            }
            else{number = Integer.parseInt(str); ctr++;}
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "INVALID INPUT! Please enter an integer, or leave blank to stop input.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger();
        }
    } // end of enterInteger method

} // end of class
