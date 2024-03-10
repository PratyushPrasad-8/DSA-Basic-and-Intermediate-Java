package OOPS;

class Cars implements factory{
    public void wheels(){};
    public void headLights(){};
    public int seats(){
        System.out.println("SEATS");
        return 5;
    }
    void engine(){
        System.out.println("ENGINE IS RUNNING");
    }
}