package day36_ArrayList;
/*
 3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}

 */

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);


        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for(int i = 0; i <= list.size()-1; i++){

            Integer element = list.get(i);

            int count = 0;
            for(Integer each : list){ // finds the frequency of element
                if(each == element){
                    count++;
                }
            }

            if(count == 1){  // to verify if element is unique
                uniques.add(element);
            }
        }

        System.out.println(uniques);



    }

}
