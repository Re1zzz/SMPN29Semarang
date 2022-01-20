package com.testinger.smpn29semarang;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    LinearLayout ivMain;
    LinearLayout ivMain2;
    LinearLayout ivMain3;
    LinearLayout ivMain4;
    LinearLayout ivMain5;
    LinearLayout ivMain6;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //komponen

        //imageprofile

        ivMain =view.findViewById(R.id.profile);

        ivMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Profile.class);
                startActivity(intent);
            }
        });

        //imageguru

        ivMain2 = view.findViewById(R.id.guru);

        ivMain2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), gurustaff.class);
                startActivity(intent);
            }
        }));

        //imageekskul

        ivMain3 = view.findViewById(R.id.eksul);

        ivMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Ekskul.class);
                startActivity(intent);
            }
        });

        ivMain4 = view.findViewById(R.id.fasilitas);

        ivMain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Fasilitas.class);
                startActivity(intent);
            }
        });

        ivMain5 = view.findViewById(R.id.eperpus);

        ivMain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Eperpus.class);
                startActivity(intent);
            }
        });

        ivMain6 = view.findViewById(R.id.galeri);

        ivMain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Galeri.class);
                startActivity(intent);
            }
        });



        //slider
        SliderView sliderView = view.findViewById(R.id.imageSlider);

        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.hala);
        images.add(R.drawable.imageone);
        images.add(R.drawable.imagefour);
        images.add(R.drawable.imagefive);
        images.add(R.drawable.imagesix);


        MyAdapter myAdapter=new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);
        sliderView.setAutoCycle(true);



        return view;

    }
}

