package com.woodyhi.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/*
 * getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
 * window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
 */
public abstract class BaseDialogFragment extends DialogFragment {
    private int layoutResId;
    private OnViewCreatedListener onViewCreatedListener;


    public void setLayoutResId(int layoutResId) {
        this.layoutResId = layoutResId;
    }

    public void setOnViewCreatedListener(OnViewCreatedListener onViewCreatedListener) {
        this.onViewCreatedListener = onViewCreatedListener;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style.DialogFragmentStyle);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(layoutResId, container, false);
        if (onViewCreatedListener != null) onViewCreatedListener.onViewCreate(view);
        return view;
    }

}
