interface TV{
    void turnOn();
    void turnOff();
}

class LedTV implements TV{
    public void turnOn(){
        System.out.println("켜다");
    }
    public void turnOff(){
        System.out.println("끄다");
    }
}