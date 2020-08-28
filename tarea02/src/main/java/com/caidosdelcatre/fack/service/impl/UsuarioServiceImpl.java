package com.caidosdelcatre.fack.service.impl;

import com.caidosdelcatre.fack.model.Usuario;
import com.caidosdelcatre.fack.repository.DAO;
import com.caidosdelcatre.fack.repository.impl.DAOImpl;
import com.caidosdelcatre.fack.service.UsuarioService;

import java.util.Scanner;

public class UsuarioServiceImpl implements UsuarioService {
    private DAO dao;

    @Override
    public void saveUsuario(Usuario usuario) throws Exception {
        if (usuario.apellido==null || usuario.auto == null || usuario.nombre == null ){
            throw new Exception("Error. Los atributos del usuario tienen que estar completo.");
        }

        dao=new DAOImpl();
        dao.insertUsario(usuario);
    }

    @Override
    public Usuario createUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Nombre:");
        String scannerNombre=  scanner.nextLine();

        System.out.println("Ingrese Apellido.");
        String scannerApellido= scanner.nextLine();

        System.out.println("Ingrese Auto.");
        String scannerAuto=  scanner.nextLine();

        return new Usuario(scannerNombre,scannerApellido,scannerAuto);
    }
}
