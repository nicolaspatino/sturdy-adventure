package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.services.ServiciosAlquiler;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicolas
 */
@ManagedBean(name = "RegistrarClientes")
@SessionScoped
public class registrarClienteBean implements Serializable {
    private String nombre;
    private long id;
    private String telefono;
    private String direccion;
    private String email;
    private Cliente client;
    public registrarClienteBean(){
    }
    public void registrarCliente(){
        client = new Cliente (nombre,id,telefono,direccion,email);
    }
            
}
