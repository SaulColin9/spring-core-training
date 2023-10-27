package facade.components;

public class HomeTheaterFacade implements HomeTheater{
    AudioSpeakers audioSpeakers;
    TV tv;
    VHSPlayer vhsPlayer;
    public HomeTheaterFacade(AudioSpeakers audioSpeakers, TV tv, VHSPlayer vhsPlayer){
        this.audioSpeakers = audioSpeakers;
        this.tv = tv;
        this.vhsPlayer = vhsPlayer;
    }
    @Override
    public void playMovie(Cassette cassette) {
        vhsPlayer.pushCassette(cassette);

        tv.turnOn();
        audioSpeakers.connectToTv(tv);
        audioSpeakers.turnOn();

        tv.setChannel();

        vhsPlayer.turnOn();
        vhsPlayer.play();
    }

    @Override
    public Cassette stopMovie() {
        vhsPlayer.stop();
        vhsPlayer.turnOff();

        audioSpeakers.turnOff();
        audioSpeakers.disconnectFromTv();

        tv.turnOff();

        return vhsPlayer.rejectCassette();
    }
}
