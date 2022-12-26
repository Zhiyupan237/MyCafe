package com.example.mycafe.ui.PersonalInformation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PersonalInformationViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PersonalInformationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("PersonalInformation");
    }

    public LiveData<String> getText() {
        return mText;
    }
}