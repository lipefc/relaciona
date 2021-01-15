package br.com.iblue.relaciona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.iblue.relaciona.entity.Cliente;
import br.com.iblue.relaciona.repository.ClienteRepository;

@RestController
@ResponseBody
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteRepository cdao;
	
	@GetMapping("/clientes")
	public List<Cliente> findAll(){
		return null;
		
	}
	@PostMapping("/cliente")
	public ResponseEntity<?> create(@RequestBody Cliente cliente) {
		try {
			Cliente resp = cdao.save(cliente);
			return ResponseEntity.status(200).body(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(ex.getMessage());
		}
	}
}