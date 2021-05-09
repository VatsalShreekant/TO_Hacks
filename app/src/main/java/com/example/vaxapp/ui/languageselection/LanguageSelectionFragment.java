package com.example.vaxapp.ui.languageselection;

import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vaxapp.R;

public class LanguageSelectionFragment extends Fragment {

    private LanguageSelectionViewModel mLangSelecViewModel;

    public static LanguageSelectionFragment newInstance() {
        return new LanguageSelectionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.language_selection_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLangSelecViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(LanguageSelectionViewModel.class);
        // TODO: Use the ViewModel
    }

}