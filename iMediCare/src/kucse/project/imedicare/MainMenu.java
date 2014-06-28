package kucse.project.imedicare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends Activity {
	
	 private Button MuscleExerciseMenuBtn;
	 private Button BloodGroupCheckMenuBtn;
	 private Button ChildDiseasesBtn;
	 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		
		MuscleExerciseMenuBtn= (Button)findViewById(R.id.MuscleExerciseMenuBtn);
		BloodGroupCheckMenuBtn= (Button)findViewById(R.id.BloodGroupCheckMenuBtn);
		ChildDiseasesBtn= (Button)findViewById(R.id.ChildDiseasesBtn);
		
		
		MuscleExerciseMenuBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,MuscleExercise.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Muscle Exercise",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
		
		BloodGroupCheckMenuBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,BloodGroupDonarChecker.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Blood Group Donar Checker",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
		
		ChildDiseasesBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(MainMenu.this,ChildDiseases.class);
	      	  startActivity(in);
	      	  Toast.makeText(MainMenu.this,"Child Diseases",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
	}

}
