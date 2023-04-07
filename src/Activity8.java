// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

public class Activity8 {

    private static final String[] arr = new String[10];
    private static String val;

    public static void main(String[] args){

        for (int i = 0; i < arr.length; i++){
            enterInteger(i);
        }
        searchValue();
        displayNumbers();
    } // end of main

    private static void displayNumbers(){
        StringBuilder text = new StringBuilder("-- Activity 8 --");
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nIf your array contains the following pets:\n");
        for (String name : arr){
            text.append(name).append(", ");
        }
        text = new StringBuilder(text.substring(0, text.length() - 2)); // removes last 2 characters
        text.append("\n\nType pet name: ").append(val);

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
        for (String name : arr){
            if (val.equalsIgnoreCase(name)) { found = true; break; }
        }
        return found;
    } // end of valueFound method

    private static String findIndex(){
        StringBuilder strIndex = new StringBuilder("index: ");
        for (int i = 0; i < arr.length; i++){
            if (val.equalsIgnoreCase(arr[i])){
                strIndex.append(i).append(", ");
            }
        }
        strIndex = new StringBuilder(strIndex.substring(0, strIndex.length() - 2)); // removes last 2 characters
        return String.valueOf(strIndex);
    } // end of findIndex method

    private static void searchValue(){
        try {
            val = JOptionPane.showInputDialog(null, "Type pet name: ");
            // capitalizing initial letter
            val = val.substring(0, 1).toUpperCase() + val.substring(1).toLowerCase();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            searchValue();
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
