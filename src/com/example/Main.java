package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LatLng> latlngs = new ArrayList<>();
         LatLng latLng0 = new LatLng(13.0837, 77.47426);
         latlngs.add(latLng0);
         LatLng latLng1 = new LatLng(13.06624, 77.45283);
         latlngs.add(latLng1);
         LatLng latLng2 = new LatLng(13.02878, 77.45035);
         latlngs.add(latLng2);
         LatLng latLng3 = new LatLng(13.0227, 77.47384);
         latlngs.add(latLng3);
         LatLng latLng4 = new LatLng(13.02012, 77.47367);
         latlngs.add(latLng4);
         LatLng latLng5 = new LatLng(12.90251, 77.46624);
         latlngs.add(latLng5);
         LatLng latLng6 = new LatLng(12.87285, 77.4897);
         latlngs.add(latLng6);
         LatLng latLng7 = new LatLng(12.85585, 77.52585);
         latlngs.add(latLng7);
         LatLng latLng8 = new LatLng(12.85302, 77.53644);
         latlngs.add(latLng8);
         LatLng latLng9 = new LatLng(12.84458, 77.56747);
         latlngs.add(latLng9);
         LatLng latLng10 = new LatLng(12.83739, 77.58723);
         latlngs.add(latLng10);

         System.out.println(RaycastHelper.isLatLngInside(latlngs, new LatLng(    12.915743, 77.598900)));
    }
}
