package com.ptp.phamtanphat.intentdata0208;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnchangeActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnchangeActivity = (Button) findViewById(R.id.buttonmanhinh1);
        btnchangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dang 1 : Chuyen du lieu String sang man hinh 2
//                SendDataString();
                //Dang 2 : Chuyen du lieu int sang man hinh 2
//                SendDataInt();
                //Dang 3 : Chuyen du lieu Arraylist sang man hinh 2
//                SendDataArraylist();
//                SendDataStringArray();
                //Dang 4 : Chuyen du lieu Object sang man hinh 2
//                SendDataObject();
                //Dang 5 : Chuyen du lieu Arraylist<Object> sang man hinh 2
//                SendDataArraylistObject();
                //Dang 6 : Chuyen du lieu Bundle sang man hinh 2
            }
        });
    }

    private void SendDataArraylistObject() {
        ArrayList<HocSinh> hocSinhArrayList = new ArrayList<>();
        hocSinhArrayList.add(new HocSinh("Nguyen van A",1999));
        hocSinhArrayList.add(new HocSinh("Nguyen van B",1998));
        hocSinhArrayList.add(new HocSinh("Nguyen van A",1997));
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putParcelableArrayListExtra("hocsinh", hocSinhArrayList);
        startActivity(intent);
    }

    private void SendDataObject() {
        HocSinh hocSinh = new HocSinh("Nguyen Van Teo",2000);
        Intent intent = new Intent(this,Main2Activity.class);
        //Khong cast ve kieu du lieu Serialible
        //Trong doi tuong ta se goi implement Serialible
        intent.putExtra("object", hocSinh);
        startActivity(intent);

    }

    private void SendDataStringArray() {
        String[] mangten = {"Hoa","Tuan","Trung"};
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("mangten",mangten);
        startActivity(intent);
    }

    private void SendDataArraylist() {
        ArrayList<String> mangmonhoc = new ArrayList<>();
        mangmonhoc.add("Mon Toan");
        mangmonhoc.add("Mon Ly");
        mangmonhoc.add("Mon Hoa");
        mangmonhoc.add("Mon Sinh");
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putStringArrayListExtra("monhoc",mangmonhoc);
        startActivity(intent);
    }

    private void SendDataInt() {
        int number = 3;
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("number",number);
        startActivity(intent);
    }

    public void SendDataString(){
        String ten = "Phat";
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("giatrichuoi",ten);
        startActivity(intent);
    }
}
