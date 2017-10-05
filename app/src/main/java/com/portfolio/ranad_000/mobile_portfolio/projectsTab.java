package com.portfolio.ranad_000.mobile_portfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by ranad_000 on 8/31/2017.
 */

public class projectsTab extends Fragment {


    private List<String> projects= new ArrayList<String>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.projects_tab,container,false);
    }


    public void addProject(String s){
        projects.add(s);
    }
}
