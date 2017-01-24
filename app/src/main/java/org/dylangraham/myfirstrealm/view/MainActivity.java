package org.dylangraham.myfirstrealm.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.dylangraham.myfirstrealm.BuildConfig;
import org.dylangraham.myfirstrealm.R;
import org.dylangraham.myfirstrealm.presenter.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;
    @BindView(R.id.text_main)
    TextView text_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());

        presenter = new MainPresenter(this);
    }

    @OnClick(R.id.button_main)
    public void start() {
        presenter.calculate();
    }

    public void update(int number) {
        text_main.setText(String.valueOf(number));
    }
}
