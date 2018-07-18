package com.example.alice.spinnner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    private Spinner spicity;
    private ArrayAdapter<CharSequence> adapterCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spiCity = findViewById(R.id.myCity);
        spiCity.setPrompt("选择你喜欢的城市：");
        adapterCity = ArrayAdapter.createFromResource(this,R.array.city_labels,android.R.layout.simple_spinner_item);
        adapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiCity.setAdapter(this.adapterCity);
    }
}
