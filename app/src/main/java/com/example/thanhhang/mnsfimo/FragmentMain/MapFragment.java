package com.example.thanhhang.mnsfimo.FragmentMain;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thanhhang.mnsfimo.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment{
    SupportMapFragment mSupportMapFragment;
    private GoogleMap map;

    MapView mMapView;
    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_map, container, false);
        mMapView = (MapView) v.findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume();
        mMapView.getMapAsync(new OnMapReadyCallback(){
            public void onMapReady(GoogleMap googleMap) {
                /*map = googleMap;
                // Add a marker in Sydney and move the camera
                LatLng TutorialsPoint = new LatLng(21, 57);
                map.addMarker(new
                        MarkerOptions().position(TutorialsPoint).title("Tutorialspoint.com"));
                map.moveCamera(CameraUpdateFactory.newLatLng(TutorialsPoint));*/
                map = googleMap;

                // For showing a move to my location button
               /* googleMap.setMyLocationEnabled(true);*/

                // For dropping a marker at a point on the Map
                /*LatLng sydney = new LatLng(-34, 151);
                map.addMarker(new MarkerOptions().position(sydney).title("This is Sydney").snippet("Sysney is very beautiful"));

                // For zooming automatically to the location of the marker
                CameraPosition cameraPosition = new CameraPosition.Builder().target(sydney).zoom(15).build();
                map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));*/

                LatLng NoiBai = new LatLng(21.217712, 105.792383);
                map.addMarker(new MarkerOptions().position(NoiBai).title("Marker in San Bay Noi Bai"));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(NoiBai,10));

                LatLng vnu = new LatLng(21.037442, 105.781376);
                map.addMarker(new MarkerOptions().position(vnu).title("Marker in VNU"));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(vnu,10));

                LatLng SonTay = new LatLng(21.139634, 105.50423);
                map.addMarker(new MarkerOptions().position(SonTay).title("Marker in Thanh Co Son Tay"));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(SonTay,10));

                LatLng ChuaHuong = new LatLng(20.616085, 105.744802);
                map.addMarker(new MarkerOptions().position(ChuaHuong).title("Marker in Chua Huong"));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(ChuaHuong,10));

                LatLng BatTrang = new LatLng(20.976217, 105.912747);
                map.addMarker(new MarkerOptions().position(BatTrang).title("Marker in Bat Trang"));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(BatTrang,10));
            }
        });



        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
