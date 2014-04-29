package foo.bar;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 20.04.14
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
public class Jugler implements Performer {
    private int beanBags=3;

    public Jugler(){
    }
    public Jugler(int beanBags){
        this.beanBags=beanBags;
    }

    public void perform(){
        System.out.println("Żongluję "+beanBags+" woreczkami grochu");
    }
}
