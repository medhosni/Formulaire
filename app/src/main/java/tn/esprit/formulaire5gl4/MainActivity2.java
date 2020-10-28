package tn.esprit.formulaire5gl4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.ETnom);
        String s ;
        s = getIntent().getStringExtra("nom")+"\n"
                +getIntent().getStringExtra("prenom")+"\n"
                +getIntent().getStringExtra("email")+"\n"
                +getIntent().getStringExtra("num")+"\n"
                +getIntent().getStringExtra("genre")+"\n"
                +getIntent().getStringExtra("pref");
text.setText(s);

    }
}