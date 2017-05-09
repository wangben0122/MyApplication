package test.jiyun.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mdzz
        mBtn = (Button) findViewById(R.id.Btn);
        mBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }
}
