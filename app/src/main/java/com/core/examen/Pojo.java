package com.core.examen;

import java.util.ArrayList;
import java.util.List;

public class Pojo {

private String title;
private String msg;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Pojo(String title, String msg) {
        this.title = title;
        this.msg = msg;
    }


}
