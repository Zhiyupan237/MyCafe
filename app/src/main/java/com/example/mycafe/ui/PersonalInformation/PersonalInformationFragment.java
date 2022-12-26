package com.example.mycafe.ui.PersonalInformation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mycafe.databinding.FragmentHomeBinding;
import com.example.mycafe.databinding.FragmentPersonalInformationBinding;
import com.example.mycafe.ui.home.HomeViewModel;

public class PersonalInformationFragment extends Fragment {

    private FragmentPersonalInformationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentPersonalInformationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Toast.makeText(root.getContext(), "PersonalInformation", Toast.LENGTH_SHORT).show();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

