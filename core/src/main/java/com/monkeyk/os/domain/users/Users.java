package com.monkeyk.os.domain.users;

import com.monkeyk.os.domain.AbstractDomain;

import java.util.Date;

/**
 * 2016/6/3
 * <p/>
 * Table: users
 *
 * @author Shengzhao Li
 */
public class Users extends AbstractDomain {
    private static final long serialVersionUID = -3990278799194556012L;


    private String username;
    private String password;


    private boolean defaultUser;
    private Date lastLoginTime;

    public Users() {
    }


    public String username() {
        return username;
    }

    public Users username(String username) {
        this.username = username;
        return this;
    }

    public String password() {
        return password;
    }

    public Users password(String password) {
        this.password = password;
        return this;
    }

    public boolean defaultUser() {
        return defaultUser;
    }

    public Users defaultUser(boolean defaultUser) {
        this.defaultUser = defaultUser;
        return this;
    }

    public Date lastLoginTime() {
        return lastLoginTime;
    }

    public Users lastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
}