package com.designpatterns.common;


/**
 * @author Jarvis
 * @date 2018/7/26
 */
public class Food {
    private String name;
    private String spicy;
    private String salt;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}

