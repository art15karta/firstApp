package com.example.crime;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.text.format.DateFormat;
import android.widget.DatePicker;


public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

@Override
public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    mCrime = new Crime();
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_crime, parent, false);


    mDateButton = v.findViewById(R.id.crime_date);
    mDateButton.setText(mCrime.getDate().toString());
    mDateButton.setEnabled(false);

    mSolvedCheckBox = v.findViewById(R.id.crime_solved);
    mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            mCrime.setSolved(isChecked);

        }
    });


    mTitleField = v.findViewById(R.id.crime_title);
    mTitleField.addTextChangedListener(new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence c, int start, int count, int after) {
            mCrime.setTitle(c.toString());

        }

        @Override
        public void beforeTextChanged(CharSequence c, int start, int count, int after) {
            //
        }

        @Override
        public void afterTextChanged(Editable c) {
            //

        }
    });

    return v;
    }
}