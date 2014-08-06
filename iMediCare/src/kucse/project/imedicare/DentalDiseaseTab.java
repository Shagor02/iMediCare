package kucse.project.imedicare;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DentalDiseaseTab extends Fragment {
	private Button DentalOralCareBtn;
	 private TextView DentalDiseasesTabTextView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.dental_disease_tab, container, false);
		
		
		DentalOralCareBtn= (Button)rootView.findViewById(R.id.DentalOralCareBtn);
		
		DentalDiseasesTabTextView = (TextView) rootView.findViewById(R.id.dental_disease_tab_textView);
		
		DentalDiseasesTabTextView.setMovementMethod(new ScrollingMovementMethod());
		
		DentalDiseasesTabTextView.setText(R.string.Dental_Diseases_Wellcome);
		
		DentalOralCareBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	        	 Intent in=new Intent();
		      	 in.setClass(getActivity(), DentalOralCare.class);
		      	 startActivity(in);
		      	 
		      	 Toast.makeText(getActivity(),"Dental Diseases",
	                    Toast.LENGTH_SHORT).show();
		
			  }       
	  });
		
		
		
		
		
		return rootView;
	}
}
