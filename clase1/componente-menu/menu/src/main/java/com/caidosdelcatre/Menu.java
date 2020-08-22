package com.caidosdelcatre;

import com.caidosdelcatre.dto.PagoDTO;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public List<PagoDTO> mostrarMenu() {
        String[] arrClases = null;
        
        try {
            List<String> lineas = FileUtils.readLines(new File("/var/config/caidosdelcatre/menu.txt"), "utf-8");

            arrClases = new String[lineas.size()];

            System.out.println("Menu de Finanzas (Ingrese los datos que pide.)");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese Monto:");
            Integer scannerMonto =  Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese Cantidad de Pagos.");
            Integer scannerCantidadPago = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese los interes.");
            Integer scannerInteres =  Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese sistema de amortizacion.");


            int idx = 0;
            for (String linea : lineas) {
                String[] dosElementos = linea.split(":::");
                System.out.print("   ");
                System.out.println(dosElementos[0]);

                arrClases[idx] = dosElementos[1];
                idx++;
            }

            Integer sistemaAmortizacion = Integer.parseInt(scanner.nextLine());

            if (sistemaAmortizacion >= 1 && sistemaAmortizacion <= lineas.size()) {
                Amortizacion amortizacion = (Amortizacion) Class.forName(arrClases[sistemaAmortizacion-1]).newInstance();
                return amortizacion.getDetallePagos(scannerMonto,scannerCantidadPago,scannerInteres);
            }
            System.out.println("La opcion NO es valida");
        }
        catch (ClassNotFoundException ex) {
            System.out.print("No se encontro la clase: ");
            System.out.println(ex.getMessage());
        }
        catch (ClassCastException ex) {
            System.out.print("No se pudo instanciar la clase ");
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
