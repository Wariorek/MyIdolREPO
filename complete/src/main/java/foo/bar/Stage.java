package foo.bar;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 20.04.14
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
public class Stage {
    private Stage(){}
    public String hello ="Tu klasa Stage";

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
