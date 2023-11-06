package de.exxcellent.challenge.dataclasses;

import com.opencsv.bean.CsvBindByName;

/**
 * Data class for the weather.csv file. The two bounds defined in the interface are MnT and MxT.
 */
public class WeatherData implements RangeClass {
    @CsvBindByName(column = "Day")
    private int day;
    @CsvBindByName(column = "MxT")
    private int mxT;
    @CsvBindByName(column = "MnT")
    private int mnT;
    @CsvBindByName(column = "AvT")
    private int avT;
    @CsvBindByName(column = "AvDP")
    private float avDP;
    @CsvBindByName(column = "1HrP TPcpn")
    private int oneHrPTPcpn;
    @CsvBindByName(column = "PDir")
    private int pDir;
    @CsvBindByName(column = "AvSp")
    private float avSp;
    @CsvBindByName(column = "Dir")
    private int dir;
    @CsvBindByName(column = "MxS")
    private int mxS;
    @CsvBindByName(column = "SkyC")
    private float skyC;
    @CsvBindByName(column = "MxR")
    private int mxR;
    @CsvBindByName(column = "Mn")
    private int mn;
    @CsvBindByName(column = "R AvSLP")
    private float rAvSLP;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMxT() {
        return mxT;
    }

    public void setMxT(int mxT) {
        this.mxT = mxT;
    }

    public int getMnT() {
        return mnT;
    }

    public void setMnT(int mnT) {
        this.mnT = mnT;
    }

    public int getAvT() {
        return avT;
    }

    public void setAvT(int avT) {
        this.avT = avT;
    }

    public float getAvDP() {
        return avDP;
    }

    public void setAvDP(int avDP) {
        this.avDP = avDP;
    }

    public int getOneHrPTPcpn() {
        return oneHrPTPcpn;
    }

    public void setOneHrPTPcpn(int oneHrPTPcpn) {
        this.oneHrPTPcpn = oneHrPTPcpn;
    }

    public int getpDir() {
        return pDir;
    }

    public void setpDir(int pDir) {
        this.pDir = pDir;
    }

    public float getAvSp() {
        return avSp;
    }

    public void setAvSp(int avSp) {
        this.avSp = avSp;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public int getMxS() {
        return mxS;
    }

    public void setMxS(int mxS) {
        this.mxS = mxS;
    }

    public float getSkyC() {
        return skyC;
    }

    public void setSkyC(int skyC) {
        this.skyC = skyC;
    }

    public int getMxR() {
        return mxR;
    }

    public void setMxR(int mxR) {
        this.mxR = mxR;
    }

    public int getMn() {
        return mn;
    }

    public void setMn(int mn) {
        this.mn = mn;
    }

    public float getrAvSLP() {
        return rAvSLP;
    }

    public void setrAvSLP(int rAvSLP) {
        this.rAvSLP = rAvSLP;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "Day=" + day +
                ", MxT=" + mxT +
                ", MnT=" + mnT +
                ", AvT=" + avT +
                ", AvDP=" + avDP +
                ", 1HrP TPcpn=" + oneHrPTPcpn +
                ", PDir=" + pDir +
                ", AvSp=" + avSp +
                ", Dir=" + dir +
                ", MxS=" + mxS +
                ", SkyC=" + skyC +
                ", MxR=" + mxR +
                ", Mn=" + mn +
                ", R AvSLP=" + rAvSLP +
                '}';
    }

    @Override
    public int bound1() {
        return this.mnT;
    }

    @Override
    public int bound2() {
        return this.mxT;
    }
}
