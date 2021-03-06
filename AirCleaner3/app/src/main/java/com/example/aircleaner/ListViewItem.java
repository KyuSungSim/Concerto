package com.example.aircleaner;

/**
 * Created by 희연 on 2017-05-14.
 */
import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr ;
    private Boolean swStr;

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }

    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }
    public Drawable getIcon() {
        return this.iconDrawable;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.descStr ;
    }
    public void setSwitch(boolean swStr){
        this.swStr = swStr;
    }
    public Boolean getSwitch(){
        return swStr;
    }
}
