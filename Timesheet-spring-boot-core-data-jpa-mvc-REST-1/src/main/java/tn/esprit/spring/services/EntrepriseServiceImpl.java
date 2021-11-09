package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {

	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	@Autowired
	DepartementRepository deptRepoistory;

	
	Logger logger =LoggerFactory.getLogger(EntrepriseServiceImpl.class);
	

	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		
/*				
		try {
			logger.info("In getAllDepartementsNamesByEntreprise()");			
			Optional<Departement> departement = deptRepoistory.findById(entrepriseId);
		    if(departement.isPresent()) 
		    {
		    	deptRepoistory.delete(deptRepoistory.findById(entrepriseId).get());
		    }
		    
		    Optional<Entreprise> entrepriseManagedEntity = entrepriseRepoistory.findById(entrepriseId) ;
		    if(entrepriseManagedEntity.isPresent()) {
				List<String> depNames = new ArrayList<>();
				for(Departement dep : entrepriseManagedEntity.getDepartements()){
					depNames.add(dep.getName());
					String newline =  System.getProperty("line.separator");
					logger.debug("Departement line :" + dep.getName() + newline );
				}
				logger.info("Out getAll Departement without errors");
				return depNames;
		    }
*/	
	
			try {
			logger.info("In getAllDepartementsNamesByEntreprise()");
				
			Optional<Entreprise> entreprise = entrepriseRepoistory.findById(entrepriseId);
			
			List<String> depNames = new ArrayList<>();
			if(entreprise.isPresent()) {			
			for(Departement dep :  entreprise.get().getDepartements()){
				depNames.add(dep.getName());
				String newline =  System.getProperty("line.separator");
 				}
			}
			
			
			logger.info("Out getAll Departement without errors");
			return depNames;
		
		}catch(Exception e){
			logger.error(" errors"+ e);
			return null;
		}
	}
	
	public int ajouterDepartement(Departement dep) {
		logger.info("In ajouterDepartement()");
		deptRepoistory.save(dep);
		logger.info("Out ajouterDepartement() without errors");

		
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		return dep.getId();
	}
	
	@Transactional
	public void deleteDepartementById(int depId) {
		logger.info("In ajouterDepartement()");
		Optional<Departement> departement = deptRepoistory.findById(depId);
	    
		if(departement.isPresent()) 
	    {
	    	deptRepoistory.deleteById(departement.get().getId());
	    }
			
		logger.info("Out deleteDepartement() without errors");


	}


 	public Departement  getDepartementById(int departementId) {
 		logger.info("In getDepartementById() ");
 		Departement department ;
 		department = deptRepoistory.findById(departementId).orElse(null);

		logger.info("Out getDepartementById() without errors");
		return department;

	}


}
