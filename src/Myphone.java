public class Myphone {
    Battery battery;
    String name;
    
    public Myphone(Battery battery){
        this.battery = battery;
    }
    
    public void setName(String name) {
        this.name  = name;
    }
    
    public boolean open(){
        if(battery.getPercent() > 20){
            System.out.println("Welcome \n"+ name + "\n" + "Battery:" + battery.getPercent());
            return true;
        }
        System.out.println("Battery Low");
        return false;
    }
}
