package phc.com.myanimationmanage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import phc.com.animationmanage.AnimationManage;

public class MainActivity extends AppCompatActivity {

    TextView main_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        main_txt=findViewById(R.id.main_txt);


        new AnimationManage.Builder(main_txt,-1,1000).setRotation(new float[]{0,360}).start();

    }
}