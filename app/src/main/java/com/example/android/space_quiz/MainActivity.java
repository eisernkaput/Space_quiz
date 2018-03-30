package com.example.android.space_quiz;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
    public void questionOne () {
        EditText qOneAnswer = findViewById(R.id.q_answer_1);
        String qOneAnswerString = qOneAnswer.getText().toString();
        String answer = "Gagarin";
        String answer1 = "gagarin";

        if (Objects.equals(qOneAnswerString, answer) || Objects.equals(qOneAnswerString, answer1)) {
            score++;
        }
    }

    public void questionTwo () {

        CheckBox checkBox = findViewById(R.id.q_answer_2_1);
        CheckBox checkBox1 = findViewById(R.id.q_answer_2_2);
        CheckBox checkBox2 = findViewById(R.id.q_answer_2_3);
        CheckBox checkBox3 = findViewById(R.id.q_answer_2_4);

        boolean checkBoxOne = checkBox.isChecked();
        boolean checkBoxTwo = checkBox1.isChecked();
        boolean checkBoxThree = checkBox2.isChecked();
        boolean checkBoxFour = checkBox3.isChecked();

        if (checkBoxOne && checkBoxTwo && !(checkBoxThree) && !(checkBoxFour)) {
            score++;
        }

    }

    public void questionThree () {

        RadioButton radioButton1 = findViewById(R.id.q_answer_3);
        RadioButton radioButton = findViewById(R.id.q_answer_3_1);
        boolean radioButtonFalse = radioButton.isChecked();
        boolean radioButtonTrue = radioButton1.isChecked();

        if (radioButtonFalse && !(radioButtonTrue)) {
            score++;
        }

    }

    public void questionFour () {

        CheckBox checkBox = findViewById(R.id.q_answer_4_1);
        CheckBox checkBox1 = findViewById(R.id.q_answer_4_2);
        CheckBox checkBox2 = findViewById(R.id.q_answer_4_3);
        CheckBox checkBox3 = findViewById(R.id.q_answer_4_4);
        CheckBox checkBox4 = findViewById(R.id.q_answer_4_5);
        CheckBox checkBox5 = findViewById(R.id.q_answer_4_6);
        CheckBox checkBox6 = findViewById(R.id.q_answer_4_7);
        CheckBox checkBox7 = findViewById(R.id.q_answer_4_8);



        boolean booleanCheckBox1 = checkBox.isChecked();
        boolean booleanCheckBox2 = checkBox1.isChecked();
        boolean booleanCheckBox3 = checkBox2.isChecked();
        boolean booleanCheckBox4 = checkBox3.isChecked();
        boolean booleanCheckBox5 = checkBox4.isChecked();
        boolean booleanCheckBox6 = checkBox5.isChecked();
        boolean booleanCheckBox7 = checkBox6.isChecked();
        boolean booleanCheckBox8 = checkBox7.isChecked();

        if (booleanCheckBox2 && booleanCheckBox7 && !(booleanCheckBox1) && !(booleanCheckBox3)&&
                !(booleanCheckBox4)&& !(booleanCheckBox5)&& !(booleanCheckBox6)&& !(booleanCheckBox8)) {
            score++;
        }

    }

    public void questionFive () {

        RadioButton radioButton = findViewById(R.id.q_answer_5_1);
        boolean radioButtonFalse = radioButton.isChecked();
        RadioButton radioButton1 = findViewById(R.id.q_answer_5);
        boolean radioButtonTrue = radioButton1.isChecked();

        if (radioButtonFalse && !(radioButtonTrue)) {
            score++;
        }


    }

    public void questionSix () {

        CheckBox checkBox = findViewById(R.id.q_answer_6_1);
        CheckBox checkBox1 = findViewById(R.id.q_answer_6_2);
        CheckBox checkBox2 = findViewById(R.id.q_answer_6_3);
        CheckBox checkBox3 = findViewById(R.id.q_answer_6_4);
        CheckBox checkBox4 = findViewById(R.id.q_answer_6_5);
        CheckBox checkBox5 = findViewById(R.id.q_answer_6_6);
        CheckBox checkBox6 = findViewById(R.id.q_answer_6_7);



        boolean booleanCheckBox1 = checkBox.isChecked();
        boolean booleanCheckBox2 = checkBox1.isChecked();
        boolean booleanCheckBox3 = checkBox2.isChecked();
        boolean booleanCheckBox4 = checkBox3.isChecked();
        boolean booleanCheckBox5 = checkBox4.isChecked();
        boolean booleanCheckBox6 = checkBox5.isChecked();
        boolean booleanCheckBox7 = checkBox6.isChecked();

        if (booleanCheckBox1 && booleanCheckBox3 &&  booleanCheckBox5 && !(booleanCheckBox2) && !(booleanCheckBox4)&&
                !(booleanCheckBox6)&& !(booleanCheckBox7)) {
            score++;
        }

    }

    public void questionSeven () {

        EditText qSevenAnswer = findViewById(R.id.q_answer_7);
        String qSevenAnswerString = qSevenAnswer.getText().toString();
        String answer = "habitable zone";
        String answer1 = "Habitable zone";

        if (Objects.equals(qSevenAnswerString, answer) || Objects.equals(qSevenAnswerString, answer1)) {
            score++;
        }

    }

    /**
     * This method is called when the submit button is clicked. This method calculates score points and shows correct toast message.
     */
    public void submitAnswer(View view) {

        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();


        switch (score) {
            case 1:
                Toast.makeText(this, getString(R.string.toast_message_try_again1), Toast.LENGTH_SHORT).show();
                score = 0;
                break;
            case 2:
                Toast.makeText(this, getString(R.string.toast_message_try_again2), Toast.LENGTH_SHORT).show();
                score = 0;
                break;
            case 3:
                Toast.makeText(this, getString(R.string.toast_message_try_again3), Toast.LENGTH_SHORT).show();
                score = 0;
                break;
            case 4:
                Toast.makeText(this, getString(R.string.toast_message_try_again4), Toast.LENGTH_SHORT).show();
                score = 0;
                break;
            case 5:
                Toast.makeText(this, getString(R.string.toast_message_try_again5), Toast.LENGTH_SHORT).show();
                score = 0;
                break;
            case 6:
                Toast.makeText(this, getString(R.string.toast_message_try_again6), Toast.LENGTH_SHORT).show();
                score = 0;
                break;
            case 7:
                Toast.makeText(this, getString(R.string.toast_message_pass), Toast.LENGTH_LONG).show();
                score = 0;
                break;

        }
    }

}
