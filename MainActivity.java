package com.example.halenurkar.hesapmakinesi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity  {

    Button button_delete, button_negative, button_percent, button_division, button_add, button_mult, button_subt, button_comma, button_equal,num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0;
    TextView screen;
    private double first_number=0;
    private double second_number=0;
    private double result=0;
    private String process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_delete = findViewById(R.id.button_delete);
        button_negative = findViewById(R.id.button_negative);
        button_percent = findViewById(R.id.button_percent);
        button_division = findViewById(R.id.button_division);
        button_add = findViewById(R.id.button_add);
        button_mult = findViewById(R.id.button_mult);
        button_subt = findViewById(R.id.button_subt);
        button_equal = findViewById(R.id.button_equal);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        num_3 = findViewById(R.id.num_3);
        num_4 = findViewById(R.id.num_4);
        num_5 = findViewById(R.id.num_5);
        num_6 = findViewById(R.id.num_6);
        num_7 = findViewById(R.id.num_7);
        num_8 = findViewById(R.id.num_8);
        num_9 = findViewById(R.id.num_9);
        num_0 = findViewById(R.id.num_0);
        screen = (TextView) findViewById(R.id.screen);

        num_0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "0");
            }
        });
        num_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "1");
            }
        });
        num_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "2");
            }
        });
        num_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "3");
            }
        });
        num_4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "4");
            }
        });
        num_5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "5");
            }
        });
        num_6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "6");
            }
        });
        num_7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "7");
            }
        });
        num_8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "8");
            }
        });
        num_9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "9");
            }
        });

        try {
            button_add.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!screen.getText().toString().equals("")){
                        first_number = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                    process = "add";

                }}
            });
        }
        catch (Exception e){}

        try {
            button_mult.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!screen.getText().toString().equals(""))
                    {
                        first_number=Double.parseDouble(screen.getText().toString());
                        screen.setText("");
                        process ="mult";
                    }
                }
            });
        }
        catch (Exception e){}
        try {
            button_subt.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!screen.getText().toString().equals(""))
                    {
                        first_number=Double.parseDouble(screen.getText().toString());
                        screen.setText("");
                        process="subt";
                    }
                }
            });
        }
        catch (Exception e){}

        try {
            button_division.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!screen.getText().toString().equals(""))
                    {
                        first_number=Double.parseDouble(screen.getText().toString());
                        screen.setText("");
                        process="division";
                    }
                }
            });

        }

        catch (Exception e) {}

        try {
            button_percent.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!screen.getText().toString().equals(""))
                    {
                        first_number=Double.parseDouble(screen.getText().toString());
                        screen.setText("");
                        process="percent";
                    }
                }
            });
        }
        catch (Exception e) {}

        try {
            button_negative.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!screen.getText().toString().equals(""))
                    {
                        first_number=Double.parseDouble(screen.getText().toString());

                         result=first_number*(-1);
                         screen.setText(String.valueOf(result));

                    }
                }
            });
        }
        catch (Exception e){}


        try {
            button_delete.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!screen.getText().toString().equals(""))
                    {
                        first_number=Double.parseDouble(screen.getText().toString());

                            first_number=0;
                            result=0;
                            screen.setText("");

                    }
                }
            });
        }
        catch (Exception e) {}

        button_equal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!screen.getText().toString().equals("") && !String.valueOf(first_number).equals(0))
                {
                    if(process.equals("add"))
                    {
                        result= first_number + Double.parseDouble(screen.getText().toString());
                        screen.setText(String.valueOf(result));
                    }
                    else if (process.equals("subt"))
                    {
                        result=first_number- Double.parseDouble(screen.getText().toString());
                    }
                    else if (process.equals("mult"))
                    {
                        result=first_number*Double.parseDouble(screen.getText().toString());
                    }
                    else if(process.equals("division"))
                    {
                        result=first_number/ Double.parseDouble(screen.getText().toString());
                    }
                    else if(process.equals("percent"))
                    {
                        result=(first_number* Double.parseDouble(screen.getText().toString()))/100;
                    }

                    screen.setText(String.valueOf(result));
                    first_number=0;
                    result=0;
                }
                else
                {
                    screen.setText("not found");
                }



            }
        });







    }

}
