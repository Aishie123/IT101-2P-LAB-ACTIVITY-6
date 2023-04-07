// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

public class Activity3 {
    private static int max;
    private static int[] nums;

    public static void main(String[] args){
        int lowest, highest;

        enterMax();
        nums = new int[max];

        for (int i = 0; i < max; i++){ enterInteger(i); }

        lowest = findLowest();
        highest = findHighest();

        displayNumbers(lowest, highest);
    } // end of main

    private static void displayNumbers(int lowest, int highest){
        StringBuilder text = new StringBuilder("-- Activity 3 --");
        text.append("\nCreated by: Aisha Nicole L. Dones").append("\n\nMax Capacity\t: ").append(max).append("\n");
        for (int num : nums){
            text.append("\nInput integer\t: ").append(num);
        }
        text.append("\n\nThe lowest is ").append(lowest);
        text.append("\nThe highest is ").append(highest);

        JTextArea textArea = new JTextArea(text.toString());
        JScrollPane scrollArea = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static int findLowest(){
        int n = nums[0];
        for (int num : nums){
            if (num < n){n = num;}
        }
        return n;
    } // end of findLowest method

    private static int findHighest(){
        int n = nums[0];
        for (int num : nums){
            if (num > n){n = num;}
        }
        return n;
    } // end of findHighest method

    private static void enterInteger(int index){
        try {
            nums[index] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer "
                    + (index + 1) + ": "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter an integer.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger(index);
        }
    } // end of enterInteger method

    private static void enterMax(){
        try {
            max = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter max capacity: "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter a positive number",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterMax();
        }
    } // end of enterMax method

} // end of class
