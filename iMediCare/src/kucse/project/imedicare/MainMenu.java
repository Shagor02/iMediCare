package kucse.project.imedicare;



import android.app.Activity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.MenuInflater;
import android.view.MenuItem;
=======
>>>>>>> 8c20ddcfdab0774f3f3139500446e1a53802644e
import android.view.Window;
import android.view.WindowManager;

public class MainMenu extends Activity {
	
<<<<<<< HEAD
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.main_menu);
		
		
				// android:background="#008FD5"
				
	}

	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {

		 super.onCreateOptionsMenu(menu);
		MenuInflater blow = getMenuInflater();
		blow.inflate(R.menu.options, menu);
		return true;
	}


	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.aboutUs:
			
			break;
		case R.id.exit:
			finish();
			break;
		
		}
		
		
		return false;
	}
=======
	 
	 @Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	        WindowManager.LayoutParams.FLAG_FULLSCREEN);

			setContentView(R.layout.main_menu);
			
			
					// android:background="#008FD5"
					
		
		}
>>>>>>> 8c20ddcfdab0774f3f3139500446e1a53802644e


}
