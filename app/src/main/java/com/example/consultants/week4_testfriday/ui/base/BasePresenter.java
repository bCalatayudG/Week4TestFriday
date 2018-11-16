package com.example.consultants.week4_testfriday.ui.base;

public interface BasePresenter<V extends BaseView> {

    void onAttach(V view);

    void onDetach();

}

