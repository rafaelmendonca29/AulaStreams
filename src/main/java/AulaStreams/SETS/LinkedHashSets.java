/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaStreams.SETS;

import java.util.Iterator;
import java.util.LinkedHashSet;


/**
 *
 * @author user
 */
public class LinkedHashSets {
    public static void main(String[] args) {
          /*
=========================================================================================
++++++++++++++++++++++++++  AULA 3  +++++++++++++++++++++++++++++++++++++++++++++++++++++
=========================================================================================
        */
          
    /*
    =========================================================================================
    ++++++++++++++++++++++++++   SETS  +++++++++++++++++++++++++++++++++++++++++++++++++
    =========================================================================================
          Interface utilizada para implementação de collections perfomáticas através do java.util.Set
          Desenvolvido para maximizar performance
          NÃO Garante ordem de inserção
          NÃO permite repetições
          Permite adição e remoção. Não possui busca por item e atualização para leitura, apenas navegação
          Não permite mudança de ordenação 
          
          HashSet -> Usada quando não é necessário manter ordenação, não é ordenado e não possui valores repetidos. 
          Por não ter repetição e nem ordenação é mais perfomática
          
          LinkedHashSet -> Usada quando é necessário manter a ordem de inserção dos elementos, 
          mantém a ordem de inserção dos elementos, e por isso é a implementação mais lenta
          
          TreeSet -> Usada quando é necessário alterar a ordem de uso através de comparators,
          mantém a ordem e pode ser reordenado, é perfomático para leitura. 
          Para modificação é necessário reordenar, sendo mais lento que o LinkedHashSet
        */
    
        // Instancia o set
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>() ;
        
        //Adiciona os elementos no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(6);
        
        System.out.println("sequenciaNumerica = " + sequenciaNumerica);
        
        //remove o elemento do Set
        sequenciaNumerica.remove(4);
        
        //retorna o tamanho do set
        System.out.println("Tamanho do Set "+sequenciaNumerica.size());
        
        //navegando pelo set
        Iterator iteratorSequencia = sequenciaNumerica.iterator();
        
        while(iteratorSequencia.hasNext()){
            System.out.println("iteratorSequencia = " + iteratorSequencia.next());
        }
        
        for (Integer sequencia : sequenciaNumerica) {
            System.out.println("sequencia = " + sequencia);
        }
        
        System.out.println("Sequencia e vazia? " + sequenciaNumerica.isEmpty());
        
        sequenciaNumerica.clear();
        System.out.println("Sequencia e vazia? " + sequenciaNumerica.isEmpty());

         /*
============================================================================================
++++++++++++++++++++++++++    ATIVIDADE  +++++++++++++++++++++++++++++++++++++++++++++++++++
============================================================================================

        3 . Crie um set e execute as seguintes operações:
            -> Adicione 5 números: 3,88,20,44,3
            -> Navegue na lista exibindo cada numero no console
            -> Remova o primeiro item do set
            -> Adicione um novo número no set 23 
            -> Retorne o tamanho do set
            ->  Verifique se o set está vazio
           
        */
        System.out.println("=============================================");
        System.out.println("=============== ATIVIDADE ==================");
        System.out.println("=============================================");
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(30);
        
        
        numeros.forEach(numero -> {
            System.out.println("numero = " + numero);
        });
        
        numeros.remove(3);
        numeros.add(23);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
        
        numeros.forEach(numero -> {
            System.out.println("numero = " + numero);
        });

}

    
}
