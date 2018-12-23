package com.springboot.chapter4.pojo;

/**
 * Created by Citrix on 2018-12-19.
 */
public class User {
    private Long id;
    private String username;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
