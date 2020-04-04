
package hireright;

import hireright.SqlConnection;
import java.util.Scanner;

/**
 *
 * @author Charliston Rodrigo Cezar
 */

public class ConvenioMetodos {
    
    public static String nome;
    public static String nomeConvenio;
    public static int telefone;
    public static int numeroCarteira;
    public static int id;
    
    Convenio convenio;
    
    public void Cadastrar() {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print(" Informe o nome do cliente : ");
        nome = ler.nextLine();
        System.out.println(" ");

        System.out.print(" Informe o nome do convenio : ");
        nomeConvenio = ler.nextLine();
        System.out.println(" ");

        System.out.print(" Informe o numero de telefone do cliente : ");
        telefone = ler.nextInt();
        System.out.println(" ");

        System.out.print(" Informe o numero da carteirinha do convenio : ");
        numeroCarteira = ler.nextInt();
        System.out.println(" ");
        
        System.out.print(" Informe o numero do id : ");
        id = ler.nextInt();
        System.out.println(" ");

        convenio = new Convenio(nome, nomeConvenio, telefone, numeroCarteira,id);
         

    }
        
     public void Consultar() {
         
        System.out.println(" Informe o numero da carteirinha do conveniado : ");
        
        System.out.println(" ");
        System.out.println(" Dados de cadastro do conveniado : ");
        System.out.println(" ");
        System.out.println(convenio);
     }   
               
}
