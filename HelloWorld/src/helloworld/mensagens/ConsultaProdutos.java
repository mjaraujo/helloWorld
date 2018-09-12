/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld.mensagens;

import helloworld.Mensagem;

/**
 *
 * @author a1808052
 */
public class ConsultaProdutos extends Mensagem{
    
    @Override
    protected void exibirMensagem() {
        System.out.println("Consulta de produtos - by: Lenin"); 
    }
    
}
