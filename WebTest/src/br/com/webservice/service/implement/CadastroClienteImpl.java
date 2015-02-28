package br.com.webservice.service.implement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.webservice.modelo.Cliente;
import br.com.webservice.service.CadastroClienteService;

@WebService(serviceName = "CadastroClienteImpl/cadastroClienteImpl")
public class CadastroClienteImpl implements CadastroClienteService {

	@Override
	@WebMethod
	public String CadastrarCliente(
			@WebParam(name = "nome") String nome,
			@WebParam(name = "cpf") String cpf,
			@WebParam(name = "telefone") String telefone,
			@WebParam(name = "profissao") String profissao) {
		String retorno = "ERROR";

		try {
			Cliente cliente = new Cliente();
			cliente.getNome();
			cliente.getCpf();
			cliente.getTelefone();
			cliente.getProfissao();
			retorno = "SUCESSO";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}

}
