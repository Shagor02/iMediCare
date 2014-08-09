package kucse.project.imedicare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends Activity {
	 private Button DiseasesMenuBtn;
	 private Button BloodGroupCheckBtn;
	 private Button HealthTipsMenuBtn;
	 private Button Pharmacy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.main_menu);
		
		DiseasesMenuBtn= (Button)findViewById(R.id.Disease);
		BloodGroupCheckBtn= (Button)findViewById(R.id.BloodGroupChecker);
		HealthTipsMenuBtn = (Button)findViewById(R.id.HealthTipsMenuBtn);
		Pharmacy=(Button)findViewById(R.id.Pharmacy);
		
		Pharmacy.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,Map.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Pharmacy",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
		
		
		
		HealthTipsMenuBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,HealthTipsMenu.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Health Tips",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
		
		
		DiseasesMenuBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,DiseaseMenu.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Disease",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
	
		BloodGroupCheckBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,BloodGroupDonarChecker.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Blood Group Donar Checker",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
			
				
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
