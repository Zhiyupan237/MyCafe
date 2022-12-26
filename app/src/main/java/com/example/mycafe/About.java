package com.example.mycafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mycafe.databinding.ActivityAboutBinding;
import com.example.mycafe.databinding.FragmentSlideshowBinding;
import com.example.mycafe.ui.slideshow.SlideshowViewModel;

public class About extends Fragment {


    private ActivityAboutBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = ActivityAboutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        Toast.makeText(root.getContext(), "About", Toast.LENGTH_SHORT).show();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}