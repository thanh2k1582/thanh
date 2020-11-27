package com.example.tablayout;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {
    private RecyclerView rcvUser;
    private View mView;



    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_favorite, container, false);
        rcvUser = mView.findViewById(R.id.rcv_user);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rcvUser.setLayoutManager(linearLayoutManager);
        UserAdapter userAdapter= new UserAdapter();
        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);

        return mView;
    }
    private List<User> getListUser(){
        List<User> list=new ArrayList<>();
        list.add(new User(R.drawable.thucan1,"Món ăn 3 miền","Địa chỉ: k92 h06/41 Đinh Tiên Hoàng"));
        list.add(new User(R.drawable.thucan2,"Hủ tiếu nam vang","Địa chỉ: k24/45 Ngô Tất Tố Q.Thanh Khê"));
        list.add(new User(R.drawable.thucan3,"Bánh plan đậu xanh","Địa chỉ: k14 h24/4 Nguyễn Tất Thành"));
        list.add(new User(R.drawable.thucan4,"Bún giò cô 5","Địa chỉ:02 Tố Hữu Q.Hải Châu"));
        list.add(new User(R.drawable.thucan5,"Bánh mì nướng múi ớt","Địa chỉ:k224 01 Lương Nhữ Hộc"));
        list.add(new User(R.drawable.thucan6,"Sushi","Địa chỉ:k54 h04/1 Đinh La Thăng"));
        list.add(new User(R.drawable.thucan7,"Bánh mì pate","Địa chỉ:k25 03 Ông Bích Khiêm"));
        list.add(new User(R.drawable.thucan8,"Chả lụa","Địa chỉ:k224 01 Lương Nhữ Hộc"));
        list.add(new User(R.drawable.thucan4,"Bún giò cô 5","Địa chỉ: k92 h06/41 Đinh Tiên Hoàng"));
        list.add(new User(R.drawable.thucan5,"Bánh mì nướng múi ớt","Địa chỉ: k14 h24/4 Nguyễn Tất Thành"));
        list.add(new User(R.drawable.thucan1,"Món ăn 3 miền","Địa chỉ:k54 h04/1 Đinh La Thăng"));
        list.add(new User(R.drawable.thucan3,"Bánh plan đậu xanh","Địa chỉ: k92 h06/41 Đinh Tiên Hoàng"));
        list.add(new User(R.drawable.thucan3,"Bánh plan đậu xanh","Địa chỉ:k54 h04/1 Đinh La Thăng"));
        list.add(new User(R.drawable.thucan4,"Bún giò cô 5","Địa chỉ: k14 h24/4 Nguyễn Tất Thành"));
        list.add(new User(R.drawable.thucan8,"Chả lụa","Địa chỉ:k25 03 Ông Bích Khiêm"));
        list.add(new User(R.drawable.thucan1,"Món ăn 3 miền","Địa chỉ: k92 h06/41 Đinh Tiên Hoàng"));
        list.add(new User(R.drawable.thucan2,"Hủ tiếu nam vang","Địa chỉ: k92 h06/41 Đinh Tiên Hoàng"));
        list.add(new User(R.drawable.thucan7,"Bánh mì pate","Địa chỉ: k14 h24/4 Nguyễn Tất Thành"));
        list.add(new User(R.drawable.thucan6,"Shushi","Địa chỉ:k25 03 Ông Bích Khiêm\""));
        list.add(new User(R.drawable.thucan5,"Bánh mì nướng múi ớt","Địa chỉ:k14 Đinh Tiên Hoàng"));

        return list;
    }


}