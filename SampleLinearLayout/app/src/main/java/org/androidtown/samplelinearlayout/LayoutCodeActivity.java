package org.androidtown.samplelinearlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);


        Button button01 = new Button(this);
        button01.setText("Button01");
        button01.setLayoutParams(params);
        mainLayout.addView(button01);

        Button button02 = new Button(this);
        button02.setText("헤헤헿헤헤에헤ㅔ헤ㅔㅎㅎ");
        button02.setLayoutParams(params);
        mainLayout.addView(button02);
        setContentView(mainLayout);


    }


}
