package com.example.suiviterrain.ui.projet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProjetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Project fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}