package ca.conjojohn.ass2.assignment02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static String passwordValidator(String password) {
        if (password.toLowerCase().equals("password")) {
            return "Password cannot be \"password\"!";
        } else if (password.length() < 8) {
            return "Password must be at least 8 characters!";
        } else {
            return "This password is acceptable.";
        }
    }

    /*
    public void passwordValidator(View view) {
        TextView passwordValidity = (TextView) findViewById(R.id.passwordValidity);
        EditText password = (EditText) findViewById(R.id.password);

        if (password.equals("password")) {
            passwordValidity.setText("Password cannot be \"password\"!");
        } else if (password.length() < 8) {
            passwordValidity.setText("Password must be at least 8 characters!");
        } else {
            passwordValidity.setText("This password is acceptable.");
        }
    }
    */
}
