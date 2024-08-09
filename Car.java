package com.mycompany.testprogramcar;

public abstract class Car implements Comparable<Car>, Calculator
{
    private String carName;
    private String carBrand;
    private double carSize;
    private int carPerformance;
    private String carQuality;
    private String carMileage;
    private double carLoan;
    private double carInterest;
    private int carLoanTerms;

    public Car() 
    {
        
    }

    public Car(String carName, String carBrand, double carSize, int carPerformance, String carQuality, String carMileage, double carLoan, double carInterest, int carLoanTerms) 
    {
        this.carName = carName;
        this.carBrand = carBrand;
        this.carSize = carSize;
        this.carPerformance = carPerformance;
        this.carQuality = carQuality;
        this.carMileage = carMileage;
        this.carLoan = carLoan;
        this.carInterest = carInterest;
        this.carLoanTerms = carLoanTerms;
    }

    public void setCarName(String carName) 
    {
        this.carName = carName;
    }

    public void setCarBrand(String carBrand) 
    {
        this.carBrand = carBrand;
    }

    public void setCarSize(double carSize) 
    {
        this.carSize = carSize;
    }

    public void setCarPerformance(int carPerformance) 
    {
        this.carPerformance = carPerformance;
    }

    public void setCarQuality(String carQuality) 
    {
        this.carQuality = carQuality;
    }

    public void setCarMileage(String carMileage) 
    {
        this.carMileage = carMileage;
    }

    public void setCarLoan(double carLoan) 
    {
        this.carLoan = carLoan;
    }

    public void setCarInterest(double carInterest) 
    {
        this.carInterest = carInterest;
    }

    public void setCarLoanTerms(int carLoanTerms) 
    {
        this.carLoanTerms = carLoanTerms;
    }
    
    public String getCarName() 
    {
        return carName;
    }

    public String getCarBrand() 
    {
        return carBrand;
    }

    public double getCarSize() 
    {
        return carSize;
    }

    public int getCarPerformance() 
    {
        return carPerformance;
    }

    public String getCarQuality() 
    {
        return carQuality;
    }

    public String getCarMileage() 
    {
        return carMileage;
    }

    public double getCarLoan() 
    {
        return carLoan;
    }

    public double getCarInterest() 
    {
        return carInterest;
    }

    public int getCarLoanTerms() 
    {
        return carLoanTerms;
    }
    
    @Override
    public int compareTo(Car compare) 
    {
        return getCarName().compareToIgnoreCase(compare.getCarName());
    }

    @Override
    public abstract double montlyPayment(); 

    @Override
    public void carDisplayInfo() 
    {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Car Size: " + carSize + " mm");
        System.out.println("Car Performance: " + carPerformance + " m/s");
        System.out.println("Car Quality: " + carQuality);
        System.out.println("Car Mileage: " + carMileage + " km");
        System.out.println("Car Loan: R" + carLoan);
        System.out.println("Car Interest: " + carInterest + "%");
        System.out.println("Car Loan Terms: " + carLoanTerms + " years");
    }
     
}
