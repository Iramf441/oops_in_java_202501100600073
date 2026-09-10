abstract class Device {
    String brand ="Samsung";

    abstract void turnOn();

    void showBrand(){
        System.out.println("Brand: " + brand);
    }
}

/**
 * mixedwithMultipleInheritance
 */
interface Camera {
    int MAX_ZOOM = 10;
    void takePhoto();

    default void cameraInfo() {
        System.out.println("Camera is ready");
    } 
}

/**
 * mixedwithMultipleInheritance
 */
interface Musicplayer{
    String TYPE = "Digital";

    void playMusic();

    default void musicInfo(){
        System.out.println("Music player is ready");
    
    }
}

public class abstract_interface extends Device implements Camera, Musicplayer {
    public void turnOn() {
        System.out.println("Device is turned on");
    }

    
    public void takePhoto() {
        System.out.println("Taking photo ...");
    }

    public void playMusic() {
        System.out.println("Playing music..." );
    }
    public static void main(String[] args) {
        abstract_interface obj= new abstract_interface();
        obj.turnOn();
        obj.showBrand();
        obj.takePhoto();
        obj.cameraInfo();
        obj.playMusic();
        obj.musicInfo();
    }
}

