package negocio;
/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * @author Álex Ferreira
 * @date 20/08/2020 
 */
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {

		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Álex Ferreira", 31, "alex.clayton123@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Thais Stephany", 34, "thaisstephanyo@gmail.com", 2, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("alex.clayton123@gmail.com"));
		
	}

}
