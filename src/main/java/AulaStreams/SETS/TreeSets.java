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
        
        // retorna o primeiro elemento do topo da arvore(último a ser adicionado)
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
        
        // retorna o último elemento removendo ele do set
        System.out.println(treeCapitais.pollLast());
        
        // retorna os elementos
        System.out.println(treeCapitais);
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
