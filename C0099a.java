package android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.databinding.a */
/* compiled from: ProGuard */
public final class C0099a {

    /* renamed from: yR */
    private static C0105d f39yR = new DataBinderMapperImpl();

    /* renamed from: yS */
    private static C0111h f40yS = null;

    /* renamed from: et */
    public static C0111h m162et() {
        return f40yS;
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m158a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return m159a(layoutInflater, i, viewGroup, false, f40yS);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m159a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, C0111h hVar) {
        boolean z2 = viewGroup != null && z;
        int childCount = z2 ? viewGroup.getChildCount() : 0;
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (!z2) {
            return m160b(hVar, inflate, i);
        }
        int childCount2 = viewGroup.getChildCount();
        int i2 = childCount2 - childCount;
        if (i2 == 1) {
            return m160b(hVar, viewGroup.getChildAt(childCount2 - 1), i);
        }
        View[] viewArr = new View[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            viewArr[i3] = viewGroup.getChildAt(i3 + childCount);
        }
        return m161b(hVar, viewArr, i);
    }

    /* renamed from: b */
    static <T extends ViewDataBinding> T m161b(C0111h hVar, View[] viewArr, int i) {
        return f39yR.mo124a(hVar, viewArr, i);
    }

    /* renamed from: b */
    public static <T extends ViewDataBinding> T m160b(C0111h hVar, View view, int i) {
        return f39yR.mo123a(hVar, view, i);
    }
}
