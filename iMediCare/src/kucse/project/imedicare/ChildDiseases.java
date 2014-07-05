package kucse.project.imedicare;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class ChildDiseases extends Activity{
	// List view
		private ListView listView;
		final Context context = this;
		// Listview Adapter
		ArrayAdapter<String> arrayAdapter;
		
		// Search EditText
		EditText childDiseasesSearch;
		
		
		// ArrayList for Listview
		ArrayList<HashMap<String, String>> childDiseaseList;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.child_diseases);
	        
	        // Listview Data
	        String childDiseaseArray[] = {"Autism","Bronchiolitis","Chickenpox","Croup","Cystic fibrosis","Diphtheria","Fifth","Influenza" ,"Meningitis","Molluscum Contagiosum","Mumps","Pneumonia",
	        							  "Nephrotic Syndrome","Pink Eye","Poliomyelitis","Ringworm, Scalp","Rheumatic fever","Rickets","Rubella","Tetanus","Tuberculosis","Pertussis","Hepatitis A","Fever","Scarlet Fever",
	        							  
	        							 };
	        
	        listView = (ListView) findViewById(R.id.dental_care_listview);
	        childDiseasesSearch = (EditText) findViewById(R.id.dental_careSearchTexView);
	        
	        
	        listView.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					 Log.d("Clicked item id", " "+ id);
						
					// Dialog Box     
		     			final Dialog dialog = new Dialog(context);
		    			dialog.setContentView(R.layout.dialogbox);
		    			dialog.setTitle("Child Care");
		     
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
		    			
		    			
		    			if(id==0){
		    				
		    				text.setText(R.string.disease_id_0);
		    				}
		    			if(id==1){
		    				
		    				text.setText(R.string.disease_id_1);
		    			}
	        
	                    if(id==2){
	                    	text.setText(R.string.disease_id_2);
	                    }
	                    if(id==3){
	                    	text.setText(R.string.disease_id_3);
	                    }
	                    
	                    if(id==4){
	                    	text.setText(R.string.disease_id_4);
	                    }
	                    if(id==5){
	                    	text.setText(R.string.disease_id_5);
	                    }
	                    if(id==6){
	                    	text.setText(R.string.disease_id_6);
	                    }
	                    if(id==7){
	                    	text.setText(R.string.disease_id_7);
	                    }
	                    if(id==8){
	                    	text.setText(R.string.disease_id_8);
	                    }
	                    if(id==9){
	                    	text.setText(R.string.disease_id_9);
	                    	
	                    }
	                    if(id==10){
	                    	text.setText(R.string.disease_id_10);
	                    }
				}	
				
			});
	        
	        
	        
	        
	        
	        
	        
	        // Adding items to listview
	        arrayAdapter = new ArrayAdapter<String>(this, R.layout.childdiseases_list_items, R.id.dental_care_name, childDiseaseArray);
	        listView.setAdapter(arrayAdapter);
	        
	        /**
	         * Enabling Search Filter
	         * */
	        childDiseasesSearch.addTextChangedListener(new TextWatcher() {
				
				@Override
				public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
					// When user changed the Text
					ChildDiseases.this.arrayAdapter.getFilter().filter(cs);	
				}
				
				@Override
				public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
						int arg3) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void afterTextChanged(Editable arg0) {
					// TODO Auto-generated method stub							
				}
			});
	    }
	    
}
