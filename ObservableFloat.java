package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: ProGuard */
public class ObservableFloat extends C0104c implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new Parcelable.Creator<ObservableFloat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableFloat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }
    };
    static final long serialVersionUID = 1;
    private float mValue;

    public int describeContents() {
        return 0;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public ObservableFloat() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}
