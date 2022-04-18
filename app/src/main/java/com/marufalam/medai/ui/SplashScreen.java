package com.marufalam.medai.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.marufalam.medai.R;
import com.marufalam.medai.databinding.FragmentSplashScreenBinding;

public class SplashScreen extends Fragment {
    FragmentSplashScreenBinding binding;



    public SplashScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSplashScreenBinding.inflate(inflater);
        Animation animation = AnimationUtils.loadAnimation(getContext(),
                R.anim.blink);
        binding.logo.startAnimation(animation);
        binding.medAiText.startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.fade));

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                // This method will be executed once the timer is over
                Navigation.findNavController(container).navigate(R.id.signInScreen);

            }
        }, 4000);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}