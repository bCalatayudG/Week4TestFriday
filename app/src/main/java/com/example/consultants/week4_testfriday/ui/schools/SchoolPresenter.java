package com.example.consultants.week4_testfriday.ui.schools;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.consultants.week4_testfriday.model.data.remote.RemoteDataSource;
import com.example.consultants.week4_testfriday.model.school.SchoolResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SchoolPresenter implements SchoolContract.Presenter {
    private SchoolContract.View view;
    private RecyclerViewAdapter adapter;
    private static final String TAG = SchoolPresenter.class.getSimpleName() + "_TAG";

    @Override
    public void onAttach(SchoolContract.View v) {
        this.view = v;
    }

    @Override
    public void onDetach() {
        this.view = null;
    }

    @Override
    public void getSchoolData(final RecyclerView recyclerView, final Context context) {
        RemoteDataSource remoteDataSource = new RemoteDataSource();
        remoteDataSource.getRemoteData().enqueue(new Callback<List<SchoolResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<SchoolResponse>> call, @NonNull Response<List<SchoolResponse>> response) {
                Log.d(TAG, "onResponse: " + response.body());
                assert response.body() != null;
                Log.d(TAG, "onResponse: size: "+response.body().size());
                for (SchoolResponse s : response.body()) {
                    Log.d(TAG, "onResponse: "+s.getCity());
                }
                //List<SchoolResponse> schoolResponseList = new ArrayList<>();
                adapter = new RecyclerViewAdapter(response.body());
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(layoutManager);

            }

            @Override
            public void onFailure(@NonNull Call<List<SchoolResponse>> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());
            }
        });
    }
}
