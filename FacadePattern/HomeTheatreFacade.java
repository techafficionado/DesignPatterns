public class HomeTheatreFacade{
  Amplifier amplifier;
  Tuner tuner;
  DvdPlayer dvdPlayer;
  Screen screen;
  Projector projector;
  Lights lights;
  public HomeTheatreFacade(Amplifier amp, Tuner tun, DvdPlayer dvd, Screen scr, Projector proj, Lights li){
    amplifier = amp;
    tuner = tun;
    dvdPlayer = dvd;
    screen = scr;
    projector = proj;
    lights = li;
  }
  public void watchMovie(){
    System.out.println("Setting the HomeTheatre System to play movie");
    lights.dim();
    screen.down();
    projector.on();
    dvd.on();
    amp.on();
    tuner.tune();
  }
}