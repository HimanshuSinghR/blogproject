package com.example.blogproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.location.Geocoder;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.blogproject.Models.User;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText username;
    private EditText password;
    private EditText Age;
    private EditText City;
    private EditText Gender;
    private Button submit;

    private  BlogVIewModel vIewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailidEd);
        username = findViewById(R.id.usernameEd);
        password = findViewById(R.id.passwordEd);
        Age = findViewById(R.id.ageEd);
        City = findViewById(R.id.cityEd);
        Gender = findViewById(R.id.genderEd);
        submit = findViewById(R.id.AddUser);

        final BlogVIewModel vIewModel =  ViewModelProviders.of(this).get(BlogVIewModel.class);


        submit.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

                if (!TextUtils.isEmpty(email.getText()) && !TextUtils.isEmpty(password.getText()) && !TextUtils.isEmpty(username.getText())
                && !TextUtils.isEmpty(Age.getText()) && !TextUtils.isEmpty(City.getText()) && !TextUtils.isEmpty(Gender.getText())
                ){
                    String id = UUID.randomUUID().toString();
                    String em = email.getText().toString();
                    String pswrd = password.getText().toString();
                    String usrname = username.getText().toString();
                    Integer age = Integer.parseInt(Age.getText().toString());
                    String city = City.getText().toString();
                    String gendr = Gender.getText().toString();

                    User user = new User(id,em,pswrd,usrname,age,gendr,city);

                    vIewModel.insert(user);





                }

            }
        });



    }


}