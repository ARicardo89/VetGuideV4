package pe.ulima.edu.vetguidev3;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by USER on 09/10/2015.
 */
public class UseParse extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, ,);
                ParseFacebookUtils.initialize(this.getApplicationContext());



    }


}
