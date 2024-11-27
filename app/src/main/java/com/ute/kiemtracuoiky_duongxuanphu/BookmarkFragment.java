package com.ute.kiemtracuoiky_duongxuanphu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BookmarkFragment extends Fragment {

    private RecyclerView recyclerView;
    private BookmarkAdapter adapter;
    private List<BookmarkItem> bookmarkList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bookmark, container, false);

        // Khởi tạo RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo dữ liệu mẫu
        bookmarkList = new ArrayList<>();
        bookmarkList.add(new BookmarkItem("Item 1", "Description 1", R.drawable.ic_placeholder));
        bookmarkList.add(new BookmarkItem("Item 2", "Description 2", R.drawable.ic_placeholder));

        // Khởi tạo adapter và set cho RecyclerView
        adapter = new BookmarkAdapter(bookmarkList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}