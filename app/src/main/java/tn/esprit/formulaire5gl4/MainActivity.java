package tn.esprit.formulaire5gl4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText etnom;
    EditText etprenom;
    EditText etEmail;
    EditText Etnumtel;

    Switch genre;

    CheckBox spinning;
    CheckBox lecture;
    CheckBox foot;

    Button valider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnom = findViewById(R.id.ETnom);
        etprenom = findViewById(R.id.ETprenom);
        etEmail = findViewById(R.id.etEmail);
        Etnumtel = findViewById(R.id.etNumTel);

        genre = findViewById(R.id.genre);

        spinning = findViewById(R.id.spinning);
        lecture = findViewById(R.id.lecture);
        foot = findViewById(R.id.Foot);

        valider = findViewById(R.id.valider);


        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sgenre = "";
                String spref = "";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nom", etnom.getText().toString());
                i.putExtra("prenom", etprenom.getText().toString());
                i.putExtra("email", etEmail.getText().toString());
                i.putExtra("num", Etnumtel.getText().toString());

                if (genre.isChecked())
                    sgenre = "Homme";
                else
                    sgenre = "Femme";

                if (spinning.isChecked())
                    spref = spref+spinning.getText().toString();

                if (lecture.isChecked())
                    spref = spref+lecture.getText().toString();

                if (foot.isChecked())
                    spref = spref+foot.getText().toString();

                i.putExtra("genre",sgenre);
                i.putExtra("pref",spref);

                startActivity(i);

            }
        });


    }
}