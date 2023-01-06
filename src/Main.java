public class Main {
    public static void main(String[] args){
        Battery battery = new Battery(99);
        Myphone phone = new Myphone(battery);
        phone.setName("My Phone");
        phone.open();
    }
}
