package code.blue.autotextcomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    public static final String[] MONTHS = new String[]{
       "January", "February", "March", "April", "May", "April", "May", "June", "July", "August", "September", "October" , "November", "December"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView monthText = findViewById(R.id.months);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, MONTHS);
        monthText.setAdapter(adapter);
    }
}
