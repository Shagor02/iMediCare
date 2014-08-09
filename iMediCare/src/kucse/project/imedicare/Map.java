package kucse.project.imedicare;


import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;



public class Map extends Activity{

	GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
     
        googleMap.setMyLocationEnabled(true);
        
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        
        LatLng position = new LatLng(22.8038187,89.531661);
        
        googleMap.addMarker(new MarkerOptions().position(position).title("Khulna University").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        
        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                new LatLng(22.8038187,89.531661)).zoom(12).build();
        
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        
        if (googleMap == null) {
            Toast.makeText(getApplicationContext(),
                    "Map Not Loading", Toast.LENGTH_SHORT)
                    .show();
        }
        
    }
    

 



}
