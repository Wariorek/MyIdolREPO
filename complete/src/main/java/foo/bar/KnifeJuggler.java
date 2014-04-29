package foo.bar;

import java.util.*;
import javax.inject.*;
/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 24.04.14
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
public class KnifeJuggler {

    private Set<Knife> knives;
    @Inject
    public KnifeJuggler(Provider <Knife> knifeProvider){
        knives = new HashSet<Knife>();
        for(int i = 0; i < 5; i++){
            knives.add(knifeProvider.get());
        }
    }
}
