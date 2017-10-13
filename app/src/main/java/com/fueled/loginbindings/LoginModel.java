package com.fueled.loginbindings;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.fueled.loginbindings.BR;

/**
 * Copyright (c) 2017 Fueled. All rights reserved.
 *
 * @author chetansachdeva on 13/10/17
 */

public class LoginModel extends BaseObservable {

	private String email;
	private String password;
	private boolean loginEnabled;

	@Bindable
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		notifyPropertyChanged(BR.email);
		setLoginEnabled(isEmailAndPasswordSet() && isValidEmail());
	}

	@Bindable
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		notifyPropertyChanged(BR.password);
		setLoginEnabled(isEmailAndPasswordSet() && isValidEmail());
	}

	@Bindable
	public boolean isLoginEnabled() {
		return loginEnabled;
	}

	public void setLoginEnabled(boolean loginEnabled) {
		this.loginEnabled = loginEnabled;
		notifyPropertyChanged(BR.loginEnabled);
	}

	private boolean isEmailAndPasswordSet() {
		return !TextUtils.isEmpty(getEmail()) && !TextUtils.isEmpty(getPassword());
	}

	private boolean isValidEmail() {
		return !getEmail().contains(" ") && getEmail().contains("@");   // replace with regex
	}

}
