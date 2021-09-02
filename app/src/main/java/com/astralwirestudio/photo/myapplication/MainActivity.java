package com.astralwirestudio.photo.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.astralwirestudio.photo.myapplication.utils.MyKeys;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.timepicker.MaterialTimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    // views and view groups
    // view group : constraint layout, linearlayout, frame layout, tablelayout, relative layout
    // view : button, checkbox , radio button , text view, edit text ....

    // notes : scroll view , card view

    //  manifest permissions
    //  intent data passing
    //  ----------------> saved instance state and restore instance state
    //  app icon + vector icons


    // Material.io : Alert dialogue,
    //              3. Date picker,
    //              4. Time picker,
    //              Snackbar,
    //              list + recycler view,
    //              spinner,
    //              menu ,
    //              Tab bar
    //              Viewpager
    //              webview
    //              bottom navigation,
    //              card view
    //              Notification
    //              Tablet and large screens
    //              1. Qualifiers
    //              2.tablet and large screens

    //    shared preference
    //    sqlite database


    Button b1;
    TextView t1;
    ImageView i1;
    Switch s1;
    EditText e1;

    CheckBox b0, b2;
    RadioGroup rg;

    ToggleButton tb;

    FloatingActionButton fab;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.cv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        String data[] = {"City1","City2","City3","City","City4"};

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,data);
        sp = findViewById(R.id.spinner);

        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data1 = data[position];
                Toast.makeText(MainActivity.this, ""+data1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//        b1 = new Button(this);
        b1 = findViewById(R.id.my_button);
        t1 = findViewById(R.id.textView);
        i1 = findViewById(R.id.imageView4);
        s1 = findViewById(R.id.switch1);
        e1 = findViewById(R.id.editTextTextPersonName);

        b0 = findViewById(R.id.box1);
        b2 = findViewById(R.id.box2);
        rg = findViewById(R.id.rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rBox1:
                        Toast.makeText(MainActivity.this, "Box 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rBox2:
                        Toast.makeText(MainActivity.this, "Box 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rBox3:
                        Toast.makeText(MainActivity.this, "Box 3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rBox4:
                        Toast.makeText(MainActivity.this, "Box 4", Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });


        tb = findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Toggle button checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Toggle button unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Box is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Box is unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });


//        .setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent intent = new Intent(MainActivity.this,Act4.class);
//                startActivity(intent);
//            }
//        });b1


        t1.setText("Text Chnage using java");
        i1.setImageResource(R.drawable.i1);
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Button is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Button off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this,Act4.class);

                i.putExtra(MyKeys.key1,"my data");

                startActivity(i);

                Snackbar sb = Snackbar.make(v, "Button click", Snackbar.LENGTH_SHORT);




                sb.setAction("Unod", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Undo my Action", Toast.LENGTH_SHORT).show();
                    }
                });
                sb.show();
            }
        });

    }

    public void next_Act(View view) {

        Intent i = new Intent(MainActivity.this, MainActivity2.class);

//        String data = e1.getText().toString();

//        i.putExtra("my_data", data);
        i.putExtra("true_or_false",true);
        i.putExtra("int_data",10);


        startActivity(i);


        Calendar c1 = Calendar.getInstance();

        int hour = c1.get(Calendar.HOUR);
        int min = c1.get(Calendar.MINUTE);

//        MaterialTimePicker tp = new MaterialTimePicker.Builder().setHour(hour).setMinute(min).build();
//
//        tp.addOnPositiveButtonClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               int m = tp.getMinute();
//               int h = tp.getHour();
//
//               String date = " "+h+ " : "+ m;
//
//               t1.setText(date);
//
//            }
//        });
//        tp.show(getSupportFragmentManager(),"Tag1");

        Calendar c2 = Calendar.getInstance();
        long date = c2.getTime().getTime();

        MaterialDatePicker dp =  MaterialDatePicker.Builder.datePicker().setSelection(date).build();

        dp.show(getSupportFragmentManager(),"TAg2");

    }
}