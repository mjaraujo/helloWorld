/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import helloworld.mensagens.CadastroFuncionario;
import helloworld.mensagens.Clientes;
import helloworld.mensagens.Produtos;
import helloworld.mensagens.Venda;
import helloworld.mensagens.WebService;
import helloworld.mensagens.Infra;
import helloworld.mensagens.Caixa;
import helloworld.mensagens.Usuario;
import helloworld.mensagens.Estoque;
import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class Exibicao {
    ArrayList<Mensagem> mensagens = new ArrayList<>();

    public void iniciarMensagens(){
        Mensagem cliente = new Clientes();
        mensagens.add(cliente);
        Mensagem produto = new Produtos();
        mensagens.add(produto);
        Mensagem jean = new Venda();
        mensagens.add(jean);
        Mensagem infra = new Infra();
        mensagens.add(infra);
        Mensagem caixa = new Caixa();
        mensagens.add(caixa);
        Mensagem usuario = new Usuario();
        mensagens.add(usuario);
        Mensagem estoque = new Estoque();
        mensagens.add(estoque);
        Mensagem webService = new WebService();
        mensagens.add(webService);
        Mensagem cadastroFuncionario = new CadastroFuncionario();
        mensagens.add(cadastroFuncionario);
        
        
    }
    
    public void exibirMensagens(){
        
        
        for(Mensagem m: mensagens){
            System.out.println();
            m.exibirMensagem();
        }
    }
}
