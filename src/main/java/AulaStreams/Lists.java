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
 * @author Rafael de Mendon�a Ara�jo
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
        nomes.add("Jo�o");
        nomes.add("Lucilene");
        nomes.add("Marcelo");
        nomes.add("William");
        nomes.add("Andrea");
        nomes.add("Frank");
        
        //exibindo a lista nomes
       System.out.println("nomes = " + nomes);
        
        // Atrav�s do set podemos atualizar a lista, passando um indice e um elemento 
        nomes.set(3, "Renata");
        
        System.out.println("nomes = " + nomes);;
        
        //ordenando a lista nomes do menor para o maior, reorganizando tamb�m os indices
        Collections.sort(nomes);
        
        //exibindo a lista nomes de maneira ordenada
        System.out.println("nomes = " + nomes);
        
        // Ao atualizarmos novamente, ir� atualizar o elemento que se encontra naquele indice
        nomes.set(3, "Marco");
        
        System.out.println("nomes = " + nomes);
        
        //remove o elemento presente no indice passado
        nomes.remove(5);
       System.out.println("nomes = " + nomes);
        
        //Remove o elemento diretamente, sem precisar o indice
        nomes.remove("Renata");
        System.out.println("nomes = " + nomes);
         
        //o m�todo get retorna o valor do elemento de acordo com o indice, come�ando do 0
        System.out.println("Qual e o elemento presente no indice 1? " + nomes.get(1));
         
        // o m�todo size, retorna o tamanho da lista, isto � quantos elementos ela possu�
        System.out.println("Qual o tamanho da Lista?"+nomes.size());
         
        // o metodo contains retorna um booleano ap�s verificar se um determinado elemento se encontra na lista
        System.out.println("Contem o nome Luis? " + nomes.contains("Luis"));
         
        //o m�todo indexOf retorna o indice de um determinado elemento
        System.out.println("Indice de Rafael: "+nomes.indexOf("Rafael"));
        
        //o m�todo indexOf retorna -1 quando o elemento n�o existe
        System.out.println("Indice de Raquel: "+nomes.indexOf("Raquel"));
        
        // o m�todo isEmpty verifica se a lista est� vazia
        System.out.println("A lista esta vazia? " + nomes.isEmpty());
        
        //percorrendo a lista
        
        // for each que recebe 2 argumentos: 
        //1� Declara��o de uma vari�vel que n�o pode existir no escopo do projeto
        //2� A lista em si 
        
        for (String nome : nomes) {
            System.out.println("nome = " + nome);
        }
        
        //modelo funcional do for each
        nomes.forEach(nome -> {
            System.out.println("nome = " + nome);
        });
        
        //O Iterator � outra forma de se percorrer uma lista
        Iterator <String> iterator = nomes.iterator();
        
        //O Iterator pode ser usado com while
        // O metodo hasNext, retorna um booleano indicando se tem um pr�ximo elemento ou n�o
        // O metodo next retorna o elemento que estamos interando naquele momento
        while (iterator.hasNext()){
            System.out.println("iterator = " + iterator.next());
        }
        //o m�todo clear limpa a lista
        nomes.clear();
        System.out.println("nomes = " + nomes);
        
        // o m�todo isEmpty verifica se a lista est� vazia
        System.out.println("A lista esta vazia? " + nomes.isEmpty());
       
        /*
        =========================================================================================
        ++++++++++++++++++++++++++    VECTOR  +++++++++++++++++++++++++++++++++++++++++++++++++++
        =========================================================================================
        */
        //implementa��o do Vector
        List <String> esportes = new Vector<>();
        
        //Adiciona 4 esportes ao vetor
        esportes.add("Handebol");
        esportes.add("Voleibol");
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        System.out.println("esportes = " + esportes);
        
        //Altera o valor na posi��o 2 para ping pong
        esportes.set(3, "Tenis de Mesa");
        System.out.println("esportes = " + esportes);
        //Remove esporte da Posi��o 2
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

        1 . Crie uma lista e execute as seguintes opera��es:
            -> Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e Joao
            -> Navegue na lista exibindo cada nome no console
            -> Substitua o nome Carlos por Roberto
            -> Remova o nome da posi��o 4
            -> Remova o nome Joao
            -> Retorne a quantidade de itens da lista
            -> Verifique se o nome Juliano j� existe na lista
            -> Crie uma nova lista com os nomes Ismael e Rodrigo e adicione todos os itens da primeira lista na primeira lista criada
            -> Ordene os itens da Lista por ordem alfab�tica
            ->  Verifique se a lista est� vazia
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
        // altera o elemento na posi�ao 2 para Roberto
        nomesAtividade.set(2,"Roberto");
        
        // remove o elemento na posi��o 4
        nomesAtividade.remove(4);
        
        //remove o elemento Joao
        nomesAtividade.remove("Joao");
        
        //retorna o tamanho da lista
        System.out.println("Tamanho da Lista = " + nomesAtividade.size());
        
        // verifica se o elemento est� presente na lista
        nomesAtividade.contains("Juliano");
        
        
        //cria uma nova lista e adiciona os elementos
        List <String> nomesExtrasAtividade = new ArrayList<>();
        nomesExtrasAtividade.add("Ismael");
        nomesExtrasAtividade.add("Rodrigo");
        
        //adiciona todos os itens da primeira lista a nova lista criada
        nomesExtrasAtividade.addAll(nomesAtividade);
        
        // ordena a lista em ordem alfab�tica
        Collections.sort(nomesExtrasAtividade);
        
        //exibe a nova lista ordenada e com os elementos da primeira que n�o foram removidos nos passos anteriores
        
        System.out.println("nomes = " + nomesExtrasAtividade);
        
        // verifica se a lista est� vazia
        System.out.println(nomesAtividade.isEmpty());
    }
    
}
