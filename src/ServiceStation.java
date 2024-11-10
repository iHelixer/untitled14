public class ServiceStation {

    public void performService(Serviceable vehicle){
        System.out.println("Starting service");
        vehicle.service();
    }
}
