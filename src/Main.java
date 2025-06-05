import coupling.tight.service.OwnerService;
import coupling.tight.service.OwnerServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        OwnerService service = new OwnerServiceImpl(40);
    }
}