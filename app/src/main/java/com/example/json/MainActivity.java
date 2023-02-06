package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
private TextView textName,textSalary;
    String JSON_STRING = "{\"employee\":{\"name\":\"Vishal Pandey\",\"salary\":65000}}";
    String name;
    String salary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        textName = findViewById(R.id.textName);
        textSalary = findViewById(R.id.textSalary);


        try {

            JSONObject jsonObject = new JSONObject(JSON_STRING);
            JSONObject employee = jsonObject.getJSONObject("employee");

            name = employee.getString("name");
            salary = employee.getString("salary");

            textName.setText("Name: "+ name);
            textSalary.setText("Salary: "+ salary);

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}