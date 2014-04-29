package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();

        System.out.println(Stage.getInstance().hello);
        System.out.println();

        Performer performer2 = (Performer) ctx.getBean("kenny");
        performer2.perform();

        System.out.println();

        Performer performer3 = (Performer) ctx.getBean("jim");
        performer3.perform();

        System.out.println();

        Performer performer4 = (Performer) ctx.getBean("hank");
        performer4.perform();

        Performer performer1 = (Performer) ctx.getBean("kenny2");
        performer1.perform();

        Performer performer5 = (Performer) ctx.getBean("duke");
        performer5.perform();

    }
}
