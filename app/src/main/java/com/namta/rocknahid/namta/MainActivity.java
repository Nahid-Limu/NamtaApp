package com.namta.rocknahid.namta;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MainActivity extends Activity {

    EditText inputbox;
    Button show;
    TextView namta,result_txt;
    int num;
    String n;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputbox = (EditText) findViewById(R.id.input);
        show = (Button) findViewById(R.id.showbtn);
        namta = (TextView) findViewById(R.id.namtatxt);
        result_txt=(TextView)findViewById(R.id.tvres);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n = inputbox.getText().toString();
                num = Integer.parseInt(n);
                result = namtareturn(num);
                result_txt.setText(result);

            }
        });



    }

    public String namtareturn(int number){


        String str="";
        int ans;

        for(int i=1; i<=10; i++){
            ans=number*i;
            str=str+number+"*"+i+"="+ans+"\n";
        }

        return str;
    }


}
