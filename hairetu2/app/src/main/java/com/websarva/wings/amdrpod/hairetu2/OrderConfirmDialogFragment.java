package com.websarva.wings.amdrpod.hairetu2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by Owner on 2018/11/16.
 */

public class OrderConfirmDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle saveinstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_title);
        builder.setMessage(R.string.dialog_msg);
        //ポジティブボタン
        builder.setPositiveButton(R.string.dialog_btn_ok, new DialogButtonClickListener());
        //ネガティブボタン
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        //ナチュラルボタン
        builder.setNeutralButton(R.string.dialog_btn_nu, new DialogButtonClickListener());

        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        //その後の処理
        public void onClick(DialogInterface dialog, int whitch) {
            String msg = "";
            //アクションを分岐
            switch (whitch) {
                case DialogInterface.BUTTON_POSITIVE:
                    msg = getString(R.string.dialog_ok_toast);
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    msg = getString(R.string.dialog_ng_toast);
                    break;

                case DialogInterface.BUTTON_NEUTRAL:
                    msg=getString(R.string.dialog_nu_toast);
                    break;
            }
            Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG);

        }

    }

}