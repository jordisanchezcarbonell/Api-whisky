package com.example.Api.whisky;

import javax.persistence.*;

@Entity
@Table(name = "whisky")
public class whisky {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String  Whisky;
    private float  Metacritic;
    private int STDEV ;

    private int  hastac;
    private String  Cost;
    @Column(name="class")
    private String classWhisky  ;

    private String  superCluster;
    private String  Cluster;
    private String  Country;

    private String  Type;

    public whisky() {
    }



    public whisky(String whisky, float metacritic, int STDEV, int hastac, String cost, String classWhisky, String superCluster, String cluster, String country, String type) {
        Whisky = whisky;
        Metacritic = metacritic;
        this.STDEV = STDEV;
        this.hastac = hastac;
        Cost = cost;
        this.classWhisky = classWhisky;
        this.superCluster = superCluster;
        Cluster = cluster;
        Country = country;
        Type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhisky() {
        return Whisky;
    }

    public void setWhisky(String whisky) {
        Whisky = whisky;
    }

    public float getMetacritic() {
        return Metacritic;
    }

    public void setMetacritic(float metacritic) {
        Metacritic = metacritic;
    }

    public int getSTDEV() {
        return STDEV;
    }

    public void setSTDEV(int STDEV) {
        this.STDEV = STDEV;
    }

    public int getHastac() {
        return hastac;
    }

    public void setHastac(int hastac) {
        this.hastac = hastac;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public String getClassWhisky() {
        return classWhisky;
    }

    public void setClassWhisky(String classWhisky) {
        this.classWhisky = classWhisky;
    }

    public String getSuperCluster() {
        return superCluster;
    }

    public void setSuperCluster(String superCluster) {
        this.superCluster = superCluster;
    }

    public String getCluster() {
        return Cluster;
    }

    public void setCluster(String cluster) {
        Cluster = cluster;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "whisky{" +
                "id=" + id +
                ", Whisky='" + Whisky + '\'' +
                ", Metacritic=" + Metacritic +
                ", STDEV=" + STDEV +
                ", hastac=" + hastac +
                ", Cost='" + Cost + '\'' +
                ", classWhisky='" + classWhisky + '\'' +
                ", superCluster='" + superCluster + '\'' +
                ", Cluster='" + Cluster + '\'' +
                ", Country='" + Country + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
