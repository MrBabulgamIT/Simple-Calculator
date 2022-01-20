package com.example.com.simplecalculatora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

     private Button zeroButton,oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,savenButton,eightButton,nineButton,CButton,DELButton,braketButton,
    divButton,mulButton,minusButton,pluseButton,equalButton,dotButton,persentageButton;

     private TextView inputtextView,outputTextView;
     String process;
     boolean cheekbraket=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zeroButton=findViewById(R.id.zero_Button);
        oneButton=findViewById(R.id.one_Button);
        twoButton=findViewById(R.id.two_Button);
        threeButton=findViewById(R.id.theree_Button);
        fourButton=findViewById(R.id.four_Button);
        fiveButton=findViewById(R.id.five_Button);
        sixButton=findViewById(R.id.six_Button);
        savenButton=findViewById(R.id.seven_Button);
        eightButton=findViewById(R.id.eight_Button);
        nineButton=findViewById(R.id.nine_Button);

        CButton=findViewById(R.id.c_Button);
        DELButton=findViewById(R.id.det_Button);


        braketButton=findViewById(R.id.braket_Button);
        persentageButton=findViewById(R.id.persentage_Button);
        dotButton=findViewById(R.id.dot_Button);

        equalButton=findViewById(R.id.equal_Button);
        pluseButton=findViewById(R.id.plus_Button);
        minusButton=findViewById(R.id.minus_Button);
        mulButton=findViewById(R.id.multi_Button);
        divButton=findViewById(R.id.division_Button);



        inputtextView=findViewById(R.id.input_text_view);
        outputTextView=findViewById(R.id.result_text_view);

        CButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputtextView.setText("");
                outputTextView.setText("");
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"0");
            }
        });
         oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"1");
            }
        });
         twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"2");
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"3");
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"4");
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"5");
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"6");
            }
        });
        savenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"7");
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"8");
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"9");
            }
        });
        pluseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"+");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"-");
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"×");
            }
        });
       divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+"÷");
            }
        });
       dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process=inputtextView.getText().toString();
                inputtextView.setText(process+".");
            }
        });
        persentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputtextView.getText().toString();
                inputtextView.setText(process+"%");
            }
        });
        braketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cheekbraket){

                    process=inputtextView.getText().toString();
                    inputtextView.setText(process+")");
                    cheekbraket=false;

                }else
                {
                    process=inputtextView.getText().toString();
                    inputtextView.setText(process+"(");
                    cheekbraket=true;

                }

            }
        });

        DELButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String string = inputtextView.getText().toString();
                if (string.length() > 1) {
                    string = string.substring(0, string.length() - 1);
                    inputtextView.setText(string);
                } else if (string.length() <= 1) {
                    inputtextView.setText("0");
                }
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                {


                    process = inputtextView.getText().toString();

                    process = process.replaceAll("×", "*");
                    process = process.replaceAll("%", "/100");
                    process = process.replaceAll("÷", "/");

                    Context rhino = Context.enter();

                    rhino.setOptimizationLevel(-1);

                    String finalResult = "";

                    try {
                        Scriptable scriptable = rhino.initStandardObjects();
                        finalResult = rhino.evaluateString(scriptable, process, "javascript", 1, null).toString();
                    } catch (Exception e) {
                        finalResult = "0";
                    }

                    outputTextView.setText(finalResult);

                }


            }


        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.share_id){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="Android Calculator Application.";
            String body="This is very Useful to Simple Calculation.\n com.example.com.simplecalculatora";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"Share with"));

        }
        else

        if (item.getItemId()==R.id.feedback_id)
        {

            Intent intent=new Intent(getApplicationContext(),FeedBack_Activity.class);
            startActivity(intent);



        }else
        if (item.getItemId()==R.id.AboutUs_id)
        {

            Intent intent=new Intent(getApplicationContext(),AboutActivity.class);
            startActivity(intent);



        }




        return super.onOptionsItemSelected(item);


    }
}
