package com.example.gujian.app027;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import com.example.gujian.app027.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /*声明 TextView、CheckBox、Button对象*/
    public TextView myTextView1;
    public TextView myTextView2;
    public CheckBox myCheckBox;
    public Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        setContentView(R.layout.activity_main);*/
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        setContentView(R.layout.main);

    /*取得TextView、CheckBox、Button*/
        myTextView1 = (TextView) findViewById(R.id.myTextView1);
        myTextView2 = (TextView) findViewById(R.id.myTextView2);
        myCheckBox = (CheckBox) findViewById(R.id.myCheckBox);
        myButton = (Button) findViewById(R.id.myButton);

    /*将CheckBox、Button默认为未选择状态*/
        myCheckBox.setChecked(false);
        myButton.setEnabled(false);

        myCheckBox.setOnClickListener(new CheckBox.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                if(myCheckBox.isChecked())
                {
          /*设置Button为不能选择对象*/
                    myButton.setEnabled(true);
                    myTextView2.setText("");
                }
                else
                {
          /*设置Button为可以选择对象*/
                    myButton.setEnabled(false);
                    myTextView1.setText(R.string.text1);
          /*在TextView2里显示出"请勾选我同意"*/
                    myTextView2.setText(R.string.no);
                }
            }
        });

        myButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                if(myCheckBox.isChecked())
                {
                    myTextView1.setText(R.string.ok);
                }else
                {
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
