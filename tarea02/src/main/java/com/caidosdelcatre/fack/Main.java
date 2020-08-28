package com.caidosdelcatre.fack;

import com.caidosdelcatre.fack.model.Usuario;
import com.caidosdelcatre.fack.service.UsuarioService;
import com.caidosdelcatre.fack.service.impl.UsuarioServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------venta de planes.");
        try {
            UsuarioService usuarioService = new UsuarioServiceImpl();

            Usuario usuarioCreado = usuarioService.createUsuario();

            usuarioService.saveUsuario(usuarioCreado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
