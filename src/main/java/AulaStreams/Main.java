/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaStreams;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        System.out.println(nomes);
        
        //ordenando a lista nomes do menor para o maior
        Collections.sort(nomes);
        
        //exibindo a lista nomes de maneira ordenada
        System.out.println(nomes);
    }
    
}
