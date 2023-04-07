// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

public class Activity5 {

    private static final int[] arr = new int[10];
    private static final int[] reverse = new int[10];

    public static void main(String[] args){

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            enterInteger(i);
        }
        reverseArr();
        displayNumbers();

    } // end of main

    private static void displayNumbers(){
        StringBuilder text = new StringBuilder("-- Activity 5 --");
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nIf array elements are:\n");
        for (int num : arr){
            text.append(num).append(", ");
        }
        text = new StringBuilder(text.substring(0, text.length() - 2)); // removes last 2 characters

        text.append("\n\nThe reverse is:\n");
        for (int num : reverse){
            text.append(num).append(", ");
        }
        text = new StringBuilder(text.substring(0, text.length() - 2)); // removes last 2 characters

        JTextArea textArea = new JTextArea(String.valueOf(text));
        JScrollPane scrollArea = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static void reverseArr(){
        int i = 9;
        for (int num : arr){
            reverse[i] = num;
            i--;
        }
    } // end of reverseArr method

    private static void enterInteger(int i){
        try {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter integer " + (i + 1) + ": "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger(i);
        }
    } // end of enterInteger method

} // end of class
