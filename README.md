## Login Bindings

Login Bindings demonstrates how we can use Data Binding for callbacks from a Login Form

<img src="./README_images/login_screenshot.gif" width="300" height="534"/>

## How to Use

Enable Data Binding in your app build.gradle

```groovy
dataBinding {
    enabled = true
}
```

Use `notifyPropertyChanged` to get callbacks for email and password fields and hence manipulate the login button.

## Reference

- [Data Binding Library](https://developer.android.com/topic/libraries/data-binding/index.html)