package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String stampName;
    boolean stapled;
    public Stamp(String stampName, boolean stapled){
        this.stampName=stampName;
        this.stapled=stapled;
    }

    public String getStampName() {
        return stampName;
    }

    public boolean isStapled() {
        return stapled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stapled == stamp.stapled && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stapled);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stapled=" + stapled +
                '}';
    }
}
