package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Departement;
 import tn.esprit.spring.services.IEntrepriseService;

@RestController
public class RestControlEntreprise {

	
	@Autowired
	IEntrepriseService ientrepriseservice;
	
    // http://localhost:8082/SpringMVC/servlet/ajouterDepartement
 
 	@PostMapping("/ajouterDepartement")
 	@ResponseBody
	public int ajouterDepartement(@RequestBody Departement departement) {
		return ientrepriseservice.ajouterDepartement(departement);
	}
	
 	 // http://localhost:8082/SpringMVC/servlet/getAllDepartementsNamesByEntreprise/1
    @GetMapping(value = "getAllDepartementsNamesByEntreprise/{identreprise}")
    @ResponseBody
	public List<String> getAllDepartementsNamesByEntreprise(@PathVariable("identreprise") int entrepriseId) {
		return ientrepriseservice.getAllDepartementsNamesByEntreprise(entrepriseId);
	}

    // URL : http://localhost:8082/SpringMVC/servlet/deleteDepartementById/3
    @DeleteMapping("/deleteDepartementById/{iddept}") 
	@ResponseBody 
	public void deleteDepartementById(@PathVariable("iddept") int depId) {
		ientrepriseservice.deleteDepartementById(depId);

	}
}
