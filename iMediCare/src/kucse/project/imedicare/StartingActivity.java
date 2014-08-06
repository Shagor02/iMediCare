package kucse.project.imedicare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class StartingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startingscreen);
		Thread timer = new Thread()
		{
			public void run()
			{
				try
				{
					sleep(2000);
				}catch(InterruptedException e)
				{ 
					e.printStackTrace();
				}finally
				{
					Intent menu = new Intent(StartingActivity.this,MainMenu.class );
					startActivity(menu);
				}
				
			}
			
		};
		
		timer.start();

	}

	@Override
	protected void onPause()
	{
		super.onPause();
		finish();
	}

}
