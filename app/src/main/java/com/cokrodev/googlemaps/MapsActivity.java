package com.cokrodev.googlemaps;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button normal, satelit, terain, hybrid, none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        LatLng yogyakarta = new LatLng(-7.795766, 110.368321);

        //untuk merubah warna dapat merubah bagian BitmapDescriptorFactory
        //berbagai pilihannya :
        //BitmapDescriptorFactory.HUE_BLUE) = Warna Biru
        //BitmapDescriptorFactory.HUE_YELLOW) = Warna Kuning
        //BitmapDescriptorFactory.HUE_GREEN) = Warna Hijau
        //BitmapDescriptorFactory.HUE_MAGENTA) = Warna Magenta
        //BitmapDescriptorFactory.HUE_ORANGE) = Warna Biru
        mMap.addMarker(new MarkerOptions().position(yogyakarta).title("Yogykarata").icon(BitmapDescriptorFactory.fromResource(R.drawable.jogja)).snippet("Populasi : Jumlah penduduk:388.627 (2010)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yogyakarta));

    }

}
