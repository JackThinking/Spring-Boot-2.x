package com.springboot.chapter11.enumeration;

/**
 * Created by Citrix on 2018-12-24.
 */
public enum SexEnum {
    MALE(0, "男"),
    FEMALE(1, "女");

    private int code;
    private String name;

    SexEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
    /*
    * 根据code得到enum对象？ TODO
    * */
    public static SexEnum getSexEnum(int code) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getCode() == code) {
                return sex;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
