package com.caidosdelcatre.fack.service;

import com.caidosdelcatre.fack.model.Usuario;

public interface UsuarioService {

    void saveUsuario(Usuario usuario) throws Exception;

    /**
     * Va a solicitar por consola los datos para crear el objeto Usuario.
     * @return Usuario
     */
    Usuario createUsuario();
}
