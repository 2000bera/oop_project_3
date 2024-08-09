package com.mycompany.testprogramcar;

public class Car_two extends Car
{
    private String carBody;

    public Car_two() 
    {
        
    }  

    public Car_two(String carBody, String carName, String carBrand, double carSize, int carPerformance, String carQuality, String carMileage, double carLoan, double carInterest, int carLoanTerms) 
    {
        super(carName, carBrand, carSize, carPerformance, carQuality, carMileage, carLoan, carInterest, carLoanTerms);
        this.carBody = carBody;
    }

    public void setCarBody(String carBody) 
    {
        this.carBody = carBody;
    }

    public String getCarBody() 
    {
        return carBody;
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
        System.out.println("Car Body: " + carBody);
        System.out.println("Car montly payment: R" + montlyPayment());
    }
    
}
