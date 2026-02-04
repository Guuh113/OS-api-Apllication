/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavo.OSapiApplication.controller;

import br.com.gustavo.OSapiApplication.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
public class ClienteController {

    List<Cliente> ListaClientes;

    @GetMapping("/clientes")
    public List<Cliente> listas() {

        ListaClientes = new ArrayList<Cliente>();
        ListaClientes.add(new Cliente(1, "KGe", "kge@teste.com", "11-99999-9999"));
        ListaClientes.add(new Cliente(2, "Maria", "maria@teste.com", "11-88888-8888"));
        ListaClientes.add(new Cliente(3, "Joao", "joao@teste.com", "11-77777-7777"));

        return ListaClientes;
    }
}
