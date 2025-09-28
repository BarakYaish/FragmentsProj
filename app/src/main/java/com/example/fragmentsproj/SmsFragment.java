package com.example.fragmentsproj;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SmsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SmsFragment extends Fragment {
    private EditText etNumberMessage, etNumber;
    private Button btSendSms;

    public SmsFragment()
    {

    }

    public static SmsFragment newInstance() {
        SmsFragment fragment = new SmsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_sms, container, false);

        etNumberMessage = view.findViewById(R.id.etNumberMessage);
        etNumber = view.findViewById(R.id.etNumber);
        btSendSms = view.findViewById(R.id.btnSendSms);

        btSendSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = etNumberMessage.getText().toString();
                String number = etNumber.getText().toString();

                Toast.makeText(getActivity(), "From: " + number + "\n" + "Message: " + message, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}