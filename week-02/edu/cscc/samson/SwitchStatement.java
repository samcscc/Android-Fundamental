package edu.cscc.samson;

/**
 * Created by OWNER on 1/28/2016.
 */
import java.lang.*;
public class SwitchStatement {

    public static void main(String[] args) {
        String windDirection = "west";

        switch (windDirection ){

            case "north":
                System.out.println("The wind is blowing from the north.");
                break;

            case "south":
                System.out.println("The wind is blowing from the south.");
                break;

            case "west":
                System.out.println("The wind is blowing from the west.");
                break;

            case "east":
                System.out.println("The wind is blowing from the east.");
                break;
            default :
                System.out.println("I don't know the direction");
        }


    }
}
