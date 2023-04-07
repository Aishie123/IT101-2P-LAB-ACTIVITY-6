// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

public class Activity7 {

    private static final int[] arr = new int[10];
    private static int val;

    public static void main(String[] args){

        for (int i = 0; i < arr.length; i++){
            enterInteger(i);
        }
        searchValue();
        displayNumbers();
    } // end of main

    private static void displayNumbers(){
        StringBuilder text = new StringBuilder("-- Activity 7 --");
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nIf array elements are:\n");
        for (int num : arr){
            text.append(num).append(", ");
        }
        text = new StringBuilder(text.substring(0, text.length() - 2)); // removes last 2 characters
        text.append(".").append("\n\nSearch a value: ").append(val);

        if (valueFound()){
            text.append("\n").append(val).append(" is Found at ");
            text.append(findIndex());
        } else{
            text.append("\n").append(val).append(" is NOT Found.");
        }

        JTextArea textArea = new JTextArea(String.valueOf(text));
        JScrollPane scrollArea = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static boolean valueFound(){
        boolean found = false;
        for (int num : arr){
            if (val == num) { found = true; break; }
        }
        return found;
    } // end of valueFound method

    private static String findIndex(){
        StringBuilder strIndex = new StringBuilder("index: ");
        for (int i = 0; i < arr.length; i++){
            if (val == arr[i]){
                strIndex.append(i).append(", ");
            }
        }
        strIndex = new StringBuilder(strIndex.substring(0, strIndex.length() - 2)); // removes last 2 characters
        return String.valueOf(strIndex.append("."));
    } // end of findIndex method

    private static void searchValue(){
        try {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, "Search a value: "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter an integer.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            searchValue();
        }
    } // end of enterInteger method

    private static void enterInteger(int i){
        try {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer " +
                    (i + 1) + ": "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter an integer.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger(i);
        }
    } // end of enterInteger method

} // end of class
