package facade.components;

public class AudioSpkeakersImpl implements AudioSpeakers{
    @Override
    public void turnOn() {
        System.out.println("Turning Audio Spkeakers on");
    }

    @Override
    public void connectToTv(TV tv) {
        System.out.println("Connecting Audio Speakers to TV");
        tv.setSound();
    }

    @Override
    public void disconnectFromTv() {
        System.out.println("Disconnecting Audio Speakers from TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Audio Speakers");
    }
}
