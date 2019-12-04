package net.z.bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class user implements HttpSessionBindingListener {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        //绑定
        System.out.println("对象被绑定");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {

        //解绑
        System.out.println("对象被解绑");
    }
}
