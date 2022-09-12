public class Driver {
    private String name;

    Driver(String name){
        setName(name);
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
