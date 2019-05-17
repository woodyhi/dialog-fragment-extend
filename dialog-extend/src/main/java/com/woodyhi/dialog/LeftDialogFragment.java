package com.woodyhi.dialog;

import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by June on 2018/4/24.
 */
public class LeftDialogFragment extends BaseDialogFragment {

    @Override
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.gravity = Gravity.LEFT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;
        lp.windowAnimations = R.style.LeftSideDialogAnimation;
//        lp.dimAmount = 0F;
        window.setAttributes(lp);
    }

}
