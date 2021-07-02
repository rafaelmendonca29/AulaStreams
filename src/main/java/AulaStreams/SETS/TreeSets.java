/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaStreams.SETS;

import java.util.TreeSet;


/**
 *
 * @author user
 */
public class TreeSets {
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
        
        //instancia a TreeSet
        TreeSet <String> treeCapitais = new TreeSet<>();
        
        //adiciona os elementos ao set
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Alagoas");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Coritiba");
        treeCapitais.add("Porto Alegre");
        
        
        // retorna os elementos ordenados
        System.out.println("treeCapitais = " + treeCapitais);
        
        // retorna o primeiro elemento do topo da arvore(�ltimo a ser adicionado)
        System.out.println(treeCapitais.first());
       
        // retorna o ultimo elemento no final da arvore(primeiro a ser adicionado)
        System.out.println(treeCapitais.last());
        
        // retorna o primeiro elemento abaixo do elemento parametrizado
        System.out.println(treeCapitais.lower("Florianopolis"));
        
        // retorna o primeiro elemento acima do elemento parametrizado
        System.out.println(treeCapitais.higher("Florianopolis"));
        
        // retorna novamente a lista de capitais
        System.out.println(treeCapitais);
        
        // retorna o primeiro elemento, removendo ele do set
        System.out.println(treeCapitais.pollFirst());
        
        // retorna o �ltimo elemento removendo ele do set
        System.out.println(treeCapitais.pollLast());
        
        // retorna os elementos
        System.out.println(treeCapitais);
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
        TreeSet<Integer> numeros = new TreeSet<>();
        
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
