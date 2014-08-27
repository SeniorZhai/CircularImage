package com.zoe.CircularImage;

import android.app.Activity;
import android.os.Bundle;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.zoe.CircularImage.widget.CircularImage;

/**
 * 
 * @author doublefi123
 * 
 */
public class MainActivity extends Activity {
	DisplayImageOptions options;
	protected ImageLoader imageLoader = ImageLoader.getInstance();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		options = new DisplayImageOptions.Builder()
				.showImageOnLoading(R.drawable.default_user_avatar)
				.showImageForEmptyUri(R.drawable.default_user_avatar)
				.showImageOnFail(R.drawable.default_user_avatar).cacheInMemory(true)
				.cacheOnDisc(true).considerExifParams(true)
				.displayer(new RoundedBitmapDisplayer(20)).build();
		
		CircularImage cover_user_photo = (CircularImage) findViewById(R.id.cover_user_photo);
		imageLoader.displayImage("https://avatars3.githubusercontent.com/u/5416585?v=2&s=460", cover_user_photo, options);
	}
}
