package org.lovebing.reactnative.baidumap.model;

/**
 * @author xuelong
 * @date 2021-03-25
 */
//TODO xuelong add
public class DrillingInfo {

    private String progress = "01";
    private String drillingCode;
    private String drillingType = "01";

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getDrillingCode() {
        return drillingCode;
    }

    public void setDrillingCode(String drillingCode) {
        this.drillingCode = drillingCode;
    }

    public String getDrillingType() {
        return drillingType;
    }

    public void setDrillingType(String drillingType) {
        this.drillingType = drillingType;
    }
}
