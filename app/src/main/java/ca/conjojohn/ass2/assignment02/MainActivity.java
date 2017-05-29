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
        if (password.toLowerCase().equals("password") || password.toLowerCase().equals("notpassword")) {
            return "Password cannot be \"password\" or \"notpassword\"!";
        } else if (password.length() < 8 || password.length () > 15) {
            return "Password must be between 8 and 15 characters!";
        } else if (!password.matches(".*\\d+.*")) {
            return "Password must contain at least 1 number!";
        } else {
            return "This password is acceptable.";
        }
    }


    /*
    public void UIPasswordValidator(View view) {
        TextView passwordValidity = (TextView) findViewById(R.id.passwordValidity);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        String password = passwordText.getText().toString();

        if (password.toLowerCase().equals("password") || password.toLowerCase().equals("notpassword")) {
            passwordValidity.setText("Password cannot be \"password\" or \"notpassword\"!");
        } else if (password.length() < 8 || password.length () > 15) {
            passwordValidity.setText("Password must be between 8 and 15 characters!");
        } else if (!password.matches(".*\\d+.*")) {
            passwordValidity.setText("Password must contain at least 1 number!");
        } else {
            passwordValidity.setText("This password is acceptable.");
        }
    }*/
}
