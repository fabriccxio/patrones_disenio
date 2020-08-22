package com.caidosdelcatre.solid.finanzas;

import com.caidosdelcatre.Amortizacion;
import com.caidosdelcatre.dto.PagoDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo implements Amortizacion {
    @Override
    public List<PagoDTO> getDetallePagos(int monto, int cantidadPago, int intereses) {
        List<PagoDTO> detallePagos=new ArrayList<>();
        PagoDTO pagoDTO=null;

        for(int i = 1; i <= cantidadPago;i++)
        {
            pagoDTO=new PagoDTO();
            pagoDTO.setDescripcion("Sistema Amigo. cuota: "+i);
            pagoDTO.setImporte(calcularPago(monto,cantidadPago,0));

            detallePagos.add(pagoDTO);
        }

        pagoDTO=new PagoDTO();
        pagoDTO.setDescripcion("Sistema Amigo. cervezas: ");
        pagoDTO.setImporte(BigDecimal.valueOf(cantidadPago));

        detallePagos.add(pagoDTO);

        return detallePagos;
    }

    @Override
    public BigDecimal calcularPago(int monto, int cantidadPago, int intereses) {
        return BigDecimal.valueOf(monto).divide(BigDecimal.valueOf(cantidadPago));
    }
}
