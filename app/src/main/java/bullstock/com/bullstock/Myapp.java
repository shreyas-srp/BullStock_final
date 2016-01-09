package bullstock.com.bullstock;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by shrey on 09-01-2016.
 */
public class Myapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "W41F9Es361XyIfFhkRXEH72v5YCEUaYWBOctkdsv", "uwLh4V0V4idjTZXNDo1hsKRHdCYQAasQJNVSB0XN");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
