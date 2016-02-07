package edu.cscc.samson;/*
Name : Samson Taddesse
Course : Android Development for Java
Cougar Id: 1122773
 */

/**
 * Created by @samson  on 1/28/2016.
 */
public class AverageTemp {

    public static void main(String[] args) {
        String CityName = "Columbus";
        int zipCode = 43215;
        int[] highTemp = {32,25,27,40,40};

        double average = (highTemp[0] + highTemp[1] +highTemp[2] +highTemp[3] + highTemp[4])/5.0;

        System.out.println("City name: " + CityName);
        System.out.println("Zip code :" + zipCode);
        System.out.println("Average temprature: " + average);

    }


}
