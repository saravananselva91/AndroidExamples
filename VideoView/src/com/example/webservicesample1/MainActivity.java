package com.example.webservicesample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends ActionBarActivity {

	VideoView vView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		vView = (VideoView) findViewById(R.id.videoView1);

		MediaController mController = new MediaController(this);
		mController.setAnchorView(vView);

		vView.setMediaController(mController);
		vView.setVideoURI(Uri.parse("android.resource://" + getPackageName()
				+ "/" + R.raw.wild_life));
		vView.requestFocus();
		try {
			vView.start();
		} catch (Exception e) {

			Toast.makeText(getApplicationContext(), "Error is " + e,
					Toast.LENGTH_LONG).show();
		}
	}

}
