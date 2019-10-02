package com.manchesterdigital;

public enum Countries {
    GERMANY("Germany", "de"),
    SPAIN("Spain", "es");

    private String name;
    private String isoCode;


    Countries(String name, String isoCode) {
        this.name = name;
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }
}
