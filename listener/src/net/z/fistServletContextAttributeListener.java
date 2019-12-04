package net.z;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class fistServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("属性被添加");
        System.out.println(scae.getName());
        System.out.println(scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("属性被删除");
        System.out.println(scae.getName());
        System.out.println(scae.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("属性被更改");
        System.out.println(scae.getName());
        System.out.println(scae.getValue());
    }
}
