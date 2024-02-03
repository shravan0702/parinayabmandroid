package com.parinayabandham;

import android.app.ProgressDialog;
import android.content.Context;

public class LoadingDialog {

    static ProgressDialog progressDialog;


    public static void showLoadingDialog(Context context, String message, String s, boolean b, boolean b1) {

        if (!(progressDialog != null && progressDialog.isShowing())) {
            progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(message);

            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);

            progressDialog.show();
        }
    }

    public static void cancelLoading() {
        if (progressDialog != null && progressDialog.isShowing())
            progressDialog.cancel();

    }

}
