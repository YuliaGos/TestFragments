package com.example.yuliagoshev.testfragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalacesFragment extends Fragment {
    View view;

    public PalacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.sights_list,container,false);


        final ArrayList<Palaces> names= new ArrayList<Palaces>();
        names.add(new Palaces("Winter Palace",R.drawable.winter_palace));
        names.add(new Palaces("Ekaterininskii Palace",R.drawable.ekaterininskiy_palace));

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) view.findViewById(R.id.list);

        SightsAdapter adapter = new SightsAdapter(getActivity(), names, R.color.category_numbers);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Palaces palaces=names.get(position);

            }
        });

        return view;

    }
}
