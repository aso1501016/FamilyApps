package jp.ac.asojuku.st.familyapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by RMS0897 on 2016/11/02.
 */
public class RouletteActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulette);
        Random rnd = new Random();

        int ran = rnd.nextInt(2) + 1;
        TextView textView4=(TextView) findViewById(R.id.textView4);
        for(int i = 0; i<ran; i++){
            if(i%2==0){
                textView4.setText("和食");
            }else{
                textView4.setText("パン");
            }
        }
    }
}
