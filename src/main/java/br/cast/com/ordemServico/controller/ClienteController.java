package br.cast.com.ordemServico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cast.com.ordemServico.entity.Cliente;
import br.cast.com.ordemServico.repository.ClienteRepository;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired ClienteRepository clienteRepository;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Cliente salvar(@ApiParam("Cliente a ser salvo") @RequestBody Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@PutMapping("/{codigo}")
	public Cliente editar(@PathVariable("codigo") @RequestBody Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
}
