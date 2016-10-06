package com.example.admin.quizchallenge;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by admin on 2016/10/03.
 */
public class Philosophy extends AppCompatActivity {
    String rdbt_one = "True";
    String rdbt = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.yes_radio_butt:
                if (checked) {
                    // yes_radio_butt are the best

                }
                    break;
            case R.id.no_radio_butto:
                if (checked)
                    // no_radio_butto rule
                    break;
        }
    }

}
