package com.example.fragmentsproj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
/**
 * A simple {@link Fragment} subclass that allows the user to compose and "send" an email.
 * It contains fields for the email address and message body, and a button to trigger the action.
 * Use the {@link EmailFragment#newInstance} factory method to
 * create an instance of this fragment if you need to pass arguments upon creation.
 */

public class EmailFragment extends Fragment {
    private EditText etEmailMessage, etEmail;
    private Button btSendEmail;

    public EmailFragment()
    {

    }
    public static EmailFragment newInstance() {
        EmailFragment fragment = new EmailFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_email, container, false);

        etEmailMessage = view.findViewById(R.id.etEmailMessage);
        etEmail = view.findViewById(R.id.etEmail);
        btSendEmail = view.findViewById(R.id.btnSendEmail);

        btSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = etEmailMessage.getText().toString();
                String email = etEmail.getText().toString();

                Toast.makeText(getActivity(), "From: " + email + "\n" + "Message: " + message, Toast.LENGTH_LONG ).show();
            }
        });
        return view;
    }
}