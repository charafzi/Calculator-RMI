package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import service.ImplServiceDistant;


public class ServerRMI {
	
	public static void main(String[] args) {
		try {
			// démarrer l’annuaire
			LocateRegistry.createRegistry(1098);
			
			// Créer l’objet distant
			ImplServiceDistant od=new ImplServiceDistant();
			
			// Publier sa référence dans l’annuaire
			Naming.rebind("rmi://localhost:1098/calcul",od);
			} 
		catch (Exception e) {
			e.printStackTrace();
			}
	}

}
