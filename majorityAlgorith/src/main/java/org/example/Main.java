package org.example;

import java.util.HashMap;

public class Main {
    //Moore's Voting Algorithm
//    public static int majorityElement(int[] arrayOfNums) {
//        int count = 0;
//        int candidate = 0;
//        for (int num : arrayOfNums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        System.out.println("Majority element is: " + candidate);
//        return candidate;
//    }




    public static int majorityElement(int[] numsArr) {
        int count = 0;
        int candidate = 0;
        HashMap <Integer,Integer> ayOfNums = new HashMap<Integer,Integer>();
        for (int num2 :numsArr){
            ayOfNums.put(num2, 0);

        }

        for (int num : numsArr) {
            // check two conditions for each iteration, once count is zero that means count of majority == count of min
            // since they cancelled each other
            if (count == 0) {
                candidate = num;
            }
            ayOfNums.put(num, ayOfNums.get(num)+1);
            // if this number equals candidate count ++
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int max=0;
        int maxKey=0;

        for(int key:ayOfNums.keySet() ){
        	if(ayOfNums.get(key)>numsArr.length/2)
            if(max<ayOfNums.get(key) ) {
                max=ayOfNums.get(key);
                maxKey=key;}
            System.out.println("  element is: " +key);//print the element bigger major item than half of length

            
                
        }
         

        System.out.println("Majority element is: " + maxKey+"times :"+max+"  :"+count);
        return candidate;

    }

    public static void main(String[] args) {
        int[] arrayOfNums = {1,5, 4, 4, 4, 3, 4, 0, 4};
        majorityElement(arrayOfNums);
    }
}