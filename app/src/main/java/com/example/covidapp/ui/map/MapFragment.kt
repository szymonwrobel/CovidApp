package com.example.covidapp.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covidapp.R
import com.example.covidapp.dao.ListOfMarkers
import com.example.covidapp.model.SingleMarker
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapFragment : Fragment(), OnMapReadyCallback {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        val mapFragment = childFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)

        return view
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val listOfMarkers = ListOfMarkers()
        println(listOfMarkers.markers.size.toString() + " SIZE")
        for (marker in listOfMarkers.markers) {
            googleMap.addMarker(
                MarkerOptions().position(LatLng(marker.latitude, marker.longitude))
                    .title(marker.name)
            )
        }
    }

}





























