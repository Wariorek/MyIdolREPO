package foo.bar;

import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 21.04.14
 * Time: 00:18
 * To change this template use File | Settings | File Templates.
 */
public class OneManBand implements Performer {

    public OneManBand(){}

    public void perform() {
       for(String key:instruments.keySet()){
           System.out.println(key+" : ");
           Instrument instrument=instruments.get(key);
           instrument.play();
       }
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments){
        this.instruments = instruments;
    }
}
