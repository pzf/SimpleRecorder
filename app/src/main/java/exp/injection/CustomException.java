package exp.injection;

import android.util.Log;

import java.io.File;
import java.util.List;

public class CustomException {
    public static final String TAG = CustomException.class.getSimpleName();

    public static void injectNullPointerException (File file){
        try {
            Log.i(TAG,"injectNullPointerException begin");
            List<File> files = null;
            files.add(file);
        } finally {
            Log.i(TAG,"injectNullPointerException after");
        }
    }
}
