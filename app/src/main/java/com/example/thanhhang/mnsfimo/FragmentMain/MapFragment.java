package com.example.thanhhang.mnsfimo.FragmentMain;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thanhhang.mnsfimo.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {

    private GoogleMap map;
    @SuppressWarnings("unused")
    private View myContentsView;
    @SuppressWarnings("unused")
    Marker marker;
    private  String PM;
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
                map = googleMap;

                LatLng NoiBai = new LatLng(21.217712, 105.792383);
                PM = "40";
                map.addMarker(new MarkerOptions()
                        .position(NoiBai)
                        .title("Marker in San Bay Noi Bai")
                        .icon( BitmapDescriptorFactory.fromBitmap(DrawMarker(PM, R.mipmap.green_square2)))
                        .snippet(PM));

                map.moveCamera(CameraUpdateFactory.newLatLngZoom(NoiBai,10));

                LatLng vnu = new LatLng(21.037442, 105.781376);
                PM="30";
                map.addMarker(new MarkerOptions()
                        .position(vnu)
                        .title("Marker in VNU")
                        .icon( BitmapDescriptorFactory.fromBitmap(DrawMarker(PM, R.mipmap.green_square2)))
                        .snippet(PM));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(vnu,10));

                LatLng SonTay = new LatLng(21.139634, 105.50423);
                PM="35";
                map.addMarker(new MarkerOptions()
                        .position(SonTay)
                        .title("Marker in Thanh Co Son Tay")
                        .icon( BitmapDescriptorFactory.fromBitmap(DrawMarker(PM,R.mipmap.green_square2)))
                        .snippet(PM));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(SonTay,10));

                LatLng ChuaHuong = new LatLng(20.616085, 105.744802);
                PM="20";
                Marker m = map.addMarker(new MarkerOptions()
                        .position(ChuaHuong).title("Marker in Chua Huong")
                        /*.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))*/
                        .icon( BitmapDescriptorFactory.fromBitmap(DrawMarker(PM,R.mipmap.green_square2)))
                        .snippet(PM));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(ChuaHuong,10));
                /*m.showInfoWindow();*/

                LatLng BatTrang = new LatLng(20.976217, 105.912747);
                PM = "30";
                map.addMarker(new MarkerOptions()
                        .position(BatTrang)
                        .title("Marker in Bat Trang")
                        .icon( BitmapDescriptorFactory.fromBitmap(DrawMarker(PM,R.mipmap.green_square2)))
                        .snippet(PM));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(BatTrang,10));
                map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener(){


                    @Override
                    public boolean onMarkerClick(Marker marker) {

                        AlertDialog.Builder alertadd = new AlertDialog.Builder(getContext());
                        LayoutInflater factory = LayoutInflater.from(getContext());
                        final View view = factory.inflate(R.layout.location_info, null);
                        TextView tvTitle = (TextView)view.findViewById(R.id.title);
                        tvTitle.setText(marker.getTitle());

                        ImageView imgView = ((ImageView)view.findViewById(R.id.img));
                        imgView.setImageBitmap(DrawMarker(marker.getSnippet(),R.mipmap.images));
                        @SuppressWarnings("unused")
                        Button detail = (Button)view.findViewById(R.id.detail);
                        detail.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getContext(),"detail",Toast.LENGTH_LONG).show();
                            }
                        });
                        @SuppressWarnings("unused")
                        Button follow = (Button)view.findViewById(R.id.follow);
                        follow.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getContext(),"follow",Toast.LENGTH_LONG).show();
                            }
                        });
                        alertadd.setView(view);
                        alertadd.show();

                        return false;
                    }
                });

                /*map.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
                    @Override
                    public View getInfoWindow(Marker marker) {

                        TextView tvTitle = ((TextView)myContentsView.findViewById(R.id.title));
                        tvTitle.setText(marker.getTitle());
                        *//*TextView tvSnippet = ((TextView)myContentsView.findViewById(R.id.snippet));
                        tvSnippet.setText(marker.getSnippet());*//*
                        ImageView imgView = ((ImageView)myContentsView.findViewById(R.id.img));
                        imgView.setImageBitmap(DrawMarker(marker.getSnippet()));

                        @SuppressWarnings("unused")
                        Button detail = (Button)myContentsView.findViewById(R.id.detail);
                        detail.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(myContentsView.getContext(),"hello",Toast.LENGTH_LONG).show();
                            }
                        });
        *//*detail.setOnClickListener(this);*//*
                        @SuppressWarnings("unused")
                        Button follow = (Button)myContentsView.findViewById(R.id.follow);
        *//*follow.setOnClickListener(this);*//*

                        return myContentsView;
                    }

                    @Override
                    public View getInfoContents(Marker marker) {
                        return null;
                    }

                });*/
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

    @SuppressWarnings("unused")
    public Bitmap DrawMarker(String number,int idImage){
        Bitmap bm = BitmapFactory.decodeResource(getResources(), idImage);
        /*Bitmap bm = BitmapFactory.decodeR*/

        Bitmap.Config config = bm.getConfig();
        int width = bm.getWidth();
        int height = bm.getHeight();

        Bitmap newImage = Bitmap.createBitmap(width, height, config);

        Canvas c = new Canvas(newImage);
        c.drawBitmap(bm, 0, 0, null);

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                /*paint.setTextSize(40);*/
        /*float scale = getResources().getDisplayMetrics().scaledDensity;*/
        float scale =width/35;
        paint.setTextSize((int) (20 * scale));
        Rect bounds = new Rect();
        String gText = number;
        paint.getTextBounds(gText, 0, gText.length(), bounds);
        int x = (width - bounds.width())/2;
        int y = (height + bounds.height())/2;

        c.drawText(gText, x, y, paint);
        /*Toast.makeText(getContext(),Float.toString(scale),Toast.LENGTH_LONG).show();*/
        return newImage;
    }

}
