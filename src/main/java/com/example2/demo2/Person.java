package com.example2.demo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
public class Person {


    private String lastName;
    private Integer age;
    private Boolean boss;

    private Date birth;
    private List<Object> lists;
    private Map<String,Object> maps;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public Date getBirth() {
        return birth;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
