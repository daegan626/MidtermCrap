package com.flournoy.burnedcaloriescalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class BurnedCaloriesCalculatorActivity extends Activity {


    /* I know this program is super incomplete but I am to slow to complete it at all without more time */

    @Override
    public void onCreate(
            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AdapterView.OnItemSelectedListener onSpinner =
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {
                        TextView myTextView =
                                (TextView)findViewById(R.id.textView);
                        myTextView.setText(Integer.toString(position));
                    }

                    @Override
                    public void onNothingSelected(
                            AdapterView<?> parent) {
                    }
                };

        setContentView(R.layout.activity_burned_calories_calculator);
        String[] heightFT = {"4", "5", "6"};
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item, heightFT);
        Spinner spinner =
                (Spinner) findViewById(R.id.heightFeetNumID);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(onSpinner);
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

    private class StringArrayAdapter {
    }
}
