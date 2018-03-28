/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


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
        Mensagem alan = new Clientes();
        mensagens.add(alan);
        Mensagem bruno = new Produtos();
        mensagens.add(bruno);
        Mensagem jean = new Venda();
        mensagens.add(jean);
        Mensagem marcos = new Infra();
        mensagens.add(marcos);
        Mensagem nazario = new Caixa();
        mensagens.add(nazario);
        Mensagem raissa = new Usuario();
        mensagens.add(raissa);
        Mensagem suzan = new Estoque();
        mensagens.add(suzan);
        Mensagem marcio = new WebService();
        mensagens.add(marcio);
        
        
    }
    
    public void exibirMensagens(){
        
        
        for(Mensagem m: mensagens){
            System.out.println();
            m.exibirMensagem();
        }
    }
}
