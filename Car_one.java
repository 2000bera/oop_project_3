package com.mycompany.testprogramcar;

public class Car_one extends Car
{
    private String carColor;

    public Car_one() 
    {
        
    }

    public Car_one(String carColor, String carName, String carBrand, double carSize, int carPerformance, String carQuality, String carMileage, double carLoan, double carInterest, int carLoanTerms) 
    {
        super(carName, carBrand, carSize, carPerformance, carQuality, carMileage, carLoan, carInterest, carLoanTerms);
        this.carColor = carColor;
    }

    public void setCarColor(String carColor) 
    {
        this.carColor = carColor;
    }

    public String getCarColor() 
    {
        return carColor;
    }
            
    @Override
    public double montlyPayment() 
    {
        double interest = getCarInterest() / 12 / 100;
        double dividend = interest * Math.pow((1 + interest), getCarLoanTerms());
        double divisor = (Math.pow((1 + interest), getCarLoanTerms())) - 1;
        
        if(divisor == 0) {
            System.out.println("Maths Error");
        }
        
        return getCarLoan() * dividend / divisor;
    }

    
    @Override
    public void carDisplayInfo() 
    {
        super.carDisplayInfo();
        System.out.println("Car Color: " + carColor);
        System.out.println("Car montly payment: R" + montlyPayment());
    }
}
