package foo.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 20.04.14
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */

public class Instrumentalist implements Performer {
    public Instrumentalist(){}
    public void perform() {
        System.out.print("Gram "+song+":");
        instrument.play();
    }

    private String song;
    public void setSong(String song){
        this.song = song;
    }

    public String getSong(){
        return song;
    }

    public String screamSong(){
        return song;
    }

   Instrument instrument;
    @Autowired(required = false)
    @Qualifier ("stringed")
    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}
