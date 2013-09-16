package org.quanqi.bike.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import org.quanqi.bike.R;

/**
 * Created by jingquanqi on 9/14/13.
 */
public class StatusValueItemView extends FrameLayout{

    public StatusValueItemView(Context context) {
        this(context, null, 0);
    }

    public StatusValueItemView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public StatusValueItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }
    private void init(Context context) {
        inflate(context, R.layout.view_status_value_item, this);
    }
}
