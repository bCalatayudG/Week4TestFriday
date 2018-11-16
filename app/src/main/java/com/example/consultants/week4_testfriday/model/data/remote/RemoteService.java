package com.example.consultants.week4_testfriday.model.data.remote;

import com.example.consultants.week4_testfriday.model.school.SchoolResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RemoteService {

    //    using the call object
    @GET("resource/97mf-9njv.json")
    Call<List<SchoolResponse>> getVenueData();
}
