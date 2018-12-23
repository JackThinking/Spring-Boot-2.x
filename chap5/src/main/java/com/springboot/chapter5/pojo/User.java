package com.springboot.chapter5.pojo;

import com.springboot.chapter5.converter.SexConverter;
import com.springboot.chapter5.enumeration.SexEnum;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;

/**
 * Created by Citrix on 2018-12-21.
 */
/*@Entity
@Table(name = "t_user")*/
@Alias(value = "user")
public class User {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id = null;

    /*
     * 之前的jpa操作不是可以自动对应的嘛
     * */
    //@Column(name = "user_name")
    private String userName = null;

    //@Convert(converter = SexConverter.class)
    private SexEnum sex = null;
    private String note = null;

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

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
