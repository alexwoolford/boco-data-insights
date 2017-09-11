package io.woolford.entities;


import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Trim;

public class AccountParcelRecord {

    @Trim
    @Parsed(field = "strap")
    private String strap;

    @Parsed(field = "Parcelno")
    private String parcelno;

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getParcelno() {
        return parcelno;
    }

    public void setParcelno(String parcelno) {
        this.parcelno = parcelno;
    }

    @Override
    public String toString() {
        return "AccountParcelRecord{" +
                "strap='" + strap + '\'' +
                ", parcelno=" + parcelno +
                '}';
    }

}
