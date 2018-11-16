package com.example.consultants.week4_testfriday.ui.schools;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.consultants.week4_testfriday.R;
import com.example.consultants.week4_testfriday.model.school.SchoolResponse;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<SchoolResponse> schoolResponseList;

    RecyclerViewAdapter(List<SchoolResponse> schoolResponseList) {
        this.schoolResponseList = schoolResponseList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {

        SchoolResponse venue = schoolResponseList.get(i);

        viewHolder.tvCity.setText(venue.getCity());
        viewHolder.tvEll_programs.setText(venue.getEllPrograms());
        viewHolder.tvTotal_students.setText(venue.getTotalStudents());
        viewHolder.tvInterest1.setText(venue.getInterest1());
        viewHolder.tvBoro.setText(venue.getBoro());

    }

    @Override
    public int getItemCount() {
        return schoolResponseList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCity;
        TextView tvEll_programs;
        TextView tvTotal_students;
        TextView tvInterest1;
        TextView tvBoro;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCity = itemView.findViewById(R.id.tvCity);
            tvEll_programs = itemView.findViewById(R.id.tvEll_programs);
            tvTotal_students = itemView.findViewById(R.id.tvTotal_students);
            tvInterest1 = itemView.findViewById(R.id.tvInterest1);
            tvBoro = itemView.findViewById(R.id.tvBoro);


        }

    }
}
