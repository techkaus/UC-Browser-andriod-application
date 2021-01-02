package android.databinding;

import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ProGuard */
public class MergedDataBinderMapper extends C0105d {

    /* renamed from: yT */
    private Set<Class<? extends C0105d>> f9yT = new HashSet();

    /* renamed from: yU */
    private List<C0105d> f10yU = new CopyOnWriteArrayList();

    /* renamed from: yV */
    private List<String> f11yV = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo125a(C0105d dVar) {
        if (this.f9yT.add(dVar.getClass())) {
            this.f10yU.add(dVar);
            for (C0105d a : dVar.mo175es()) {
                mo125a(a);
            }
        }
    }

    /* renamed from: a */
    public final ViewDataBinding mo123a(C0111h hVar, View view, int i) {
        do {
            for (C0105d a : this.f10yU) {
                ViewDataBinding a2 = a.mo123a(hVar, view, i);
                if (a2 != null) {
                    return a2;
                }
            }
        } while (m139eu());
        return null;
    }

    /* renamed from: a */
    public final ViewDataBinding mo124a(C0111h hVar, View[] viewArr, int i) {
        do {
            for (C0105d a : this.f10yU) {
                ViewDataBinding a2 = a.mo124a(hVar, viewArr, i);
                if (a2 != null) {
                    return a2;
                }
            }
        } while (m139eu());
        return null;
    }

    /* renamed from: eu */
    private boolean m139eu() {
        boolean z = false;
        for (String next : this.f11yV) {
            try {
                Class<?> cls = Class.forName(next);
                if (C0105d.class.isAssignableFrom(cls)) {
                    mo125a((C0105d) cls.newInstance());
                    this.f11yV.remove(next);
                    z = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z;
    }
}
