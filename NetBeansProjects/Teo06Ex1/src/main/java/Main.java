
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifhnomura
 */


public class Main {
    public static void CpfTest (String CPF){
        if (CPF.contains(".") || CPF.contains(",") || CPF.contains("-") || 
            CPF.contains(" ")) {
            throw new WrongChar("Digite seu CPF apenas com numeros");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("digite seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("digite seu sobrenome: ");
        String sobrenome = input.nextLine();
        
        System.out.println("digite sua idade: ");
        String idade = input.nextLine();
        
        boolean i = true;
        while(i == true){
            try{
            System.out.println("digite seu CPF: ");
            String CPF = input.nextLine();

            CpfTest(CPF);
            
            i = false;
            
            } catch(RuntimeException e){
                System.out.println(e);
              }
        Pessoa p = new Pessoa(nome, sobrenome, idade, cpf);
        }
        
        
        
    }
}
