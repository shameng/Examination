package com.meng.examination;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText accountEditText = null;
    EditText passwordEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        accountEditText = (EditText) findViewById(R.id.accountEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        //密码输入框保密输入的字符串
        passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    public void login(View view) {
        String account = accountEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        Intent intent = new Intent(LoginActivity.this, IndexActivity.class);
        intent.putExtra("account", account);
        startActivity(intent);
    }
}
