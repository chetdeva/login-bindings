package com.fueled.loginbindings;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Copyright (c) 2017 Fueled. All rights reserved.
 *
 * @author chetansachdeva on 13/10/17
 */

public class BindingAdapter {

	/**
	 * Bind an action to an EditText when the "done" key is pressed.
	 *
	 * @param editText The EditText to listen to.
	 * @param runnable The action to trigger when the "done" key is pressed.
	 */
	@android.databinding.BindingAdapter("onKeyDonePressed")
	public static void onKeyDone(EditText editText, final Runnable runnable) {
		editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
			@Override public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
				if (actionId == EditorInfo.IME_ACTION_DONE) {
					runnable.run();
					return true;
				}
				return false;
			}
		});
	}
}
