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

public class DentalOralCare extends Activity {
	
	// List view
	private ListView listView;
	final Context context = this;
	// Listview Adapter
	ArrayAdapter<String> arrayAdapter;
	
	// Search EditText
	EditText dentalDiseasesSearch;
	
	
	// ArrayList for ListView
	ArrayList<HashMap<String, String>> childDiseaseList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dental_care);
        
        // ListView Data
        String dentalDiseaseArray[] = { "Broken Tooth" , "Dental cavities" , "Gingivitis" , "Impacted Tooth" , "Leukoplakia" , "Ludwig’s Angina" , "Malocclusion of Teeth" , "Mouth sores" ,
        								"Mouth Ulcers" , "Natal teeth" , "Oral Cancer" , "Oral thrush" , "Periodontitis" , "Plaque and Tartar on Teeth" , "Tooth - abnormal colors" ,
        								"Tooth - abnormal shape" , "Tooth abscess" , "Toothaches" , "Trench mouth" , "Widely spaced teeth"
        							  
        							 };
        
        listView = (ListView) findViewById(R.id.dental_care_listview);
        dentalDiseasesSearch = (EditText) findViewById(R.id.dental_careSearchTexView);
        
        
        listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				 Log.d("Clicked item id", " "+ id);
					
				// Dialog Box     
	     			final Dialog dialog = new Dialog(context);
	    			dialog.setContentView(R.layout.dialogbox);
	    			dialog.setTitle("Dental Care");
	     
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
	    				
	    				text.setText(R.string.dental_care_id_0);
	    				}
	    			if(id==1){
	    				
	    				text.setText(R.string.dental_care_id_1);
	    			}
        
                    if(id==2){
                    	text.setText(R.string.dental_care_id_2);
                    }
                    if(id==3){
                    	text.setText(R.string.dental_care_id_3);
                    }
                    
                    if(id==4){
                    	text.setText(R.string.dental_care_id_4);
                    }
                    if(id==5){
                    	text.setText(R.string.dental_care_id_5);
                    }
                
			}	
			
		});
        
        
        
        
        
        
        
        // Adding items to listView
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.dental_care_list_items, R.id.dental_care_name, dentalDiseaseArray);
        listView.setAdapter(arrayAdapter);
        
        /**
         * Enabling Search Filter
         * */
        dentalDiseasesSearch.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
				// When user changed the Text
				DentalOralCare.this.arrayAdapter.getFilter().filter(cs);	
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
