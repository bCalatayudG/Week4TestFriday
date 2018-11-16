package com.example.consultants.week4_testfriday.model.data.remote;

import android.util.Log;

import com.example.consultants.week4_testfriday.model.school.SchoolResponse;
import com.example.consultants.week4_testfriday.utility.NetworkHelper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.consultants.week4_testfriday.utility.NetworkHelper.NYC_SCHOOL_API;


public class RemoteDataSource {

    private static final String TAG = RemoteDataSource.class.getSimpleName() + "_TAG";

    private Retrofit createInstance() {
        Log.d(TAG, "createInstance: ");
        return new Retrofit.Builder()
                .baseUrl(NYC_SCHOOL_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private RemoteService getRemoteService() {
        Log.d(TAG, "getRemoteService: ");
        return createInstance().create(RemoteService.class);
    }

    //use call object
    public Call<List<SchoolResponse>> getRemoteData() {
        Log.d(TAG, "getRemoteData: ");
        return getRemoteService().getVenueData();
    }

}
