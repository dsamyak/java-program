/*Design a hierarchy of classes: Vehicle, Car, and Bike. The Vehicle class should have attributes like brand, model,
 and year. Subclasses should inherit from Vehicle and override the displayDetails () method to provide specific 
 information. Use super and this keywords appropriately.*/
 //pracical no 8
 class Vehicle
 {
    String brand;
    String model;
    int year;
    Vehicle(String brand,String model,int year)
    {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void displayDetails()
    {
        System.out.println("Brand of Vehicle is:"+brand);
        System.out.println("Model of Vehicle is:"+model);
        System.out.println("Year of Vehicle is:"+year);
    }
 }
 class Car extends Vehicle
 {
    String type;
    Car(String brand,String model,int year,String type)
    {
        super(brand, model, year);
        this.type=type;
    }

    
    void displayDetails() 
    {
        super.displayDetails();
        System.err.println("Type of car is:"+type);
        System.out.println("");
    }
    
 }
 class Bike extends Vehicle
 {
    int mileage;

    public Bike(String brand,String model,int year,int mileage) 
    {
        super(brand, model, year);
        this.mileage=mileage;
    }
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Millage of Vehicle is :"+mileage);
    }
    

 }
 class main
 {
    public static void main(String[] args) 
    {
        Car c1=new Car("benz", "C1", 1959, "diesel");
        Bike B1 =new Bike("Royal Enfield", "Classic 350", 1961, 51);

        c1.displayDetails();
        B1.displayDetails();
    }
 }