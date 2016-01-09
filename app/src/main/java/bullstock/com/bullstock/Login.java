package bullstock.com.bullstock;


import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends android.support.v4.app.Fragment {

    public static final String PREFS_NAME = "Credentials";

    Button login_btn;
    EditText username_edit,password_edit;



    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_login, container, false);

        login_btn = (Button) rootview.findViewById(R.id.login_button);
        username_edit = (EditText) rootview.findViewById(R.id.login_username);
        password_edit = (EditText) rootview.findViewById(R.id.login_password);

        String username = username_edit.getText().toString();
        String password = password_edit.getText().toString();

        if(username.isEmpty() || password.isEmpty()){
            Toast.makeText(getContext(),"Enter valid credentials",Toast.LENGTH_LONG);
        }

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog pd = new ProgressDialog(getContext());
                pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                pd.setMessage("Please Wait...");
                pd.setIndeterminate(true);
                pd.setCancelable(false);
                pd.show();

                Thread mThread = new Thread() {
                    @Override
                    public void run() {

                    }
                };

                mThread.start();


            }
        });


        return rootview;
    }

}
