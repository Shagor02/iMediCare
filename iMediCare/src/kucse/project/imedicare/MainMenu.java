package kucse.project.imedicare;



import android.app.Activity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class MainMenu extends Activity {
	
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


}
