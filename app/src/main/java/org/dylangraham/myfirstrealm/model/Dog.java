package org.dylangraham.myfirstrealm.model;

;import io.realm.RealmObject;


public class Dog extends RealmObject {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
