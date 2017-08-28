/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import helloworld.mensagens.Alan;
import helloworld.mensagens.Bruno;
import helloworld.mensagens.Jean;
import helloworld.mensagens.Marcio;
import helloworld.mensagens.Marcos;
import helloworld.mensagens.Nazario;
import helloworld.mensagens.Raissa;
import helloworld.mensagens.Suzan;
import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class Exibicao {
    ArrayList<Mensagem> mensagens = new ArrayList<>();

    public void iniciarMensagens(){
        Mensagem alan = new Alan();
        mensagens.add(alan);
        Mensagem bruno = new Bruno();
        mensagens.add(bruno);
        Mensagem jean = new Jean();
        mensagens.add(jean);
        Mensagem marcos = new Marcos();
        mensagens.add(marcos);
        Mensagem nazario = new Nazario();
        mensagens.add(nazario);
        Mensagem raissa = new Raissa();
        mensagens.add(raissa);
        Mensagem suzan = new Suzan();
        mensagens.add(suzan);
        Mensagem marcio = new Marcio();
        mensagens.add(marcio);
        
        
    }
    
    public void exibirMensagens(){
        
        
        for(Mensagem m: mensagens){
            m.exibirMensagem();
        }
    }
}
