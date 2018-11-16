package com.example.consultants.week4_testfriday.ui.schools;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.consultants.week4_testfriday.ui.base.BasePresenter;
import com.example.consultants.week4_testfriday.ui.base.BaseView;

public interface SchoolContract {
    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View> {
        //        void getSchoolData(RecyclerView recyclerView, Context context);
        void getSchoolData(RecyclerView recyclerView, Context context);
    }
}
