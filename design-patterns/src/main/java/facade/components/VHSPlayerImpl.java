package facade.components;

public class VHSPlayerImpl implements VHSPlayer{
    private Cassette cassette;
    @Override
    public void turnOn() {
        System.out.println("Turning on VHS Player");
    }

    @Override
    public void pushCassette(Cassette cassette) {
        this.cassette = cassette;
        System.out.println("Pushing " + cassette.movie() + "  cassete into the VHS Player");
    }

    @Override
    public void play() {
        System.out.println("Setting on play the VHS Player");
    }

    @Override
    public void stop() {
        System.out.println("Stopping VHS Player");
    }

    @Override
    public Cassette rejectCassette() {
        System.out.println("Rejecting " + " cassete from VHS Player");
        return cassette;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off VHS Player");
    }
}
