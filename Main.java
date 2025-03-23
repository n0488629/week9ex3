import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner object
      
      System.out.println("Welcome to Temperature Converter");
      System.out.print("Enter the temperature: ");
      float tempf = myObj.nextFloat();
       
      float tempc = (5f/9f)*(tempf - 32);

      System.out.println(tempf + " F degree is equivalent to " + tempc + "C");
      

      
      myObj.close(); // close scanner object
    }
  }