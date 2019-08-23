package com.example.josycom.pickerfordateandtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Displays the date picker dialog
     */
    public void showDatePicker(View view) {
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    /*
    Converts the date picked by the user into a string
    And displays it in a Toast
     */
    public void processDatePickerResult(int year, int month, int day){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date) + " " + dateMessage, Toast.LENGTH_SHORT).show();
    }

    /*
    Displays the time picker dialog
     */
    public void showTimePicker(View view) {
        DialogFragment timeFragment = new TimePickerFragment();
        timeFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    /*
    Converts the time picked by the user into a string
    And displays it in a Toast
     */
    public void processTimePickerResult(int hour, int minute){
        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time) + " " + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
