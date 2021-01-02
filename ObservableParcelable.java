package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: ProGuard */
public class ObservableParcelable<T extends Parcelable> extends C0103b<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new Parcelable.Creator<ObservableParcelable>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableParcelable[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }
    };
    static final long serialVersionUID = 1;

    public int describeContents() {
        return 0;
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public ObservableParcelable() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.mValue, 0);
    }
}
