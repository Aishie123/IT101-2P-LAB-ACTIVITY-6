// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

@SuppressWarnings({"StringConcatenationInLoop", "ForLoopReplaceableByForEach"})
public class Activity1 {

    private static final int[] num = new int[10];
    private static int atIndex = 0;

    public static void main(String[] args){

        int first=0, last=0;

        String all="";

        //a. Loop to store 10 numbers to array

        for (int i = 0; i < num.length; i++) {
            enterInteger(i);
        }

        //b. Loop to display values from Array - use 'all.'
        for (int i = 0; i < num.length; i++) {
            all += num[i] + " ";
        }
        JOptionPane.showMessageDialog(null,"Array Elements are\t: "+all);

        //Codes here to determine the first value
        first = num[0];
        JOptionPane.showMessageDialog(null,"The first value is \t: "+first);

        //Codes here to determine the last value
        last = num[num.length-1];
        JOptionPane.showMessageDialog(null,"The last value is\t: "+last);

        //Codes here to determine the search value through the index
        searchValue();

        //Codes here to change a value of array elements through the index
        num[atIndex] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        JOptionPane.showMessageDialog(null, new JTextArea("The value at index "+atIndex+" is now\t: "+num[atIndex]+
                "\n\nCreated by: Aisha Nicole L. Dones"));
    } // end of main

    private static void searchValue(){
        try{
            atIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter index (0-9): "));
            JOptionPane.showMessageDialog(null,"The value at index "+atIndex+" is\t: "+num[atIndex]);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter a value from 0 to 9.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            searchValue();
        }
    } // end of searchValue method

    private static void enterInteger(int i){
        try {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer " + (i + 1) + ": "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            enterInteger(i);
        }
    } // end of enterInteger method

} // end of class
