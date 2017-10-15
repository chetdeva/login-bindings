package com.fueled.loginbindings;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

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
		setLoginEnabled(isEmailAndPasswordSet());
	}

	@Bindable
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		notifyPropertyChanged(BR.password);
		setLoginEnabled(isEmailAndPasswordSet());
	}

	@Bindable
	public boolean isLoginEnabled() {
		return loginEnabled;
	}

	public void setLoginEnabled(boolean loginEnabled) {
		this.loginEnabled = loginEnabled;
		notifyPropertyChanged(BR.loginEnabled);
	}

	/**
	 * checks if email and password fields are set
	 *
	 * @return isEmailAndPasswordSet
	 */
	private boolean isEmailAndPasswordSet() {
		return !TextUtils.isEmpty(getEmail()) && !TextUtils.isEmpty(getPassword());
	}

}
