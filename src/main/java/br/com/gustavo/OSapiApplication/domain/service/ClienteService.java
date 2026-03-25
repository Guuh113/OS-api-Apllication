/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavo.OSapiApplication.domain.service;

import br.com.gustavo.OSapiApplication.domain.exception.DomainException;
import br.com.gustavo.OSapiApplication.domain.model.Cliente;
import br.com.gustavo.OSapiApplication.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesi3dia
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        Cliente clienteExistence = clienteRepository.findByEmail(cliente.getEmail());

        if (clienteExistence != null && !clienteExistence.equals(cliente)) {

            throw new DomainException("Já existe um cliente cadastrado com esse email!");
        }
        
        return  clienteRepository.save(cliente);

    }
    public void excluir(Long clienteId){
        clienteRepository.deleteById(clienteId);
    }

}
