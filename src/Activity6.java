// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

public class Activity6 {

    private static final int[] orig = new int[15];
    private static int[] copy = new int[15];

    public static void main(String[] args){

        for (int i = 0; i < orig.length; i++){
            enterInteger(i);
        }
        copy = orig;
        displayNumbers();
    } // end of main

    private static void displayNumbers(){
        StringBuilder text = new StringBuilder("-- Activity 6 --");
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nOriginal array:\n");
        for (int num : orig){
            text.append(num).append(", ");
        }
        text = new StringBuilder(text.substring(0, text.length() - 2)); // removes last 2 characters

        text.append("\n\nCopy array:\n");
        for (int num : copy){
            text.append(num).append(", ");
        }
        text = new StringBuilder(text.substring(0, text.length() - 2)); // removes last 2 characters

        JTextArea textArea = new JTextArea(String.valueOf(text));
        JScrollPane scrollArea = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static void enterInteger(int i){
        try {
            orig[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer "
                    + (i + 1) + ": "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger(i);
        }
    } // end of enterInteger method
} // end of class
