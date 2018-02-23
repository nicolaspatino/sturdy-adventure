/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * CE1: cliente ya registrado
 * CE2: cliente nulo
 * CE3: cliente  valido para registrar
 *
 * 
 */

public  class ClientesTest {

    public ClientesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
  
    @Test
    public void additems1() throws ExcepcionServiciosAlquiler{
    	
    }
        /**
     * @obj registrar un cliente en el sistema
     * @param p el nuevo cliente
     * @pre p!=null
     * @pos el cliente queda disponible para futuros alquileres
     * @throws ExcepcionServiciosAlquiler si el cliente ya se encuentra registrado
     */
    ///public abstract void registrarCliente(Cliente p) throws ExcepcionServiciosAlquiler;
    
    @Test
    public void registrarClienteTest(){       
        String nombre = "carlos";
        long documento =2112712;
        String telefono ="1234567";
        String direccion = "calle falsa 123";
        String email ="carlos@invento.com";
        Cliente cliente= new Cliente(nombre,documento,telefono,direccion,email);
        Cliente p = null;
        assertEquals(cliente.getDocumento(),documento);
    }
    
    
    
    
    
    
    
}
