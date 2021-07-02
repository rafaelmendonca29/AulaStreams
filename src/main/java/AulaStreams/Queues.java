/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaStreams;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
/**
 *
 * @author Rafael de Mendonça Araújo
 *
 */
public class Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*
=========================================================================================
++++++++++++++++++++++++++  AULA 2  +++++++++++++++++++++++++++++++++++++++++++++++++++++
=========================================================================================
        */
    /*
    =========================================================================================
    ++++++++++++++++++++++++++   QUEUE  +++++++++++++++++++++++++++++++++++++++++++++++++
    =========================================================================================
          Interface utilizada para implementação de Filas através do java.util.LinkedList
          Garante ordem de inserção
          Permite leitura, adição e remoção considerando FIFO
          Não permite ordenação e nem alteração do elemento
        */
    
        //instancia a Queue, por Queue ser uma classe abstrata, instanciamos LinkedList
       Queue <String> filaBanco= new LinkedList<>();
       
       //adiciona elementos a lista
       filaBanco.add("Rafael");
       filaBanco.add("Marcelo");
       filaBanco.add("Lucilene");
       filaBanco.add("William");
       filaBanco.add("Jessica");
       
       //exibe a fila
       System.out.println("filaBanco = " + filaBanco);
       
       //remove o primeiro elemento da fila e,  neste caso adiciona a uma variável
       String clienteAtendido = filaBanco.poll();
       
       //exibe o elemento que foi removido da fila
       System.out.println("clienteAtendido = " + clienteAtendido);
       
       //exibe a fila novamente, sem o elemento que acabou de ser removido
       System.out.println("filaBanco = " + filaBanco);
       
       //retorna o primeiro elemento da fila sem removê-lo e neste caso adiciona a uma variável. Caso a fila esteja vazia retorna Null
       String primeiroCliente = filaBanco.peek();
       
       //exibe o primeiro elemento da fila
        System.out.println("primeiroCliente = " + primeiroCliente);
        
       //exibe a fila novamente, sem alterações na fila
       System.out.println("filaBanco = " + filaBanco);
       
       //retorna o primeiro elemento da fila sem removê-lo e neste caso adiciona a uma variável. Caso a fila esteja vazia retorna uma excessão NoSuchElementException
       String primeiroClienteOuErro = filaBanco.element();
       
       //exibe o primeiro elemento da fila ou uma excessão
       System.out.println("primeiroCliente = " + primeiroClienteOuErro);
       
        //exibe a fila novamente, sem alterações na fila
       System.out.println("filaBanco = " + filaBanco);
       
       //limpa a fila, ou seja, deixa ela vazia
       //filaBanco.clear();
       
       primeiroClienteOuErro = filaBanco.element();
        //exibe uma excessão, pois a fila está vazia
       System.out.println("primeiroCliente = " + primeiroClienteOuErro);
       
        //exibe a fila vazia
       System.out.println("filaBanco = " + filaBanco);
       
       // as formas de interar a fila, são as mesmas das Listas
       
        for (String clients : filaBanco) {
            System.out.println("clients = " + clients);
        }
        
        Iterator <String> iteratorFilaBanco = filaBanco.iterator();
        
        while(iteratorFilaBanco.hasNext()){
            System.out.println("iteratorFilaBanco = " + iteratorFilaBanco.next());
        }
        
        System.out.println("Quantos elementos na fila? " + filaBanco.size());
        System.out.println("A fila esta vazia? " + filaBanco.isEmpty());
        System.out.println("=============================================");
        System.out.println("=============== ATIVIDADE ==================");
        System.out.println("=============================================");
         
         /*
============================================================================================
++++++++++++++++++++++++++    ATIVIDADE  +++++++++++++++++++++++++++++++++++++++++++++++++++
============================================================================================

        2 . Crie uma fila e execute as seguintes operações:
            -> Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e Joao
            -> Navegue na lista exibindo cada nome no console
            -> Retorne o primeiro item da fila sem removê-lo
            -> Retorne o primeiro item da fila removendo o mesmo
            -> Adicione um novo nome Daniel e verifique a posição que o mesmo assumiu na fila
            -> Retorne o tamanho da fila
            ->  Verifique se a lista está vazia
            -> Verifique se o nome Carlos já existe na lista
        */
    Queue <String> nomesFila = new LinkedList<>();
        nomesFila.add("Juliana");
        nomesFila.add("Pedro");
        nomesFila.add("Carlos");
        nomesFila.add("Larissa");
        nomesFila.add("Joao");
        
        for (String nomeFila : nomesFila) {
            System.out.println("nomeFila = " + nomeFila);
        }
        
        System.out.println("Primeiro nome da fila: " + nomesFila.peek());
        System.out.println("Primeiro nome da fila removido: " + nomesFila.poll());
        
        nomesFila.add("Daniel");
        System.out.println("Posicao de Daniel: " + nomesFila);
        System.out.println("Tamanho da Fila: " + nomesFila.size());
        System.out.println("A fila esta Vazia? " + nomesFila.isEmpty());
        System.out.println("Carlos esta na fila? " + nomesFila.contains("Carlos"));
}

    
}
