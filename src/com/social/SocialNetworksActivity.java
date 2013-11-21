package com.social;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SocialNetworksActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	 WebView webview;
		
		
		
	    /** Called when the activity is first created. */
		
		
		 class HelloWebViewClient extends WebViewClient {
	         @Override
	         public boolean shouldOverrideUrlLoading(WebView view, String url) {
	             view.loadUrl(url);
	             return true;
	         }
	         
	        
	     }
		 
		 
		 
		
		 
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        
	        
	        Button fb;
	        fb = (Button)findViewById(R.id.button1);
	        fb.setOnClickListener(this);
	        
	        Button go;
	        go = (Button)findViewById(R.id.button2);
	        go.setOnClickListener(this);
	        
	        Button tw;
	        tw = (Button)findViewById(R.id.button3);
	        tw.setOnClickListener(this);
	        
	        
	       
	        
	        
	        
		     
	       
	        
	        
	        
	        
	        
	    }
		public void onClick(View v) {
			// TODO Auto-generated method stub
			webview = new WebView(this); 
			setContentView(webview);
			 webview.getSettings().setJavaScriptEnabled(true);
		     webview.setWebViewClient(new HelloWebViewClient());
		     webview.getSettings().setJavaScriptEnabled(true);
		     webview.setWebViewClient(new HelloWebViewClient());
		     
		     
			
			
			 
		    if (v.getId() == R.id.button1)
		    {
		    	webview.loadUrl("http://facebook.com");
		    	webview.requestFocus(View.FOCUS_DOWN);
		    	
		    }
		    else if
		       (v.getId() == R.id.button2)
		    {
		    	webview.loadUrl("http://plus.google.com");
		    	webview.requestFocus(View.FOCUS_DOWN);
		    	
		    }
		    
		    else  if (v.getId() == R.id.button3)
		    {
		    	webview.loadUrl("https://mobile.twitter.com/session/new");
		    	webview.requestFocus(View.FOCUS_DOWN);
		   
		     
		     }
		
		
	}
}
		
		
		
		 
