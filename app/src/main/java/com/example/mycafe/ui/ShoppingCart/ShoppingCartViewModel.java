package com.example.mycafe.ui.ShoppingCart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShoppingCartViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ShoppingCartViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ShoppingCart");
    }

    public LiveData<String> getText() {
        return mText;
    }
}