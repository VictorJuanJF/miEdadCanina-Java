package com.herokuapp.viktor_web.miedadcanina;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView answer_text=findViewById(R.id.answer_text);
         answer_text.setText("Si fueras perro tu edad sería de: ");

        final EditText age_edit=findViewById(R.id.age_edit);

        ImageView dog_image=findViewById(R.id.dog_image);
        dog_image.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.rilakkuma));
        Button my_button=findViewById(R.id.my_button);
        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageString=age_edit.getText().toString();
                int ageInt=Integer.parseInt(ageString);

                answer_text.setText("Si fuera bruss, tu edad seria de: "+(ageInt*6));


            }
        });

    }
}
