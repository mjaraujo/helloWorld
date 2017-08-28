/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class HelloWorld {
    ArrayList<Mensagem> mensagens = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exibicao exibicao = new Exibicao();
        exibicao.iniciarMensagens();
    }        
    
}
