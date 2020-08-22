package com.caidosdelcatre.finanzas;

import com.caidosdelcatre.dto.PagoDTO;

import java.math.BigDecimal;
import java.util.List;

public class FinanzasMenu {

    public void mostrarFinanzas(List<PagoDTO> pagoDTOList){
        System.out.println("***************************************Importe solicitado:'[xxxxxx]");
//        como hacer para que las salidas tengan distintos formatos, dependiendo del menu seleccionado?
        for (PagoDTO pagoDTO: pagoDTOList) {
            System.out.println("****************************************************");
            System.out.println("descripcion:"+pagoDTO.getDescripcion());
            System.out.println("importe:"+pagoDTO.getImporte());
        }


    }
}
