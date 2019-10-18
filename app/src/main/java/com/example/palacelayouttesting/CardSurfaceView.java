package com.example.palacelayouttesting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.VectorDrawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class CardSurfaceView extends SurfaceView {

    private Paint p = new Paint();
    private Paint background = new Paint();
    //private VectorDrawable testCard;
    //private VectorDrawable test2;
    private Bitmap test3;
    private Bitmap test4;


    public CardSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        p.setColor(Color.WHITE);
        background.setColor(Color.GREEN);
        setWillNotDraw(false);
        //testCard = (VectorDrawable)AppCompatResources.getDrawable(context, R.drawable.ic_10_of_clubs);
        //test2 = (VectorDrawable)AppCompatResources.getDrawable(context, R.drawable.ic_10d);
        test3 = BitmapFactory.decodeResource(getResources(), R.drawable.ace_of_hearts);
        test4 = BitmapFactory.decodeResource(getResources(), R.drawable.two_of_spades);
    }

    public void onDraw(Canvas canvas) {

        canvas.drawRect((float)0, (float)0, (float)1000, (float)1000, background );
        canvas.drawCircle(100,100,50,p);
        //testCard.setBounds(200, 10, 300, 110);
        //testCard.draw(canvas);
        //test2.setBounds(300, 10, 400, 110);
        canvas.drawBitmap(test3, (float)400, (float)10, p);
        canvas.drawBitmap(test4, (float)500, (float)10, p);



    }

}
