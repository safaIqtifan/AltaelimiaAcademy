package com.altaelimia.academy.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.altaelimia.academy.MainActivity;
import com.altaelimia.academy.R;
import com.altaelimia.academy.databinding.FragmentAppInfoBinding;
import com.altaelimia.academy.databinding.FragmentHomeBinding;

public class AppInfoFragment extends Fragment {
    private FragmentAppInfoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAppInfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        MainActivity.webView(root.findViewById(R.id.webView), "https://www.altaelimia.academy/");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}