package com.example.yys.dbcaculator;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.yys.dbcaculator.R.id.btnRegist;
import static com.example.yys.dbcaculator.R.id.etEmail;

public class MainActivity extends AppCompatActivity {

    DBHelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText loginid = (EditText) findViewById(R.id.etEmail);
        final EditText loginpw = (EditText) findViewById(R.id.etPassword);
        Button login = (Button) findViewById(R.id.btnLogin);
        final Button signup = (Button) findViewById(R.id.btnRegist);

        helper = new DBHelper(MainActivity.this,"Login.db", null, 1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("aaa","aaa");
                db = helper.getReadableDatabase();
                String id = loginid.getText().toString();
                String pw = loginpw.getText().toString();
                String dbid = null;
                String dbpw = null;
                Log.d("bbb","bbb");
                Cursor cursor = db.rawQuery("SELECT * FROM SIGN",null);
                while (cursor.moveToNext()) {
                    dbid = cursor.getString(cursor.getColumnIndex("id"));
                    dbpw = cursor.getString(cursor.getColumnIndex("pw"));
                }
                Log.d("dbid",dbid);
                Log.d("dbpw",dbpw);


                if (id.equals(dbid) && )


            }
        });


    }


}
int a,b,result;

