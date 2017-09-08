package com.ptp.phamtanphat.intentdata0208;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        //Dang 1 : Get du lieu String
//        if (intent != null){
//            String value = intent.getStringExtra("giatrichuoi");
//            Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
//        }
        //Dang 2 : Get du lieu int
        //hasExtra kiem tra key
//        if (intent != null && intent.hasExtra("conso")){
//            int value = intent.getIntExtra("conso",-1);
//            Toast.makeText(this, value + "", Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(this, "Khong co gia tri key", Toast.LENGTH_SHORT).show();
//        }
        //Dang 3 : Get du lieu Arraylist
        //Nhan du lieu arraylist nen khong can khoi tao lai
//        if (intent !=null && intent.hasExtra("monhoc")){
//            ArrayList<String> arraylistmonhoc = intent.getStringArrayListExtra("monhoc");
//            for (int i = 0 ; i<arraylistmonhoc.size();i++){
//                Toast.makeText(this, arraylistmonhoc.get(i), Toast.LENGTH_SHORT).show();
//            }
//        }
        //Nhan du lieu String[]
//        if (intent !=null && intent.hasExtra("mangten")){
//            String[] arrayten = intent.getStringArrayExtra("mangten");
//            for (int i = 0 ; i<arrayten.length;i++){
//                Toast.makeText(this, arrayten[i], Toast.LENGTH_SHORT).show();
//            }
//        }
        //Dang 4 : Get du lieu Object
//        if (intent !=null && intent.hasExtra("object")){
//            HocSinh hocSinh = (HocSinh) intent.getSerializableExtra("object");
//            Toast.makeText(this, hocSinh.getTen(), Toast.LENGTH_SHORT).show();
//        }
        //Dang 5 : Get du lieu Arraylist<Object>
        if (intent !=null && intent.hasExtra("hocsinh")){
            ArrayList<HocSinh> hocSinhArrayList= intent.getParcelableArrayListExtra("hocsinh");
            for (int i = 0 ; i<hocSinhArrayList.size();i++){
                Log.d("BBB",hocSinhArrayList.get(i).getA().getTenA());
            }

        }
    }
}
