package com.example.cuma.allstaryou;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    EditText kanaladiText;
    EditText emailText;
    EditText parolaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        kanaladiText=(EditText) findViewById(R.id.kanaladitext);
        emailText=(EditText) findViewById(R.id.emailtext);
        parolaText=(EditText) findViewById(R.id.parolatext);

        mAuth =FirebaseAuth.getInstance();

        mAuthListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

            }
        };
    }

    public void signInactivity(View view){

        Intent intent=new Intent(getApplicationContext(),Login.class);
        startActivity(intent);
    }
    public  void  signUp(View view){

        mAuth.createUserWithEmailAndPassword(emailText.getText().toString(),parolaText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Intent intent=new Intent(getApplicationContext(),anasayfa.class);
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(),"Kulanıcı oluşturuldu",Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(this, new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                if (e !=null){
                    Toast.makeText(getApplicationContext(),"Bu email ile giriş yapılmış",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
