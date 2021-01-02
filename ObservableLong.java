package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: ProGuard */
public class ObservableLong extends C0104c implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new Parcelable.Creator<ObservableLong>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableLong[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }
    };
    static final long serialVersionUID = 1;
    private long mValue;

    public int describeContents() {
        return 0;
    }

    public ObservableLong(long j) {
        this.mValue = j;
    }

    public ObservableLong() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }
}
