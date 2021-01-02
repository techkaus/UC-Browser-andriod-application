package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: ProGuard */
public class ObservableShort extends C0104c implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new Parcelable.Creator<ObservableShort>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableShort[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }
    };
    static final long serialVersionUID = 1;
    private short mValue;

    public int describeContents() {
        return 0;
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public ObservableShort() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
