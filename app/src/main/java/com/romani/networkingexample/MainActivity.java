package com.romani.networkingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    String url = "https://www.google.com";
    TextView textView;

//    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET , url ,null, new Response.Listener<JSONObject>() {
//        @Override
//        public void onResponse(JSONObject response) {
//
//        }
//    } , new Response.ErrorListener() {
//        @Override
//        public void onErrorResponse(VolleyError error) {
//
//        }
//    });


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.TXT);

//        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response)
//            {
//                textView.setText(response);
//                Log.d("URL response" , response);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//
//        Volley.newRequestQueue(this).add(request);



    }
}
