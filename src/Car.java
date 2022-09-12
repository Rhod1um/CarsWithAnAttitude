public class Car {
    private String brand, make, honk;
    private boolean onOff;
    private Driver driver;
    private boolean hasDriver; //booleans starter ofte med isEtEllerAndet. Samme princip med has her

    Car(String brand, String make, String honk){
        setBrand(brand);
        setMake(make);
        setHonk(honk);
        onOff = false; //definer denne i konstruktør eller oppe i attributterne? konstruktøren
    }
    //gettere og settere her laves kun for at øve det, ikke fordi det giver mening. Attributterne
    //giver mere mening at defineres i konstruktøren
    public void setBrand(String brand){
        this.brand = brand;
    } //gettere og settere skal være public helst
    public String getBrand(){
        return brand;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    void setHonk(String honk){
        this.honk=honk;
    }
    public String getHonk(){
        return honk;
    }

    void sound (){
        System.out.println(honk);
    }


    void drive() { //gør dette ved metode overloading
        drive(" is driving.");
    }

    void drive(String driveInput) {
        if (driver != null) { //der er driver
            if (onOff == false)
                System.out.println("Turn on engine. ");
            else
                System.out.println(brand + " " + make + " " + driveInput);
        } else
            System.out.println("No driver. ");
    }


    void park (){
        System.out.println(brand + " " + make + " is parked. ");
    }
    void errorMessageEngineOff(){
        System.out.println("The engine is already off. ");
    }
    void errorMessageEngineOn(){
        System.out.println("The engine is already on. ");
    }

    void turnEngineOn(){
        if (onOff == true){
            errorMessageEngineOn();
        } else if (onOff == false){
            onOff = true;
            System.out.println("Engine on");
        }
    }
    void turnEngineOff(){
        if (onOff == false){
            errorMessageEngineOff();
        } else if (onOff == true){
            onOff = false;
            System.out.println("Engine off");
        }
    }
    void setDriver(Driver newDriver){
        driver = newDriver;
    }
    Driver getDriver(){
        return driver;
    }
    //if (driver != null){... kan gøres i stedet for boolean hasDriver


    public boolean isOnOff() { //er attributten en boolean kan man autogenerere dette ved at skrive dens navn
        return onOff;
    } //man bruger ikke getter og setter til boolean, man bruger dette. Også i stedet for de øvre turnOn/Off metoder
    //den gør det samme som get og set

    public void turnEngineOfff(){
        //onOff(true); kunne kalde seperat metode til ændring af onOff
    }
}

//man skulle ikke bruge get og set til boolean