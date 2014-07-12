package kucse.project.imedicare;


import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;

public class MuscleExercise extends Activity implements SensorEventListener{
	
	SensorManager sensor;
	  TextView textView;
	  int i=0;
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.muscle_exercise);
	   textView=(TextView)findViewById(R.id.bloodGroupCheckertextView);
	  
	   sensor=(SensorManager)this.getSystemService(Context.SENSOR_SERVICE);

	 sensor.registerListener(this,sensor.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
	SensorManager.SENSOR_DELAY_NORMAL);
	  }

	  @Override
	  public void onAccuracyChanged(Sensor sensor, int accuracy)
	  {
	   
	  }
	 
	  @Override
	  public void onSensorChanged(SensorEvent event)
	  {
	   if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER)
	   {
	    //get x, y, z values
	    float axis[]=event.values;
	    float x=axis[0];
	    float y=axis[1];
	    float z=axis[2];
	    
	   float movement=(x*x+y*y+z*z)/(SensorManager.GRAVITY_EARTH*
	SensorManager.GRAVITY_EARTH);
	 
	   if(movement>=2)
	     {
      
	      ++i;
	      textView.setText(""+i);
	     }
	    }
	  } 
	

}
