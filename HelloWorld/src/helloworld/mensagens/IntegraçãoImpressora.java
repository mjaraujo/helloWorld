/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld.mensagens;

import helloworld.Mensagem;

/**
 *
 * @author a1808281
 */
public class IntegraçãoImpressora extends Mensagem {
    @Override
    protected void exibirMensagem() {
        System.out.println("Integração com a Impressora S550; Por Jonathan Galdino");
    }
}
