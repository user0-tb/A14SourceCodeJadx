package androidx.concurrent.futures;

import androidx.profileinstaller.ProfileVerifier;

/* compiled from: go/retraceme 56a29ddcb1e7781e96a7f0eae9764fd95150a8d849b28fe37c764d7d19c0db72 */
/* loaded from: classes.dex */
public final class ResolvableFuture extends AbstractResolvableFuture {
    public static ResolvableFuture create() {
        return new ResolvableFuture();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final boolean set(ProfileVerifier.CompilationStatus compilationStatus) {
        return super.set(compilationStatus);
    }
}
