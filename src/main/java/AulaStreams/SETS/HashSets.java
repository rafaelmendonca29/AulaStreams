/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaStreams.SETS;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 *
 * @author user
 */
public class HashSets {
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
          Interface utilizada para implementa��o de collections perfom�ticas atrav�s do java.util.Set
          Desenvolvido para maximizar performance
          N�O Garante ordem de inser��o
          N�O permite repeti��es
          Permite adi��o e remo��o. N�o possui busca por item e atualiza��o para leitura, apenas navega��o
          N�o permite mudan�a de ordena��o 
          
          HashSet -> Usada quando n�o � necess�rio manter ordena��o, n�o � ordenado e n�o possui valores repetidos. 
          Por n�o ter repeti��o e nem ordena��o � mais perfom�tica
          
          LinkedHashSet -> Usada quando � necess�rio manter a ordem de inser��o dos elementos, 
          mant�m a ordem de inser��o dos elementos, e por isso � a implementa��o mais lenta
          
          TreeSet -> Usada quando � necess�rio alterar a ordem de uso atrav�s de comparators,
          mant�m a ordem e pode ser reordenado, � perfom�tico para leitura. 
          Para modifica��o � necess�rio reordenar, sendo mais lento que o LinkedHashSet
        */
        
        //instancia o Hashset
         Set <Double> notasAlunos = new  HashSet <>();
         
         // adiciona elementos ao set
         notasAlunos.add(5.5);
         notasAlunos.add(5.0);
         notasAlunos.add(10.0);
         notasAlunos.add(7.5);
         notasAlunos.add(8.5);
         notasAlunos.add(4.5);
         notasAlunos.add(3.5);
         notasAlunos.add(1.5);
         notasAlunos.add(6.5);
         notasAlunos.add(9.5);
         
         //exibe os elementos do set de maneira desordenada
         System.out.println("notasAlunos = " + notasAlunos);
         
         //remove um elemento
         notasAlunos.remove(1.5);
         
         // exibe novamente o set com o elemento removido
         System.out.println("notasAlunos = " + notasAlunos);
         
         // exibe o tamanho do set
         System.out.println(notasAlunos.size());
         
         // formas de percorrer o set
         
         Iterator iteratorNotas = notasAlunos.iterator();
         
         while(iteratorNotas.hasNext()){
             System.out.println("iteratorNotas = " + iteratorNotas.next());
         }
         
         for (Double notasAluno : notasAlunos) {
             System.out.println("notasAluno = " + notasAluno);
        }
         
        
         notasAlunos.clear();
           System.out.println("O set est� vazio? " + notasAlunos.isEmpty());
         /*
============================================================================================
++++++++++++++++++++++++++    ATIVIDADE  +++++++++++++++++++++++++++++++++++++++++++++++++++
============================================================================================

        3 . Crie um set e execute as seguintes opera��es:
            -> Adicione 5 n�meros: 3,88,20,44,3
            -> Navegue na lista exibindo cada numero no console
            -> Remova o primeiro item do set
            -> Adicione um novo n�mero no set 23 
            -> Retorne o tamanho do set
            ->  Verifique se o set est� vazio
           
        */
        System.out.println("=============================================");
        System.out.println("=============== ATIVIDADE ==================");
        System.out.println("=============================================");
        
        HashSet<Integer> numeros = new HashSet<>();
        
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
