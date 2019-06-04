package com.example.moncotest;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

public class RandomAsyncTask extends AsyncTask<Void, Integer, Integer> {

    TextView textView;
    Random azar;

    public RandomAsyncTask(TextView textView) {
        this.textView = textView;
        azar = new Random();
    }

    @Override
    protected Integer doInBackground(Void... voids) {

        while (true) {

            publishProgress(azar.nextInt(100));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }

    }

    @Override
    protected void onProgressUpdate(Integer... integers) {
        super.onProgressUpdate();
        textView.setText(String.valueOf(integers[0]));
    }
}
