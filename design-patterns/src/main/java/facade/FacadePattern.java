package facade;

// TODO implement facade pattern
// create an interface HomeTheater and implement two methods:
// playMovie(Cassette cassette) & Cassette stopMovie(), using all


import facade.components.*;

public class FacadePattern {
    public static void main(String[] args) {
        // run your implemented pattern there
        TV tv = new TVImpl();
        AudioSpeakers audioSpeakers = new AudioSpkeakersImpl();
        VHSPlayer vhsPlayer = new VHSPlayerImpl();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(audioSpeakers, tv, vhsPlayer);

        homeTheaterFacade.playMovie(new Cassette("Star Wars: The Empire Strikes Back"));
        System.out.println("=================");

        homeTheaterFacade.stopMovie();
    }
}
