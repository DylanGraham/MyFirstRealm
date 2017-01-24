package org.dylangraham.myfirstrealm.presenter;

import org.dylangraham.myfirstrealm.model.Dog;
import org.dylangraham.myfirstrealm.view.MainActivity;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainPresenter implements MainPresenterInterface {

    private final MainActivity mainActivity;
    private RealmResults<Dog> puppies;

    public MainPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        setupModel();
    }

    private void setupModel() {
        Dog d1 = new Dog("Rex", 1);
        Dog d2 = new Dog("Bob", 2);
        Dog d3 = new Dog("Frank", 3);

        Realm.init(mainActivity);
        Realm realm = Realm.getDefaultInstance();
        puppies = realm.where(Dog.class).lessThan("age", 5).findAll();
    }

    @Override
    public void calculate() {
        mainActivity.update(puppies.size());
    }
}
