/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld.mensagens;

import helloworld.Mensagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1808338
 */
public class CadastroFuncionario extends Mensagem{
    List<String> msg = new ArrayList();
    
    private void setList(){
        msg.add("Cadastro ");
        msg.add("de ");
        msg.add("Funcionario ");
        msg.add("Rafael ");
        msg.add("Boniolo ");
        
        
    }
    protected  void exibirMensagem(){
        setList();
        
        msg.forEach(System.out::print);
        
    };
}
