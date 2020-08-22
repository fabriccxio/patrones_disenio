package edu.educacionit;

import com.caidosdelcatre.Menu;
import com.caidosdelcatre.dto.PagoDTO;
import com.caidosdelcatre.finanzas.FinanzasMenu;

import java.util.Date;
import java.util.List;

public class Init {
    public static void main(String... params) {
        Menu m = new Menu();
        List<PagoDTO> pagoLista=m.mostrarMenu();

        FinanzasMenu finanzasMenu=new FinanzasMenu();
        finanzasMenu.mostrarFinanzas(pagoLista);

    }
}