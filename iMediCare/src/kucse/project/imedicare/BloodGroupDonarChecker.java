package kucse.project.imedicare;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class BloodGroupDonarChecker extends Activity {
	final Context context = this;
	private Button check;
	private Button close;
    private RadioGroup radioGroup;
    private RadioButton checkedRadioButton;
    String checkedText;
    protected void onCreate(Bundle excercise) {
        super.onCreate(excercise);
        setContentView(R.layout.bloodgroupchecker);
        
        check = (Button) findViewById(R.id.bloodgroupcheck);
     //   close = (Button) findViewById(R.id.c);
        
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                                @Override
                                public void onCheckedChanged(RadioGroup group, int checkedId) {
                                        checkedRadioButton = (RadioButton) findViewById(checkedId);
                                        checkedText = checkedRadioButton.getText().toString();
                                        Toast.makeText(getApplicationContext(), checkedText,
                                                        Toast.LENGTH_SHORT).show();
                                }
                        });
        
        
        
        check.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
            	
            	// Dialog Box     
     			final Dialog dialog = new Dialog(context);
    			dialog.setContentView(R.layout.dialogbox);
    			dialog.setTitle("Your Safely Receive Blood Group");
     
    			// set the custom dialog components - text, image and button
    			TextView text = (TextView) dialog.findViewById(R.id.text);
    			ImageView image = (ImageView) dialog.findViewById(R.id.image);
    			image.setImageResource(R.drawable.ic_launcher);
     
    			Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
    			
    			// if button is clicked, close the custom dialog
    			dialogButton.setOnClickListener(new OnClickListener() {
    				@Override
    				public void onClick(View v) {
    					dialog.dismiss();
    				}
    			});
     
    			dialog.show();
    			text.setMovementMethod(new ScrollingMovementMethod());
    			if(checkedText.contains("A+")){
    				text.setText(R.string.A1);
    				
    			}
    			if(checkedText.contains("A-")){
    				text.setText(R.string.A2);
    				
    				
    			}
    			if(checkedText.contains("B+")){
    				text.setText(R.string.B1);
				
					
    			}
    			
    			if(checkedText.contains("B-")){
    				text.setText(R.string.B2);
				
					
    			}
    			
    			if(checkedText.contains("AB+")){
    				text.setText(R.string.AB1);
				
					
    			}
    			
    			if(checkedText.contains("AB-")){
    				text.setText(R.string.AB2);
				
					
    			}
    			
    			if(checkedText.contains("O+")){
    				text.setText(R.string.O1);
				
					
    			}
    			if(checkedText.contains("O-")){
    				text.setText(R.string.O2);
				
					
    			}
    			
            }
            
        });
				


         }

	 

}
