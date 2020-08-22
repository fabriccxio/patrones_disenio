package com.caidosdelcatre;

import com.caidosdelcatre.dto.PagoDTO;

import java.math.BigDecimal;
import java.util.List;

public interface Amortizacion {

    List<PagoDTO> getDetallePagos(int monto, int cantidadPago, int intereses);

    BigDecimal calcularPago(int monto, int cantidadPago, int intereses);
}
