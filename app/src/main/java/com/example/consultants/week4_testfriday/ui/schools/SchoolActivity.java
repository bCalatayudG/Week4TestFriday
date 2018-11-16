package com.example.consultants.week4_testfriday.ui.schools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.consultants.week4_testfriday.R;

public class SchoolActivity extends AppCompatActivity implements SchoolContract.View{

    SchoolPresenter presenter;
    RecyclerView recycler_view;
    private static final String TAG = SchoolActivity.class.getSimpleName() + "_TAG";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view = findViewById(R.id.recycler_view);

        presenter = new SchoolPresenter();
        presenter.getSchoolData(recycler_view, this);

    }

    @Override
    public void showError(String error) {
        Log.d(TAG, "showError: "+ error);
    }
}
