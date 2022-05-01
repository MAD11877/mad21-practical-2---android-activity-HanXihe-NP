package com.np.madexercise2hanxihe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Loading name and description from User
        String desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        user = new User("Han Xihe", desc, 1, false);

        Button button = findViewById(R.id.followButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Button button = findViewById(R.id.followButton);
                if (user.followed) {
                    user.followed = false;
                    button.setText("FOLLOW");
                } else {
                    user.followed = true;
                    button.setText("UNFOLLOW");
                }
            }
        });
    }
}