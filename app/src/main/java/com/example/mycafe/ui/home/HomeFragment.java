package com.example.mycafe.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import com.example.mycafe.R;
import com.example.mycafe.SigninDialogFragment;
import com.example.mycafe.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.homeTitle;
        final Spinner spinner = binding.spinner;

        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        Toast.makeText(root.getContext(), "Home", Toast.LENGTH_SHORT).show();

        int id = getResources().getIdentifier("button_sign_in", "id", getContext().getPackageName());
        View eventView = root.findViewById(id);
        eventView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void signIn() {
        DialogFragment newFragment = new SigninDialogFragment();
        newFragment.show(getParentFragmentManager(), "Signin");
    }
}
