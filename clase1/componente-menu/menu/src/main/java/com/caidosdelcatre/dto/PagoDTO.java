package com.caidosdelcatre.dto;

import java.math.BigDecimal;

public class PagoDTO {
    private BigDecimal importe;
    private String descripcion;

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
