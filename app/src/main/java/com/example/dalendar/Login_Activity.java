package com.example.dalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Login_Activity extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;
    private DatabaseReference mDatabaseRef;
    private EditText etEmail, etPwd;
    private TextView tvIncorrectPwd;
    private Button btnLogin;
    ImageButton backPressBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.inLogAct_email);
        etPwd = findViewById(R.id.inLogAct_Pwd);
        btnLogin = findViewById(R.id.inLoginAct_login_btn);
        backPressBtn = findViewById(R.id.inLoginActBackPress);
//        tvIncorrectPwd = findViewById(R.id.inLogAct_incorrectIdPwd);
        mFirebaseAuth = mFirebaseAuth.getInstance();

//        tvIncorrectPwd.setVisibility(View.INVISIBLE);

        String userEmail = etEmail.getText().toString().trim();
        String userPwd = etPwd.getText().toString().trim();

        mFirebaseAuth.signInWithEmailAndPassword(userEmail, userPwd).addOnCompleteListener(Login_Activity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Intent intent = new Intent(Login_Activity.this, /*메인 액티비티로 이동*/ Register_Activity.class);
                    startActivity(intent);
                } else {
//                    tvIncorrectPwd.setVisibility(View.VISIBLE);
                    Toast.makeText(Login_Activity.this, "아이디와 비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });


        backPressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


}