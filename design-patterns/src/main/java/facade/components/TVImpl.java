package facade.components;

public class TVImpl implements TV{
    @Override
    public void turnOn() {
        System.out.println("Turning on TV");
    }

    @Override
    public void setChannel() {
        System.out.println("Setting TV channel");
    }

    @Override
    public void setSound() {
        System.out.println("Setting TV sound");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning TV off");
    }
}
