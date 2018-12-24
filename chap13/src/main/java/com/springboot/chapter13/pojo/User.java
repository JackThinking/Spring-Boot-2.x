package com.springboot.chapter13.pojo;

import java.io.Serializable;

/**
 * Created by Citrix on 2018-12-24.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8081849731640304905L;//这个id是干啥的呀
    private Long id;
    private String userName = null;
    private String note = null;

    public User(Long id, String userName, String note) {
        this.id = id;
        this.userName = userName;
        this.note = note;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
