package com.demoProject.features.splashScreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.demoProject.MainActivity;
import com.demoProject.R;
import com.demoProject.databinding.ActivitySplashPageBinding;

public class SplashPageActivity extends AppCompatActivity {
    ActivitySplashPageBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashPageActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }, 2000);

    }
}