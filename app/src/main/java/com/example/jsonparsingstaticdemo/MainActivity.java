package com.example.jsonparsingstaticdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    public static final String JSON_STRING="{\"employee\":{" +
            "\"name\":\"Sachin\"," +
            "\"salary\":56000}}";


    String strJson="{ \"Employee\" :[{\"id\":\"101\",\"name\":\"Sonoo Jaiswal\",\"salary\":\"50000\"}," +
            "{\"id\":\"102\",\"name\":\"Vimal Jaiswal\",\"salary\":\"60000\"}] }";

  /*  String strJson="{ \"Employee\" :[{\"id\":\"101\",\"name\":\"Sonoo Jaiswal\",\"salary\":\"50000\"}," +
            "{\"id\":\"102\",\"name\":\"Vimal Jaiswal\",\"salary\":\"60000\"}] }";*/


  /*  String strJson="{ \"Employee\" :[{\"id\":\"101\",\"name\":\"Sonoo Jaiswal\",\"salary\":\"50000\"}," +
            "{\"id\":\"102\",\"name\":\"Vimal Jaiswal\",\"salary\":\"60000\"}] }";*/



    /*{
        "employee": {
        "name": "sachin",
                "salary": 56000,
                "married": true
    }
    }*/


  /*  { "Employee" :
    [
        {"id":"101",
                "name":"Sonoo Jaiswal",
                "salary":"50000"},

        {"id":"102","name":"Vimal Jaiswal","salary":"60000"}
    ]
    }*/

  /*  { "Employee" :
    [
        {"id":"101",
                "name":"Sonoo Jaiswal",
                "salary":"50000"},

        {"id":"102","name":"Vimal Jaiswal","salary":"60000"}
    ]
    }*/

  /*  { "Employee" :
    [
        {"id":"101",
                "name":"Sonoo Jaiswal",
                "salary":"50000"},

        {"id":"102","name":"Vimal Jaiswal","salary":"60000"}
    ]
    }*/

    /*  { "Employee" :
    [
        {"id":"101",
                "name":"Sonoo Jaiswal",
                "salary":"50000"},

        {"id":"102","name":"Vimal Jaiswal","salary":"60000"}
    ]
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView1=(TextView)findViewById(R.id.textView1);

















        /*TextView textView1=(TextView)findViewById(R.id.textView1);*/
        String data = "";

        try {
            JSONObject emp = (new JSONObject(JSON_STRING).getJSONObject("employee"));

            Log.e("emp",""+emp);
            JSONObject empnew = new JSONObject(JSON_STRING);
            Log.e("empnew",""+empnew);

            JSONObject newtwo=empnew.getJSONObject("employee");
            Log.e("newtwo",""+newtwo);

            String name=emp.getString("name");
            int salary=emp.getInt("salary");

            Log.e("name",""+name);
            Log.e("salary",""+salary);

            String newname=newtwo.getString("name");
            String newsalary=newtwo.getString("salary");
            Log.e("newname",""+newname);
            Log.e("newsalary",""+newsalary);

            String str="employ name"+name+"\n"+"salary"+salary;
            //textView1.setText(str);


            JSONObject jsonObjectforaray = new JSONObject(strJson);
            JSONArray jsonArray=jsonObjectforaray.getJSONArray("Employee");
            Log.e("JSONARRAY",""+jsonArray);



            for (int i=0;i<=jsonArray.length();i++)
            {
                JSONObject arraydata = jsonArray.getJSONObject(i);

                String namearray= arraydata.getString("name");
                int idarray= Integer.parseInt(arraydata.optString("id").toString());
                int arrayid= Integer.parseInt(arraydata.optString("id").toString());
                float arraysalary= Float.parseFloat(arraydata.optString("salary").toString());

                data += "Node"+i+" : \n id= "+ idarray +" \n Name= "+ namearray +" \n Salary= "+ arraysalary +" \n ";
                textView1.setText(data);

            }









            String namearray= jsonArray.getString(Integer.parseInt("name"));
           String idarray= jsonArray.getString(Integer.parseInt("id"));

            Log.e("JSONARRAY name",""+namearray);
            Log.e("JSONARRAY id",""+idarray);








        }catch (Exception e)
        {

        }
    }
}

