package sg.edu.rp.c346.id20011262.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = findViewById(R.id.checkBoxDiscount);
        btn = findViewById(R.id.buttonCheck);
        tv = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this,"Button Click",Toast.LENGTH_LONG).show();
                if(cb.isChecked()) {
                    double pay = calcpay(100,20);
                    tv.setText("The discount is given!");
                } else {
                    tv.setText("No discount is given.");
                }
            }
        });
    }
    private double calcpay(double price, double discount) {
        return price * (1 - discount/100);
    }
}