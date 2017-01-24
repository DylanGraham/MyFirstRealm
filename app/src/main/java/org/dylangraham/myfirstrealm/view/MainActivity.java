package org.dylangraham.myfirstrealm.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.dylangraham.myfirstrealm.BuildConfig;
import org.dylangraham.myfirstrealm.R;
import org.dylangraham.myfirstrealm.presenter.MainPresenter;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        mainPresenter = new MainPresenter(this);
    }
}
