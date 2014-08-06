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

public class ChildDiseaseTab extends Fragment {
	
	 private TextView ChildDiseasesTabTextView;
	 private Button ChildDiseasesBtn;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		

		View rootView = inflater.inflate(R.layout.child_disease_tab, container, false);
		ChildDiseasesTabTextView = (TextView) rootView.findViewById(R.id.child_diseases_tab_textView);
		
		ChildDiseasesBtn= (Button)rootView.findViewById(R.id.ChildDiseasesBtn);
	
		ChildDiseasesTabTextView.setMovementMethod(new ScrollingMovementMethod());
		
		ChildDiseasesTabTextView.setText(R.string.Child_Diseases_Wellcome);
		
		ChildDiseasesBtn.setOnClickListener(new View.OnClickListener() {
		     
	        @Override
	        public void onClick(View v) {

	      	  Intent in=new Intent();
	      	  in.setClass(getActivity(), ChildDiseases.class);
	      	  startActivity(in);
	      	Toast.makeText(getActivity(),"Child Diseases",
                    Toast.LENGTH_SHORT).show();
			  }       
	  });
	  
		return rootView;
	}
	
	


}
