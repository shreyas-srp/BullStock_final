package bullstock.com.bullstock;

import android.app.Application;

<<<<<<< HEAD
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
import com.parse.ParseInstallation;

=======
>>>>>>> parent of 2404c6e... k
/**
 * Created by shrey on 09-01-2016.
 */
public class Myapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Parse.enableLocalDatastore(this);

        //Parse.enableLocalDatastore(this);
        //Parse.initialize(this);

<<<<<<< HEAD
        ParseACL.setDefaultACL(defaultACL, true);
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "KnnrpLpOYeSUfvLlceFicxv5fKLxKE5mplfag1Oq", "ftlkcBCMECime3PDkJa8m87dKzzptbvPJ1wz1ZVq");
        ParseInstallation.getCurrentInstallation().saveInBackground();

        //ParseInstallation pi = ParseInstallation.getCurrentInstallation();
=======
>>>>>>> parent of 2404c6e... k
    }

}
