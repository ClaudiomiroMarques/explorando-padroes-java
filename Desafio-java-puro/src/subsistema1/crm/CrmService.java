package subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String name, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema CRM");
		System.out.println(name);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		
		
	}

}
