package com.ptp.phamtanphat.intentdata0208;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by KhoaPhamPC on 8/9/2017.
 */

public class HocSinh implements Parcelable{
    private String Ten;
    private int NamSinh;

    //Alt + insert

    public HocSinh(String ten, int namSinh) {
        Ten = ten;
        NamSinh = namSinh;
    }

    protected HocSinh(Parcel in) {
        Ten = in.readString();
        NamSinh = in.readInt();
    }

    public static final Creator<HocSinh> CREATOR = new Creator<HocSinh>() {
        @Override
        public HocSinh createFromParcel(Parcel in) {
            return new HocSinh(in);
        }

        @Override
        public HocSinh[] newArray(int size) {
            return new HocSinh[size];
        }
    };

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Ten);
        parcel.writeInt(NamSinh);
    }
}
