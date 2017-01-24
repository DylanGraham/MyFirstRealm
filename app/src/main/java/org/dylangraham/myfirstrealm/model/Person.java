package org.dylangraham.myfirstrealm.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Person extends RealmObject {
    @PrimaryKey
    private long id;
    private String name;
    private RealmList<Dog> dogs;

    public Person() {}

    public Person(long id, String name, RealmList<Dog> dogs) {
        this.id = id;
        this.name = name;
        this.dogs = dogs;
    }

    public long getId() {
        return id;
    }

    public RealmList<Dog> getDogs() {
        return dogs;
    }

    public String getName() {
        return name;
    }
}
