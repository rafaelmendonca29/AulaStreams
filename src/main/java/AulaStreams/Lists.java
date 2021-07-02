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
import java.util.Vector;
/**
 *
 * @author Rafael de Mendonça Araújo
 *
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*
=========================================================================================
++++++++++++++++++++++++++  AULA 1  +++++++++++++++++++++++++++++++++++++++++++++++++++++
=========================================================================================
        */
    /*
    =========================================================================================
    ++++++++++++++++++++++++++   ARRAYLIST  +++++++++++++++++++++++++++++++++++++++++++++++++
    =========================================================================================
        */
        //Instancia uma lista de strings do tipo ArrayList
        List <String> nomes = new ArrayList<>();
        
        // adicionando elementos a lista nomes
        nomes.add("Rafael");
        nomes.add("Jessica");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Lucilene");
        nomes.add("Marcelo");
        nomes.add("William");
        nomes.add("Andrea");
        nomes.add("Frank");
        
        //exibindo a lista nomes
       System.out.println("nomes = " + nomes);
        
        // Através do set podemos atualizar a lista, passando um indice e um elemento 
        nomes.set(3, "Renata");
        
        System.out.println("nomes = " + nomes);;
        
        //ordenando a lista nomes do menor para o maior, reorganizando também os indices
        Collections.sort(nomes);
        
        //exibindo a lista nomes de maneira ordenada
        System.out.println("nomes = " + nomes);
        
        // Ao atualizarmos novamente, irá atualizar o elemento que se encontra naquele indice
        nomes.set(3, "Marco");
        
        System.out.println("nomes = " + nomes);
        
        //remove o elemento presente no indice passado
        nomes.remove(5);
       System.out.println("nomes = " + nomes);
        
        //Remove o elemento diretamente, sem precisar o indice
        nomes.remove("Renata");
        System.out.println("nomes = " + nomes);
         
        //o método get retorna o valor do elemento de acordo com o indice, começando do 0
        System.out.println("Qual e o elemento presente no indice 1? " + nomes.get(1));
         
        // o método size, retorna o tamanho da lista, isto é quantos elementos ela possuí
        System.out.println("Qual o tamanho da Lista?"+nomes.size());
         
        // o metodo contains retorna um booleano após verificar se um determinado elemento se encontra na lista
        System.out.println("Contem o nome Luis? " + nomes.contains("Luis"));
         
        //o método indexOf retorna o indice de um determinado elemento
        System.out.println("Indice de Rafael: "+nomes.indexOf("Rafael"));
        
        //o método indexOf retorna -1 quando o elemento não existe
        System.out.println("Indice de Raquel: "+nomes.indexOf("Raquel"));
        
        // o método isEmpty verifica se a lista está vazia
        System.out.println("A lista esta vazia? " + nomes.isEmpty());
        
        //percorrendo a lista
        
        // for each que recebe 2 argumentos: 
        //1º Declaração de uma variável que não pode existir no escopo do projeto
        //2º A lista em si 
        
        for (String nome : nomes) {
            System.out.println("nome = " + nome);
        }
        
        //modelo funcional do for each
        nomes.forEach(nome -> {
            System.out.println("nome = " + nome);
        });
        
        //O Iterator é outra forma de se percorrer uma lista
        Iterator <String> iterator = nomes.iterator();
        
        //O Iterator pode ser usado com while
        // O metodo hasNext, retorna um booleano indicando se tem um próximo elemento ou não
        // O metodo next retorna o elemento que estamos interando naquele momento
        while (iterator.hasNext()){
            System.out.println("iterator = " + iterator.next());
        }
        //o método clear limpa a lista
        nomes.clear();
        System.out.println("nomes = " + nomes);
        
        // o método isEmpty verifica se a lista está vazia
        System.out.println("A lista esta vazia? " + nomes.isEmpty());
       
        /*
        =========================================================================================
        ++++++++++++++++++++++++++    VECTOR  +++++++++++++++++++++++++++++++++++++++++++++++++++
        =========================================================================================
        */
        //implementação do Vector
        List <String> esportes = new Vector<>();
        
        //Adiciona 4 esportes ao vetor
        esportes.add("Handebol");
        esportes.add("Voleibol");
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        System.out.println("esportes = " + esportes);
        
        //Altera o valor na posição 2 para ping pong
        esportes.set(3, "Tenis de Mesa");
        System.out.println("esportes = " + esportes);
        //Remove esporte da Posição 2
        esportes.remove(3);
          System.out.println("esportes = " + esportes);
        //Remove o esporte Futebol do Vetor
        esportes.remove("Futebol");
        
        // Retorna o primeiro item do vetor
        System.out.println("O item na primeira posicao e = " + esportes.get(0));
        
        for (String esporte : esportes) {
            System.out.println("esporte = " + esporte);
            
        }
               
  /*
============================================================================================
++++++++++++++++++++++++++    ATIVIDADE  +++++++++++++++++++++++++++++++++++++++++++++++++++
============================================================================================

        1 . Crie uma lista e execute as seguintes operações:
            -> Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e Joao
            -> Navegue na lista exibindo cada nome no console
            -> Substitua o nome Carlos por Roberto
            -> Remova o nome da posição 4
            -> Remova o nome Joao
            -> Retorne a quantidade de itens da lista
            -> Verifique se o nome Juliano já existe na lista
            -> Crie uma nova lista com os nomes Ismael e Rodrigo e adicione todos os itens da primeira lista na primeira lista criada
            -> Ordene os itens da Lista por ordem alfabética
            ->  Verifique se a lista está vazia
        */
        // cria a lista
        List<String> nomesAtividade = new ArrayList<>();
        
        //adiciona os elementos na lista
        nomesAtividade.add("Juliana");
        nomesAtividade.add("Pedro");
        nomesAtividade.add("Carlos");
        nomesAtividade.add("Larissa");
        nomesAtividade.add("Joao");
        
        //percorre a lista para exibir todos os elementos
        nomesAtividade.forEach(nomeAtividade -> {
            System.out.println("nome = " + nomeAtividade);
              });
        // altera o elemento na posiçao 2 para Roberto
        nomesAtividade.set(2,"Roberto");
        
        // remove o elemento na posição 4
        nomesAtividade.remove(4);
        
        //remove o elemento Joao
        nomesAtividade.remove("Joao");
        
        //retorna o tamanho da lista
        System.out.println("Tamanho da Lista = " + nomesAtividade.size());
        
        // verifica se o elemento está presente na lista
        nomesAtividade.contains("Juliano");
        
        
        //cria uma nova lista e adiciona os elementos
        List <String> nomesExtrasAtividade = new ArrayList<>();
        nomesExtrasAtividade.add("Ismael");
        nomesExtrasAtividade.add("Rodrigo");
        
        //adiciona todos os itens da primeira lista a nova lista criada
        nomesExtrasAtividade.addAll(nomesAtividade);
        
        // ordena a lista em ordem alfabética
        Collections.sort(nomesExtrasAtividade);
        
        //exibe a nova lista ordenada e com os elementos da primeira que não foram removidos nos passos anteriores
        
        System.out.println("nomes = " + nomesExtrasAtividade);
        
        // verifica se a lista está vazia
        System.out.println(nomesAtividade.isEmpty());
    }
    
}
