package android.databinding;

import android.annotation.TargetApi;
import android.arch.lifecycle.C0060f;
import android.arch.lifecycle.C0062h;
import android.arch.lifecycle.C0070l;
import android.arch.lifecycle.C0071m;
import android.databinding.C0109g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import com.UCMobile.intl.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: ProGuard */
public abstract class ViewDataBinding extends C0108f {
    static int SDK_INT = Build.VERSION.SDK_INT;

    /* renamed from: za */
    private static final int f12za = 8;

    /* renamed from: zb */
    private static final boolean f13zb = (SDK_INT >= 16);

    /* renamed from: zc */
    private static final C0097b f14zc = new C0097b() {
    };

    /* renamed from: zd */
    private static final C0097b f15zd = new C0097b() {
    };

    /* renamed from: ze */
    private static final C0097b f16ze = new C0097b() {
    };

    /* renamed from: zf */
    private static final C0097b f17zf = new C0097b() {
    };

    /* renamed from: zg */
    private static final C0109g.C0110a<Object, ViewDataBinding, Void> f18zg = new C0109g.C0110a<Object, ViewDataBinding, Void>() {
    };

    /* renamed from: zh */
    public static final ReferenceQueue<ViewDataBinding> f19zh = new ReferenceQueue<>();

    /* renamed from: zi */
    public static final View.OnAttachStateChangeListener f20zi;
    private Choreographer mChoreographer;
    private final Choreographer.FrameCallback mFrameCallback;

