package by.styx.modernart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ImageView mImageView1;
    ImageView mImageView2;
    ImageView mImageView3;
    ImageView mImageView5;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main, container, false);

        SeekBar mSeekBar = (SeekBar) view.findViewById(R.id.seekBar);

        mImageView1 = (ImageView) view.findViewById(R.id.imageView1);
        mImageView2 = (ImageView) view.findViewById(R.id.imageView2);
        mImageView3 = (ImageView) view.findViewById(R.id.imageView3);
        mImageView5 = (ImageView) view.findViewById(R.id.imageView5);

        setColors(0);

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setColors(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        return view;
    }

    public void setColors(int value) {
        mImageView1.setBackgroundColor(Color.argb(50, 50, value, 90));
        mImageView2.setBackgroundColor(Color.argb(50, 200, 70, value));
        mImageView3.setBackgroundColor(Color.argb(50, 30, Math.abs(100 - value), 220));
        mImageView5.setBackgroundColor(Color.argb(50, value, Math.abs(255 - value), 70));
    }

}
