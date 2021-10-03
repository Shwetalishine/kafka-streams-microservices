package com.kafka.domain.crawler;

public class Domain {
    private String domain;
    private String create_date;
    private String update_date;
    private String country;
    private boolean isDead;
    private String A;
    private String Ns;
    private String CNAME;
    private String MX;
    private String TXT;

    public Domain() {
    }

    public Domain(String domain, String create_date, String update_date, String country, boolean isDead, String a, String ns, String CNAME, String MX, String TXT) {
        this.domain = domain;
        this.create_date = create_date;
        this.update_date = update_date;
        this.country = country;
        this.isDead = isDead;
        A = a;
        Ns = ns;
        this.CNAME = CNAME;
        this.MX = MX;
        this.TXT = TXT;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getNs() {
        return Ns;
    }

    public void setNs(String ns) {
        Ns = ns;
    }

    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }

    public String getMX() {
        return MX;
    }

    public void setMX(String MX) {
        this.MX = MX;
    }

    public String getTXT() {
        return TXT;
    }

    public void setTXT(String TXT) {
        this.TXT = TXT;
    }
}