    /* renamed from: zj */
    public final Runnable f21zj = new Runnable() {
        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.f22zk = false;
            }
            ViewDataBinding.m146eC();
            if (Build.VERSION.SDK_INT < 19 || ViewDataBinding.this.f25zn.isAttachedToWindow()) {
                ViewDataBinding.this.mo165ev();
                return;
            }
            ViewDataBinding.this.f25zn.removeOnAttachStateChangeListener(ViewDataBinding.f20zi);
            ViewDataBinding.this.f25zn.addOnAttachStateChangeListener(ViewDataBinding.f20zi);
        }
    };

    /* renamed from: zk */
    public boolean f22zk = false;

    /* renamed from: zl */
    public boolean f23zl = false;

    /* renamed from: zm */
    private C0098c[] f24zm;

    /* renamed from: zn */
    public final View f25zn;

    /* renamed from: zo */
    private C0109g<Object, ViewDataBinding, Void> f26zo;

    /* renamed from: zp */
    private boolean f27zp;

    /* renamed from: zq */
    private Handler f28zq;

    /* renamed from: zr */
    protected final C0111h f29zr;

    /* renamed from: zs */
    private ViewDataBinding f30zs;

    /* renamed from: zt */
    private C0060f f31zt;

    /* renamed from: android.databinding.ViewDataBinding$a */
    /* compiled from: ProGuard */
    protected static class C0096a {

        /* renamed from: yO */
        public final String[][] f35yO = new String[8][];

        /* renamed from: yP */
        public final int[][] f36yP = new int[8][];

        /* renamed from: yQ */
        public final int[][] f37yQ = new int[8][];
    }

    /* renamed from: android.databinding.ViewDataBinding$b */
    /* compiled from: ProGuard */
    private interface C0097b {
    }

    /* renamed from: android.databinding.ViewDataBinding$c */
    /* compiled from: ProGuard */
    private static class C0098c<T> extends WeakReference<ViewDataBinding> {

        /* renamed from: yX */
        T f38yX;
    }

    /* renamed from: ex */
    public abstract void mo167ex();

    /* renamed from: ey */
    public abstract void mo168ey();

    /* renamed from: ez */
    public abstract boolean mo169ez();

    static {
        if (Build.VERSION.SDK_INT < 19) {
            f20zi = null;
        } else {
            f20zi = new View.OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                }

                @TargetApi(19)
                public final void onViewAttachedToWindow(View view) {
                    ViewDataBinding.m149j(view).f21zj.run();
                    view.removeOnAttachStateChangeListener(this);
                }
            };
        }
    }

    public ViewDataBinding(C0111h hVar, View view, int i) {
        this.f29zr = hVar;
        this.f24zm = new C0098c[i];
        this.f25zn = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f13zb) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new Choreographer.FrameCallback() {
                public final void doFrame(long j) {
                    ViewDataBinding.this.f21zj.run();
                }
            };
        } else {
            this.mFrameCallback = null;
            this.f28zq = new Handler(Looper.myLooper());
        }
    }

    /* renamed from: ev */
    public final void mo165ev() {
        ViewDataBinding viewDataBinding = this;
        while (viewDataBinding.f30zs != null) {
            viewDataBinding = viewDataBinding.f30zs;
        }
        viewDataBinding.mo166ew();
    }

    /* renamed from: ew */
    public void mo166ew() {
        if (this.f27zp) {
            mo164eB();
        } else if (mo169ez()) {
            this.f27zp = true;
            this.f23zl = false;
            if (this.f26zo != null) {
                this.f26zo.mo177b(this, 1);
                if (this.f23zl) {
                    this.f26zo.mo177b(this, 2);
                }
            }
            if (!this.f23zl) {
                mo167ex();
                if (this.f26zo != null) {
                    this.f26zo.mo177b(this, 3);
                }
            }
            this.f27zp = false;
        }
    }

    /* renamed from: j */
    static ViewDataBinding m149j(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    /* renamed from: eA */
    public final View mo163eA() {
        return this.f25zn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        if (r0.f31zt == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r0.f31zt.mo106uZ().mo102yh().mo107d(android.arch.lifecycle.C0062h.C0063a.STARTED) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (f13zb == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r0.mChoreographer.postFrameCallback(r0.mFrameCallback);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0.f28zq.post(r0.f21zj);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        return;
     */
    /* renamed from: eB */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164eB() {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            android.databinding.ViewDataBinding r1 = r0.f30zs
            if (r1 == 0) goto L_0x0008
            android.databinding.ViewDataBinding r0 = r0.f30zs
            goto L_0x0001
        L_0x0008:
            monitor-enter(r0)
            boolean r1 = r0.f22zk     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x000f:
            r1 = 1
            r0.f22zk = r1     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            android.arch.lifecycle.f r1 = r0.f31zt
            if (r1 == 0) goto L_0x002a
            android.arch.lifecycle.f r1 = r0.f31zt
            android.arch.lifecycle.h r1 = r1.mo106uZ()
            android.arch.lifecycle.h$a r1 = r1.mo102yh()
            android.arch.lifecycle.h$a r2 = android.arch.lifecycle.C0062h.C0063a.STARTED
            boolean r1 = r1.mo107d(r2)
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            boolean r1 = f13zb
            if (r1 == 0) goto L_0x0036
            android.view.Choreographer r1 = r0.mChoreographer
            android.view.Choreographer$FrameCallback r0 = r0.mFrameCallback
            r1.postFrameCallback(r0)
            return
        L_0x0036:
            android.os.Handler r1 = r0.f28zq
            java.lang.Runnable r0 = r0.f21zj
            r1.post(r0)
            return
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.mo164eB():void");
    }

    /* renamed from: a */
    public static Object[] m144a(C0111h hVar, View view, int i, C0096a aVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m143a(hVar, view, objArr, aVar, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: b */
    public static <T> T m145b(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a */
    public final void mo162a(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f30zs = this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r7 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r7 == null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0197  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m143a(android.databinding.C0111h r19, android.view.View r20, java.lang.Object[] r21, android.databinding.ViewDataBinding.C0096a r22, android.util.SparseIntArray r23, boolean r24) {
        /*
            r6 = r19
            r0 = r20
            r7 = r22
            r8 = r23
            android.databinding.ViewDataBinding r1 = m149j(r20)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r20.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r10 = -1
            r12 = 1
            if (r24 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            java.lang.String r2 = "layout"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0045
            r2 = 95
            int r2 = r1.lastIndexOf(r2)
            if (r2 <= 0) goto L_0x0061
            int r2 = r2 + r12
            boolean r3 = m147h(r1, r2)
            if (r3 == 0) goto L_0x0061
            int r1 = m148i(r1, r2)
            r2 = r21[r1]
            if (r2 != 0) goto L_0x0042
            r21[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x005e
            goto L_0x005d
        L_0x0045:
            if (r1 == 0) goto L_0x0061
            java.lang.String r2 = "binding_"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0061
            int r2 = f12za
            int r1 = m148i(r1, r2)
            r2 = r21[r1]
            if (r2 != 0) goto L_0x005b
            r21[r1] = r0
        L_0x005b:
            if (r7 != 0) goto L_0x005e
        L_0x005d:
            r1 = -1
        L_0x005e:
            r13 = r1
            r1 = 1
            goto L_0x0063
        L_0x0061:
            r1 = 0
            r13 = -1
        L_0x0063:
            if (r1 != 0) goto L_0x0079
            int r1 = r20.getId()
            if (r1 <= 0) goto L_0x0079
            if (r8 == 0) goto L_0x0079
            int r1 = r8.get(r1, r10)
            if (r1 < 0) goto L_0x0079
            r2 = r21[r1]
            if (r2 != 0) goto L_0x0079
            r21[r1] = r0
        L_0x0079:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01a8
            r14 = r0
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            int r5 = r14.getChildCount()
            r0 = 0
            r1 = 0
        L_0x0086:
            if (r0 >= r5) goto L_0x01a8
            android.view.View r2 = r14.getChildAt(r0)
            if (r13 < 0) goto L_0x017f
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x017f
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x017f
            java.lang.String r4 = "layout"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x017f
            r4 = 47
            int r15 = r3.indexOf(r4)
            if (r15 <= 0) goto L_0x017f
            int r4 = r3.indexOf(r4)
            int r4 = r4 + r12
            int r15 = r3.length()
            int r9 = r15 + -2
            java.lang.CharSequence r3 = r3.subSequence(r4, r9)
            java.lang.String[][] r4 = r7.f35yO
            r4 = r4[r13]
            int r9 = r4.length
            r10 = r1
        L_0x00c9:
            if (r10 >= r9) goto L_0x00d7
            r11 = r4[r10]
            boolean r11 = android.text.TextUtils.equals(r3, r11)
            if (r11 == 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            int r10 = r10 + 1
            goto L_0x00c9
        L_0x00d7:
            r10 = -1
        L_0x00d8:
            if (r10 < 0) goto L_0x017f
            int r1 = r10 + 1
            int[][] r3 = r7.f36yP
            r3 = r3[r13]
            r3 = r3[r10]
            int[][] r4 = r7.f37yQ
            r4 = r4[r13]
            r4 = r4[r10]
            android.view.View r9 = r14.getChildAt(r0)
            java.lang.Object r9 = r9.getTag()
            java.lang.String r9 = (java.lang.String) r9
            int r10 = r9.length()
            int r10 = r10 - r12
            r11 = 0
            java.lang.String r10 = r9.substring(r11, r10)
            int r11 = r10.length()
            int r12 = r14.getChildCount()
            int r15 = r0 + 1
            r16 = r1
            r17 = r5
            r1 = r15
            r5 = r0
        L_0x010c:
            if (r1 >= r12) goto L_0x0157
            android.view.View r15 = r14.getChildAt(r1)
            java.lang.Object r7 = r15.getTag()
            boolean r7 = r7 instanceof java.lang.String
            if (r7 == 0) goto L_0x0121
            java.lang.Object r7 = r15.getTag()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0122
        L_0x0121:
            r7 = 0
        L_0x0122:
            if (r7 == 0) goto L_0x014c
            boolean r15 = r7.startsWith(r10)
            if (r15 == 0) goto L_0x014c
            int r8 = r7.length()
            r18 = r10
            int r10 = r9.length()
            if (r8 != r10) goto L_0x0144
            int r8 = r7.length()
            r10 = 1
            int r8 = r8 - r10
            char r8 = r7.charAt(r8)
            r10 = 48
            if (r8 == r10) goto L_0x0157
        L_0x0144:
            boolean r7 = m147h(r7, r11)
            if (r7 == 0) goto L_0x014e
            r5 = r1
            goto L_0x014e
        L_0x014c:
            r18 = r10
        L_0x014e:
            int r1 = r1 + 1
            r10 = r18
            r7 = r22
            r8 = r23
            goto L_0x010c
        L_0x0157:
            if (r5 != r0) goto L_0x0162
            android.databinding.ViewDataBinding r1 = android.databinding.C0099a.m160b((android.databinding.C0111h) r6, (android.view.View) r2, (int) r4)
            r21[r3] = r1
        L_0x015f:
            r7 = r0
            r0 = 1
            goto L_0x0185
        L_0x0162:
            int r5 = r5 - r0
            r1 = 1
            int r5 = r5 + r1
            android.view.View[] r1 = new android.view.View[r5]
            r7 = 0
        L_0x0168:
            if (r7 >= r5) goto L_0x0175
            int r8 = r0 + r7
            android.view.View r8 = r14.getChildAt(r8)
            r1[r7] = r8
            int r7 = r7 + 1
            goto L_0x0168
        L_0x0175:
            android.databinding.ViewDataBinding r1 = android.databinding.C0099a.m161b((android.databinding.C0111h) r6, (android.view.View[]) r1, (int) r4)
            r21[r3] = r1
            int r5 = r5 + -1
            int r0 = r0 + r5
            goto L_0x015f
        L_0x017f:
            r17 = r5
            r7 = r0
            r16 = r1
            r0 = 0
        L_0x0185:
            if (r0 != 0) goto L_0x0197
            r5 = 0
            r0 = r19
            r1 = r2
            r2 = r21
            r3 = r22
            r4 = r23
            r8 = r17
            m143a(r0, r1, r2, r3, r4, r5)
            goto L_0x0199
        L_0x0197:
            r8 = r17
        L_0x0199:
            r0 = 1
            int r1 = r7 + 1
            r0 = r1
            r5 = r8
            r1 = r16
            r7 = r22
            r8 = r23
            r10 = -1
            r12 = 1
            goto L_0x0086
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.m143a(android.databinding.h, android.view.View, java.lang.Object[], android.databinding.ViewDataBinding$a, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: h */
    private static boolean m147h(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private static int m148i(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* renamed from: eC */
    public static void m146eC() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f19zh.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C0098c) {
                ((C0098c) poll).f38yX = null;
            }
        }
    }

    /* compiled from: ProGuard */
    public class OnStartListener implements C0071m {

        /* renamed from: yW */
        final /* synthetic */ ViewDataBinding f34yW;

        @C0070l(aiX = C0062h.C0064b.ON_START)
        public void onStart() {
            this.f34yW.mo165ev();
        }
    }
}
