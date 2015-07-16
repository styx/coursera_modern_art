package by.styx.modernart;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MoreDialogFragment extends DialogFragment {
    public MoreDialogFragment() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setMessage(R.string.dialog_description)
                .setPositiveButton(R.string.action_visit_moma, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent("android.intent.action.VIEW",
                                Uri.parse(getString(R.string.url_moma)));
                        startActivity(intent);
                    }
                })
                .setNegativeButton(R.string.action_not_now, null)
                .create();
    }
}
