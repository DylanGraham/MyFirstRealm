package org.dylangraham.myfirstrealm.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.dylangraham.myfirstrealm.R;
import org.dylangraham.myfirstrealm.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
    }
}
