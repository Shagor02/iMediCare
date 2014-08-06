package kucse.project.imedicare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HealthTipsMenu extends Activity{
	private Button MuscleExerciseMenuBtn;
	 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.health_tips_menu);
		
		MuscleExerciseMenuBtn= (Button)findViewById(R.id.MuscleExerciseMenuBtn);
		
		MuscleExerciseMenuBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent(HealthTipsMenu.this,MuscleExercise.class);
	      	  startActivity(in);
	      	  Toast.makeText(HealthTipsMenu.this,"Muscle Exercise",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
		
	
	}
	

}
