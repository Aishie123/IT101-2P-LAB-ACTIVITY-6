// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;
import java.util.Arrays;

public class Activity9 {

    private static final String[] arr = new String[10];
    private static String val;
    private static int atIndex;

    public static void main(String[] args){

        for (int i = 0; i < arr.length; i++){
            enterInteger(i);
        }
        displayNumbers();
    } // end of main

    private static void displayNumbers(){
        StringBuilder text = new StringBuilder("-- Activity 9 --");
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nIf you have pets:\n");
        text.append(Arrays.toString(arr));

        searchValue();
        text.append("\n\nNew pet name: ").append(arr[atIndex]).append("\n");
        text.append(Arrays.toString(arr));

        JTextArea textArea = new JTextArea(String.valueOf(text));
        JScrollPane scrollArea = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static boolean valueFound(){
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            if (val.equalsIgnoreCase(arr[i])) { atIndex = i; found = true; break; }
        }
        return found;
    } // end of valueFound method

    private static void searchValue(){
        try {
            val = JOptionPane.showInputDialog(null, "Type pet name: ");
            // capitalizing initial letter
            val = val.substring(0, 1).toUpperCase() + val.substring(1).toLowerCase();

            if (!valueFound()){
                JOptionPane.showMessageDialog(null, val + " is NOT FOUND",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                searchValue();
            } else {
                enterNewVal(atIndex);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter an integer.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            searchValue();
        }
    } // end of enterInteger method

    private static void enterNewVal(int atIndex){
        try {
            arr[atIndex] = JOptionPane.showInputDialog(null, "Enter a new pet name: ");
            // capitalizing initial letter
            arr[atIndex] = arr[atIndex].substring(0, 1).toUpperCase() + arr[atIndex].substring(1).toLowerCase();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterNewVal(atIndex);
        }
    } // end of enterInteger method

    private static void enterInteger(int i){
        try {
            arr[i] = JOptionPane.showInputDialog(null, "Enter pet name " + (i + 1) + ": ");
            // capitalizing initial letter
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger(i);
        }
    } // end of enterInteger method

} // end of class
