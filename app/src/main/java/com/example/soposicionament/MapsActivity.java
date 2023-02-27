package com.example.soposicionament;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.soposicionament.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng tarragona = new LatLng(41.11900137489028, 1.2433711307049586);
        mMap.addMarker(new MarkerOptions().position(tarragona).title("tarragona"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tarragona));


        LatLng bcn = new LatLng(41.38685137158004, 2.167996181484925);
        mMap.addMarker(new MarkerOptions().position(bcn).title("bcn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bcn));


        LatLng reus = new LatLng(41.15084632214716, 1.1049358227689676);
        mMap.addMarker(new MarkerOptions().position(reus).title("reus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(reus));

        LatLng valls = new LatLng(41.285618787386895, 1.2485608007387081);
        mMap.addMarker(new MarkerOptions().position(valls).title("valls"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(valls));

        LatLng girona = new LatLng(41.98018102097811, 2.8219280945699126);
        mMap.addMarker(new MarkerOptions().position(girona).title("girona"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(girona));
    }
}