package bullstock.com.bullstock;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by shrey on 09-01-2016.
 */
public class Myapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "KnnrpLpOYeSUfvLlceFicxv5fKLxKE5mplfag1Oq", "ftlkcBCMECime3PDkJa8m87dKzzptbvPJ1wz1ZVq");
        ParseInstallation.getCurrentInstallation().saveInBackground();

        //ParseInstallation pi = ParseInstallation.getCurrentInstallation();
    }

}
