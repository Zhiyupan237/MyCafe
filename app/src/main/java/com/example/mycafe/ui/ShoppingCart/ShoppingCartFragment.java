package com.example.mycafe.ui.ShoppingCart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mycafe.databinding.FragmentShoppingcartBinding;
import com.example.mycafe.ui.ShoppingCart.ShoppingCartViewModel;

public class ShoppingCartFragment extends Fragment {

    private FragmentShoppingcartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ShoppingCartViewModel ShoppingCartViewModel =
                new ViewModelProvider(this).get(ShoppingCartViewModel.class);

        binding = FragmentShoppingcartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Toast.makeText(root.getContext(), "ShoppingCart", Toast.LENGTH_SHORT).show();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

