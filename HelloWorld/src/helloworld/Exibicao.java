/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import helloworld.mensagens.Alan;
import helloworld.mensagens.Bruno;
import helloworld.mensagens.Jean;
import helloworld.mensagens.Marcos;
import helloworld.mensagens.Nazario;
import helloworld.mensagens.Raissa;
import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class Exibicao {
    ArrayList<Mensagem> mensagens = new ArrayList<>();

    public void iniciarMensagens(){
        Mensagem alan = new Alan();
        Mensagem bruno = new Bruno();
        Mensagem jean = new Jean();
        Mensagem marcos = new Marcos();
        Mensagem nazario = new Nazario();
        Mensagem raissa = new Raissa();
        
    }
    
    public void exibirMensagens(){
        mensagens.forEach(mensagem->{
            mensagem.exibirMensagem();
        });
    }
}
