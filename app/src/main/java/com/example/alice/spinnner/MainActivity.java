package com.example.alice.spinnner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Spinner spicity;
    private ArrayAdapter<CharSequence> adapterCity;
    private List<CharSequence> dataCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spiCity = findViewById(R.id.myCity);
        dataCity = new ArrayList<CharSequence>();
        dataCity.add("哈尔滨");
        dataCity.add("佳木斯");
        dataCity.add("牡丹江");
        spiCity.setPrompt("选择你喜欢的城市：");
        adapterCity = new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,this.dataCity);
        adapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiCity.setAdapter(this.adapterCity);
    }
}
