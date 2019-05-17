package com.woodyhi.dialog;

import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by June on 2018/4/24.
 */
public class BottomDialogFragment extends BaseDialogFragment {

    @Override
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.gravity = Gravity.BOTTOM;
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.windowAnimations = R.style.BottomSideDialogAnimation;
//        lp.dimAmount = 0F;
        window.setAttributes(lp);
    }

}
