package Assignment_2;

public class Car {
    //Static Members
    public static final String companyName="JUST Rentals";
    public static int totalCars=0;

    //Car field/Properties

    private String plate_Number;
    private String car_Model;
    private double daily_Rate;
    private boolean is_Rent;

    //Constructures
    Car(){
        plate_Number="C321156";
        car_Model="RANGE ROVER";
        daily_Rate=45;
        is_Rent=false;
    }
    Car(String p_Number, String car_model, double dailyRent,boolean is_Rent){
        this.plate_Number=p_Number;
        this.car_Model=car_model;
        this.daily_Rate=dailyRent;
        totalCars++;
    }


    //Static Methods
    public static void displayCompany(){
        System.out.println("Company Name: "+companyName);
    }
    public static void totalCars(){
        System.out.println("Total Cars: "+totalCars);
    }


    //Getters

    public String getPlate_Number() {
        return plate_Number;
    }

    public String getCar_Model() {
        return car_Model;
    }

    public double getDaily_Rate() {
        return daily_Rate;
    }

    public boolean isIs_Rent() {
        return is_Rent;
    }

    //Setters


    public void setDaily_Rate(double daily_Rate) {
        this.daily_Rate = daily_Rate;
    }
    // Rent

    public void rent() {

        if (is_Rent) {
            System.out.println("This car is already rented");
        } else {
            is_Rent = true;
            System.out.println("Car rent has been successful");
        }
    }

    // Return Car

    public void returnCar() {

        if (is_Rent) {
            is_Rent = false;
            System.out.println("Car has been returned successfully");
        } else {
            System.out.println("This car is not currently rented");
        }
    }

    public void displayCar(){
        System.out.println("==================== Car Info =======================\n" +
                "Company Name: "+companyName+"\n" +
                "Plate Number: "+plate_Number+"\n" +
                "Car Model: "+car_Model+"\n" +
                "Daily Rant: $"+daily_Rate+"\n" +
                "=======================================================");
        System.out.println();
    }

}

class TestCar{
    static void main() {
        Car car1=new Car("C1002","Hayundia",70,false);
        car1.rent();
        System.out.println();
        car1.returnCar();
        System.out.println();
        car1.displayCar();
        System.out.println("Car Model: "+car1.getCar_Model());
        System.out.println();
        System.out.println("Total Cars: "+Car.totalCars);

        Car car2=new Car("C1002","Toyota",120,true);
        car2.rent();
        car2.returnCar();
        car2.displayCar();
    }
}