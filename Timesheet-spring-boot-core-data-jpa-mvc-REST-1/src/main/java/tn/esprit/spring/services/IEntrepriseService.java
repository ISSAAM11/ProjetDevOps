package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Departement;
 
public interface IEntrepriseService {
	
	public int ajouterDepartement(Departement dep);
	List<String> getAllDepartementsNamesByEntreprise(int entrepriseId);
	public void deleteDepartementById(int depId);
	Departement getDepartementById(int departementId);
}
