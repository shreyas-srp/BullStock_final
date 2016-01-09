package bullstock.com.bullstock;


import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends android.support.v4.app.Fragment {

    public static final String PREFS_NAME = "Credentials";

    Button login_btn;
    EditText username_edit,password_edit;
    //final ProgressDialog pd = new ProgressDialog(getContext());


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



        final String username = username_edit.getText().toString();
        final String password = password_edit.getText().toString();



        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getContext(),"Enter valid",Toast.LENGTH_SHORT).show();

                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(getContext(),"Enter ", Toast.LENGTH_LONG).show();
                    //return;
                }


                /*pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                pd.setMessage("Please Wait...");
                pd.setIndeterminate(true);
                pd.setCancelable(false);
                //pd.show();*/

                //pd.show();
                login_process obj = new login_process();
                //
                obj.execute("sdfd");
                //Toast.makeText(getContext(),"Enter 435 ",Toast.LENGTH_SHORT).show();



            }
        });
        return rootview;
    }

}

class login_process extends AsyncTask<String,Void,String> {

    @Override
    protected String doInBackground(String params[]){

        String status = new String();
        try {
            HttpClient httpClient = new DefaultHttpClient();

// Creating HTTP Post
            HttpPost httpPost = new HttpPost("http://10.10.21.110/");
        }
        catch (Exception e){
            Log.e("shrey",e+"");
        }


        return status;
    }

}
