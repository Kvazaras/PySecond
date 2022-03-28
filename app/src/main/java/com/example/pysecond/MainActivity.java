package com.example.pysecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    Python py;
    PyObject module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        this.py = Python.getInstance();
        this.module = this.py.getModule("pycode");

        Integer charsCount = this.module.callAttr("countchars", "TestString").toJava(Integer.class);
        Toast.makeText(this, charsCount.toString(), Toast.LENGTH_LONG).show();
    }
}