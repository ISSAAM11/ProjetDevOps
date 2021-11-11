package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
public class TestDepartement {

	@Test
	public void test() {
		int id = 2;
		assertEquals(2, id);
	}
	
/*	//EntrepriseRepository EntrepriseRep;
 	//DepartementRepository DepartementRep;
 	
	public IEntrepriseService EntrepriseSer ;

    public TestDepartement(IEntrepriseService EntrepriseSer) {
        this.EntrepriseSer = EntrepriseSer;
    }
    
	@Test
 	public void TestAjouterDepartement() {
		
// 		Departement dep =new Departement("info");
//		int id = EntrepriseSer.ajouterDepartement(dep); // type de retour int
//		assertEquals(id, dep.getId());

	}
/* 
	@Test
	@Order(2)
	public void testGetAllDepartementsNamesByEntreprise(){
		List<String>  ListDep = EntrepriseSer.getAllDepartementsNamesByEntreprise(1);
		List<String>  ListDepTest = DepartementRep.getAllDepartementsNamesByEntreprise(1);

		assertEquals(ListDepTest, ListDep);

	}
	
	@Test
	@Order(3)
	public void testDeleteDepartementById(){
		EntrepriseSer.deleteDepartementById(11);
		assertNull(EntrepriseSer.getDepartementById(11));
	}*/
}
