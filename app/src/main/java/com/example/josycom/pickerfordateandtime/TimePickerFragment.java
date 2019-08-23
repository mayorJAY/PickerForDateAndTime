package com.example.josycom.pickerfordateandtime;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    /*
     Sets the time that has been picked
     */
    @NonNull
    @Override
    public Dialog onCreateDialog (Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(), this, hour, minute, true);
    }

    /*
    Gets the Main Activity and calls the processTimePickerResult() method
     */
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        MainActivity activity = (MainActivity) getActivity();
        assert activity != null;
        activity.processTimePickerResult(hourOfDay, minute);
    }
}
