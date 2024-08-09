package com.mycompany.testprogramcar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestProgramCar 
{   
    
    public static void main(String[] args) 
    {
        Car[] cars = new Car[25];
        int index = 0;
        
        try {
            File myFile = new File("C:\\Users\\cash\\Documents\\NetBeansProjects\\TestProgramCar\\src\\main\\java\\com\\mycompany\\testprogramcar\\carInfo.txt");
            Scanner scan = new Scanner(myFile);
            
            while(scan.hasNextLine() && index < cars.length) {
                String line = scan.nextLine();
                String data[] = line.split("\\#");
                String carName = data[2];
                String carBrand = data[3];
                double carSize = Double.valueOf(data[4]);
                int carPerformance = Integer.parseInt(data[5]);
                String carQuality = data[6];
                String carMileage = data[7];
                double carLoan = Double.valueOf(data[8]);
                double carInterest = Double.valueOf(data[9]);
                int carLoanTerms = Integer.parseInt(data[10]);
                
                if(data[0].equalsIgnoreCase("Car_one")) { 
                    String carColor = data[1];
                    
                    cars[index++] = new Car_one(carColor, carName, carBrand, carSize, carPerformance, carQuality, carMileage, carLoan, carInterest, carLoanTerms);
                }
                else if(data[0].equalsIgnoreCase("Car_two")) { 
                    String carBody = data[1];
                    
                    cars[index++] = new Car_two(carBody, carName, carBrand, carSize, carPerformance, carQuality, carMileage, carLoan, carInterest, carLoanTerms);
                }
            }
            
            scan.close();
        }catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        
        Arrays.sort(cars, 0, index);
        
        for (Car carDisplay : cars) {
            if(carDisplay != null) {
                if(carDisplay instanceof Car_one) {
                    System.out.println("For Car One");
                    carDisplay.carDisplayInfo();
                    System.out.println();
                }
                else if(carDisplay instanceof Car_two) {
                    System.out.println("For Car Two");
                    carDisplay.carDisplayInfo();
                    System.out.println();
                }
            }
        }
    }
}
