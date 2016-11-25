package com.kincai.recyclerviewdemo.bean;

/**
 * #作者：Kincai
 * #时间：2015/11/24 16:18
 * #描述：TODO
 */
public class DataInfo {
    private int icon;
    private String text;

    public DataInfo() {
    }

    public DataInfo(int icon, String text) {
        this.icon = icon;
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
