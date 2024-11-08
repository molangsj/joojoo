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
        // tvIncorrectPwd = findViewById(R.id.inLogAct_incorrectIdPwd);

        // FirebaseAuth 초기화
        mFirebaseAuth = FirebaseAuth.getInstance();

        // 로그인 버튼 클릭 리스너
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = etEmail.getText().toString().trim();
                String userPwd = etPwd.getText().toString().trim();

                // 이메일과 비밀번호가 비어 있는지 확인
                if (userEmail.isEmpty()) {
                    etEmail.setError("이메일을 입력하세요");
                    return;
                }
                if (userPwd.isEmpty()) {
                    etPwd.setError("비밀번호를 입력하세요");
                    return;
                }

                // Firebase 로그인 처리
                mFirebaseAuth.signInWithEmailAndPassword(userEmail, userPwd)
                        .addOnCompleteListener(Login_Activity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // 로그인 성공 시 메인 액티비티로 이동
                                    Intent intent = new Intent(Login_Activity.this, Register_Activity.class);
                                    startActivity(intent);
                                } else {
                                    // 로그인 실패 시 메시지 표시
                                    Toast.makeText(Login_Activity.this, "아이디와 비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        // 뒤로 가기 버튼 클릭 리스너
        backPressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}