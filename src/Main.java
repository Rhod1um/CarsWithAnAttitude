public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Kia", "Picanto", "Dyt");

        car1.sound();
        car1.drive();
        car1.park();

        car1.setHonk("dytdytbot");
        car1.sound();
        System.out.println(car1.getHonk());

        car1.turnEngineOff();
        car1.turnEngineOn();
        car1.turnEngineOn();

        Driver newDriver = new Driver("Lars");
        car1.setDriver(newDriver);

        System.out.println(car1.getDriver().getName());

        car1.drive("is still. ");

    }
    //skulle man lave et klassediagram her så ville der gå en pil fra car mod driver fordi car kender driver
    //men der ville ikke gå en pil fra driver mod car da det ikke er krævet at driver kender til bilen
    //man kunne gøre at driver tager et car objekt ind og dermed "kender" bilens brand, make osv
    //pil går som car1.getdriver.getname så går pil fra car til driver til getname (som ikke er en klasse men hvis det var)

    // You can access object members using a reference variable using dot syntax.
    // punktummet er en syntax til referencer. Den henter object members

}