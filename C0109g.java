package android.databinding;

import java.util.List;

/* renamed from: android.databinding.g */
/* compiled from: ProGuard */
public class C0109g<C, T, A> implements Cloneable {
    private List<C> mCallbacks;

    /* renamed from: zu */
    private long f43zu;

    /* renamed from: zv */
    private long[] f44zv;

    /* renamed from: zw */
    private int f45zw;

    /* renamed from: android.databinding.g$a */
    /* compiled from: ProGuard */
    public static abstract class C0110a<C, T, A> {
    }

    /* renamed from: b */
    public final synchronized void mo177b(T t, int i) {
        this.f45zw++;
        int size = this.mCallbacks.size();
        int length = this.f44zv == null ? -1 : this.f44zv.length - 1;
        m171a(t, i, (Object) null, length);
        m172a(t, i, (Object) null, (length + 2) * 64, size, 0);
        this.f45zw--;
        if (this.f45zw == 0) {
            if (this.f44zv != null) {
                for (int length2 = this.f44zv.length - 1; length2 >= 0; length2--) {
                    long j = this.f44zv[length2];
                    if (j != 0) {
                        m173d((length2 + 1) * 64, j);
                        this.f44zv[length2] = 0;
                    }
                }
            }
            if (this.f43zu != 0) {
                m173d(0, this.f43zu);
                this.f43zu = 0;
            }
        }
    }

    /* renamed from: a */
    private void m172a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.mCallbacks.get(i2);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: d */
    private void m173d(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.mCallbacks.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (((1 << (r5 % 64)) & r13.f44zv[r8]) != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058 A[SYNTHETIC] */
    /* renamed from: eD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.databinding.C0109g<C, T, A> clone() {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch:{ CloneNotSupportedException -> 0x005e, all -> 0x005b }
            android.databinding.g r1 = (android.databinding.C0109g) r1     // Catch:{ CloneNotSupportedException -> 0x005e, all -> 0x005b }
            r2 = 0
            r1.f43zu = r2     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r1.f44zv = r0     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r0 = 0
            r1.f45zw = r0     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r4.<init>()     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r1.mCallbacks = r4     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            java.util.List<C> r4 = r13.mCallbacks     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            int r4 = r4.size()     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r5 = 0
        L_0x001f:
            if (r5 >= r4) goto L_0x005f
            r6 = 1
            r8 = 64
            r9 = 1
            if (r5 >= r8) goto L_0x0033
            long r6 = r6 << r5
            long r10 = r13.f43zu     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            long r6 = r6 & r10
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0031
            goto L_0x004b
        L_0x0031:
            r9 = 0
            goto L_0x004b
        L_0x0033:
            long[] r8 = r13.f44zv     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            if (r8 == 0) goto L_0x0031
            int r8 = r5 / 64
            int r8 = r8 - r9
            long[] r10 = r13.f44zv     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            int r10 = r10.length     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            if (r8 >= r10) goto L_0x0031
            long[] r10 = r13.f44zv     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r11 = r10[r8]     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            int r8 = r5 % 64
            long r6 = r6 << r8
            long r6 = r6 & r11
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0031
        L_0x004b:
            if (r9 != 0) goto L_0x0058
            java.util.List<C> r6 = r1.mCallbacks     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            java.util.List<C> r7 = r13.mCallbacks     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
            r6.add(r7)     // Catch:{ CloneNotSupportedException -> 0x005f, all -> 0x005b }
        L_0x0058:
            int r5 = r5 + 1
            goto L_0x001f
        L_0x005b:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x005e:
            r1 = r0
        L_0x005f:
            monitor-exit(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.C0109g.clone():android.databinding.g");
    }

    /* renamed from: a */
    private void m171a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m172a(t, i, a, 0, Math.min(64, this.mCallbacks.size()), this.f43zu);
            return;
        }
        long j = this.f44zv[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.mCallbacks.size(), i3 + 64);
        m171a(t, i, a, i2 - 1);
        m172a(t, i, a, i3, min, j);
    }
}
