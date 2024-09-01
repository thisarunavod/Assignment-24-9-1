package lk.ijse.assignment1;

import lk.ijse.assignment1.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx =  new AnnotationConfigApplicationContext();
        ctx.register(MyConfig.class);
        ctx.refresh();
        ctx.close();
        ctx.registerShutdownHook();
    }
}
