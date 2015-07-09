package by.styx.modernart;


import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MoreDialogFragment extends DialogFragment implements OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        getDialog().setTitle();
//        View v = inflater.inflate(R.layout.dialog1, null);
//        v.findViewById(R.id.btnYes).setOnClickListener(this);
//        v.findViewById(R.id.btnNo).setOnClickListener(this);
//        v.findViewById(R.id.btnMaybe).setOnClickListener(this);
//        return v;

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }
}
