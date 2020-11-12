package com.raidify.mobi.mycouturier.ui.measurement;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raidify.mobi.mycouturier.R;

public class FullBodyFemaleFragment extends Fragment {

    private FullBodyFemaleViewModel mViewModel;

    public static FullBodyFemaleFragment newInstance() {
        return new FullBodyFemaleFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.full_body_female_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FullBodyFemaleViewModel.class);
        // TODO: Use the ViewModel
    }

}