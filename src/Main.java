import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CarCarRepoImpl carCarRepo = new CarCarRepoImpl();

        BMW Bmw = new BMW();
        Mercedes Mercedes = new Mercedes();
        Bmw.setNewSound("two");
        Mercedes.setNewSound("one");

        carCarRepo.GetNewSound(Bmw);
        carCarRepo.GetNewSound(Mercedes);

        
        }
}