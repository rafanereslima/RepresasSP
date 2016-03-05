package com.rafaneres.represassp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
	
	public class Dados extends Activity implements Runnable {
	   
	@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.dados);
	        
	        WebView mWebView = (WebView) findViewById(R.id.webView);
		    mWebView.getSettings().setJavaScriptEnabled(true);
		    mWebView.getSettings().setLoadWithOverviewMode(true);
		    mWebView.getSettings().setUseWideViewPort(false);
		    
		    mWebView.loadUrl("http://www2.sabesp.com.br/mananciais/DivulgacaoSiteSabesp.aspx");
		    
		       
	    }

	 	    
		@Override
		public void run() {
			
		}
	    
}

