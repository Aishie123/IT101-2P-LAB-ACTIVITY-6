// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

@SuppressWarnings("MismatchedReadAndWriteOfArray")
public class Activity2 {
    private static int sizeOdd, sizeEven, sizeNeg, sizePos;
    private static final int[] nums = new int[10];

    private static StringBuilder strOdd, strEven, strNeg, strPos;

    public static void main(String[] args){
        sizeOdd = sizeEven = sizeNeg = sizePos = 0;
        strOdd = new StringBuilder();
        strEven = new StringBuilder();
        strNeg = new StringBuilder();
        strPos = new StringBuilder();

        for (int i = 0; i < nums.length; i++){
            enterInteger(i);
        }
        findOddEven();
        findNegPos();
        displayNumbers();
    } // end of main

    private static void displayNumbers(){
        String text = "All odd numbers: \n" + strOdd +
                "\n\nAll even numbers: \n" + strEven +
                "\n\nAll negative numbers: \n" + strNeg +
                "\n\nAll positive numbers: \n" + strPos +
                "\n\nCreated by: Aisha Nicole L. Dones";
        JTextArea textArea = new JTextArea(text);
        JScrollPane scrollArea = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of displayNumbers method

    private static void findOddEven(){
        int o = 0, e = 0;

        for (int num : nums){
            if (num%2 != 0){ sizeOdd++; } else { sizeEven++; }
        }

        int[] odd = new int[sizeOdd];
        int[] even = new int[sizeEven];

        for (int num : nums){
            if (num%2 != 0){
                odd[o++] = num;
                strOdd.append(num).append(" ");
            } else{
                sizeEven++;
                even[e++] = num;
                strEven.append(num).append(" ");
            }
        } // end of for
    } // end of findOddEven method
    private static void findNegPos(){
        int n = 0, p = 0;
        for (int num : nums){
            if (num < 0){ sizeNeg++; } else if (num > 0) { sizePos++; }
        }

        int[] neg = new int[sizeNeg];
        int[] pos = new int[sizePos];

        for (int num : nums){
            if (num < 0){
                neg[n++] = num;
                strNeg.append(num).append(" ");
            }
            else if (num > 0){
                pos[p++] = num;
                strPos.append(num).append(" ");
            }
        } // end of for
    } // end of findNegPos method

    private static void enterInteger(int i){
        try {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter integer " + (i + 1) + ": "));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please try again.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            enterInteger(i);
        }
    } // end of enterInteger method

} // end of class
