package com.example.ismail.dailynotetaker;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Ismail on 7/20/2018.
 */
public class Note implements Serializable {

    private long mDateTime;
    private String mTitle;
    private String mContent;

    public Note( long mDateTime, String mTitle, String mContent) {
        this.mContent = mContent;
        this.mDateTime = mDateTime;
        this.mTitle = mTitle;
    }


    public void setmDateTime(long mDateTime) {
        this.mDateTime = mDateTime;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public long getmDateTime() {
        return mDateTime;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public String getDateTimeFormated(Context context){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss",
                context.getResources().getConfiguration().locale);
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(mDateTime));
    }

}
