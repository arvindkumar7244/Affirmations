package com.example.android.affirmations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.android.affirmations.adapter.ItemAdapter
import com.example.android.affirmations.data.DataSource

class AffirmationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_affirmations, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val adapter = ItemAdapter()
        recyclerView.adapter = adapter
        adapter.submitList(DataSource().loadAffirmation())
        return view
    }

}