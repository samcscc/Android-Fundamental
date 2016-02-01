package edu.cscc.samson;
/*
Name : Samson Taddesse
Cougar Id: 1122773
Course : Android Development for Java
 */

/**
 * Created by @Samson T. on 2/1/2016.
 */
public class WeeklyTemp {

    // Main method
    public static void main(String[] args) {

        // array variables
        int[] tempFar = {45,29,10,22,41,28,33};
        double [] weeklyPercip = {0.95,0.6,0.25,0.05,0.0,0.75,0.9};
        String[] weekOfDay = {"Mon","Tue","Wed","Thur","Fri","sat","sun"};

        // looping through the arrays
        for (int i = 0; i < tempFar.length; i++){
         if (tempFar[i] <= 32 ){
             for (int j = i ; j < weeklyPercip.length; j++){
                 if (weeklyPercip[j] > 0.5){
                     for (int k = j; k < weekOfDay.length; k++){
                         if (k == i){
                             System.out.println(weekOfDay[k]);
                         }
                     }
                 }
             }
         }

        }
    }
}
