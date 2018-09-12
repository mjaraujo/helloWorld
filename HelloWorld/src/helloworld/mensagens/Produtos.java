/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld.mensagens;

import helloworld.Mensagem;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class Produtos extends Mensagem {

    @Override
    protected void exibirMensagem() {
        System.out.println("O produto esta na prateleira");
    }
    
}
