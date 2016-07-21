package com.vaadin.tapio.googlemaps.demo;


import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.tapio.googlemaps.client.events.InfoWindowClosedListener;
import com.vaadin.tapio.googlemaps.client.events.MarkerDragListener;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker;
import com.vaadin.ui.*;


/**
 * Google Maps UI for testing and demoing.
 */
@SuppressWarnings("serial")
public class MapaView extends VerticalLayout{

    private GoogleMap googleMap;
    private GoogleMapMarker escuelaMarker;

  
    public MapaView(final Direccion direccion, String nombre) {

        escuelaMarker = new GoogleMapMarker(nombre,
                new LatLon(direccion.getLatitud(), direccion.getLongitud()), true);
        
        
        setSizeFull();
        
        
        
        googleMap = new GoogleMap(null, null, null);
        // uncomment to enable Chinese API.
        //googleMap.setApiUrl("maps.google.cn");
        
        if (direccion!=null)
			googleMap.setCenter(new LatLon(direccion.getLatitud(), direccion.getLongitud()));
		else
			googleMap.setCenter(new LatLon(19.787380181986226, -85.05315592812498));
        googleMap.setZoom(7);
        googleMap.setSizeFull();

    
        googleMap.addMarker(escuelaMarker);
        googleMap.setMinZoom(4);
        googleMap.setMaxZoom(16);


        addComponent(googleMap);
        //mapContent.setExpandRatio(googleMap, 1.0f);


        googleMap.addMarkerDragListener(new MarkerDragListener() {
            @Override
            public void markerDragged(GoogleMapMarker draggedMarker,
                LatLon oldPosition) {
                direccion.setLatitud(draggedMarker.getPosition().getLat());
                direccion.setLongitud(draggedMarker.getPosition().getLon());
                System.out.println(">>>"+direccion);
            }
        });
    }
}