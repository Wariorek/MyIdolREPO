package foo.bar;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 20.04.14
 * Time: 16:57
 * To change this template use File | Settings | File Templates.
 */
public class PoeticJugler extends Jugler {
    private Poem poem;

    public PoeticJugler(Poem poem){
        super();
        this.poem=poem;
    }
    public PoeticJugler(int beanBags, Poem poem){
        super(beanBags);
        this.poem=poem;
    }
    public void perform(){
        super.perform();
        System.out.print(". Jednoczesnie recytujac...");
        poem.recite();
    }
}
