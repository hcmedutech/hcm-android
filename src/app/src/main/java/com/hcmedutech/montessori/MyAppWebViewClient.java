package com.hcmedutech.montessori;

import android.webkit.*;
import android.net.*;
import android.content.*;

public class MyAppWebViewClient extends WebViewClient {

	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		if(Uri.parse(url).getHost().endsWith("firebaseapp.com")) {
			return false;
		}
		if(Uri.parse(url).getHost().endsWith("likesyou.org")) {
			return false;
		}
		if(Uri.parse(url).getHost().endsWith("likesyou.org")) {
			return false;
		}
		if(Uri.parse(url).getHost().endsWith("000webhostapp.com")) {
			return false;
		}

		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
		view.getContext().startActivity(intent);
		return true;
	}
}