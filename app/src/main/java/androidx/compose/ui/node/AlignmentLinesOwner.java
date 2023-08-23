package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import kotlin.jvm.functions.Function1;

/* compiled from: go/retraceme 56a29ddcb1e7781e96a7f0eae9764fd95150a8d849b28fe37c764d7d19c0db72 */
/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends Measurable {
    void forEachChildAlignmentLinesOwner(Function1 function1);

    AlignmentLines getAlignmentLines();

    InnerNodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}