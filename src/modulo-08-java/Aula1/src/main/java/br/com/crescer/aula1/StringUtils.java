/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula1;

import java.util.Scanner;

/**
 *
 * @author fernando.leandro
 */
public class StringUtils {
    
    
    public static boolean isEmpty(String s){
        return (s == null || s.trim().equals(""));
    }
    
    public static int contadorVogais(String s){
        int contador = 0;
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;
    }
    
    public static String inverterPalavra(String s){
       return new StringBuffer(s).reverse().toString(); 
    }
    
    public static boolean verificaPalindromo(String s){
        return StringUtils.inverterPalavra(s).equalsIgnoreCase(s);
    }
    
    public static void main(String args[]){
        
        System.out.println("Bem-vindo ao StringUtils\n");
        System.out.println("Digite uma palavra: ");
        
        Scanner scan = new Scanner(System.in);
        String palavraDigitada = scan.nextLine();
        
        System.out.println("Escolha um opção: \n 1-Verifica se é vazia; \n 2-Contador de vogais \n 3-Iverter a palavra \n 4-Verificar palindromo");
        
        int opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                if(isEmpty(palavraDigitada)){
                    System.out.println("String vazia");
                }else{
                    System.out.println("String com conteudo");
                } 
                break;
            case 2:
                System.out.println("Numero de vogais: " + contadorVogais(palavraDigitada));
                break;
            case 3:
                System.out.println("Palavra Invertida: " + inverterPalavra(palavraDigitada));
                break;
            case 4:
                if(verificaPalindromo(palavraDigitada)){
                    System.out.println("Palavra é um palindromo");
                }else{
                    System.out.println("Palavra não é um palindromo");
                } 
                break;
        }
        
    }
}
    

