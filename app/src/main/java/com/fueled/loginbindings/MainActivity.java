package com.fueled.loginbindings;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.fueled.loginbindings.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainHandler {

	private ActivityMainBinding binding;
	private LoginModel model = new LoginModel();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

		binding.setModel(model);
		binding.setHandler(this);
	}

	@Override
	public void onLoginClicked(String email, String password) {
		Toast.makeText(this, "Email: " + email + "\nPassword: " + password, Toast.LENGTH_SHORT).show();
	}
}
