package day29_CustomMethods;
/*
 1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "D", "E", "F"};

        for(String a : arr){// gets each off the element

            int count = 0;
            for(String each : arr){ //gets the frequency of the element
                if(a.equals(each)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a+ " ");
            }
        }










    }

}
