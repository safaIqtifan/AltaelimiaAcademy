package com.altaelimia.academy.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.altaelimia.academy.MainActivity;
import com.altaelimia.academy.R;
import com.altaelimia.academy.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container,false);
        View root = binding.getRoot();

//        MainActivity.webView(root.findViewById(R.id.webView), "https://api.whatsapp.com/send/?phone="+"+20"+"1032850265"+"&text=");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}