package com.augmentis.ayp.dnd;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Apinya on 8/30/2016.
 */
public class BoxDrawingView extends View{
    private static final String TAG = "BoxDrawingView";

    public BoxDrawingView(Context context) {
        super(context);
    }

    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        PointF currentPoint = new PointF(event.getX(), event.getY());
        String action = "NO";
        
        switch (event.getAction()){
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                break;
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                break;
        }

        Log.i(TAG, "Action = " + action + " " + currentPoint.x + "," + currentPoint.y );
        return true;
    }
}
