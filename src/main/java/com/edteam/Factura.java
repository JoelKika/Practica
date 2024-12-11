package com.edteam;

public class Factura {
    String numeroDocumento;
    String serieDocumento;

    public Factura(String almacen){
        switch (almacen){
            case "Alm1":
                this.serieDocumento ="4545";
                break;
            case "Alm2":
                this.numeroDocumento = "45454";
                break;
            case "Alm3":
                break;
            default:

        }
        this.numeroDocumento = "545465";

    }

}
