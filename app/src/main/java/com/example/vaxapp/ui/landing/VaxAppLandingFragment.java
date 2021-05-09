package com.example.vaxapp.ui.landing;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vaxapp.R;

public class VaxAppLandingFragment extends Fragment {

    private VaxAppLandingViewModel landingViewModel;

    public static VaxAppLandingFragment newInstance() {
        return new VaxAppLandingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.landing_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        landingViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(VaxAppLandingViewModel.class);
        // TODO: Use the ViewModel
    }
}