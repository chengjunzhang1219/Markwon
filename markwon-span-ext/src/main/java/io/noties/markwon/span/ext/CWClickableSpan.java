package io.noties.markwon.span.ext;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

import androidx.annotation.NonNull;

import io.noties.markwon.span.ext.listener.CWClickableSpanListener;

public class CWClickableSpan extends ClickableSpan {
    String clickableItem;
    CWClickableSpanListener cwClickableSpanListener;
    public CWClickableSpan(String clickableItem, CWClickableSpanListener listener) {
        super();
        this.clickableItem = clickableItem;
        cwClickableSpanListener = listener;
    }
    @Override
    public void onClick(@NonNull View view) {
        cwClickableSpanListener.onClickSpan(clickableItem);
    }

    @Override
    public void updateDrawState(@NonNull TextPaint ds) {
        ds.setUnderlineText(false);
    }
}