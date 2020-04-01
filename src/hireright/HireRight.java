
package hireright;

import hireright.Convenio;
import hireright.ConvenioMetodos;
import static hireright.ConvenioMetodos.id;
import static hireright.ConvenioMetodos.nome;
import static hireright.ConvenioMetodos.nomeConvenio;
import static hireright.ConvenioMetodos.numeroCarteira;
import static hireright.ConvenioMetodos.telefone;
import hireright.SqlConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Charliston Rodrigo Cezar
 */
public class HireRight {

     SqlConnection conected = new SqlConnection();
    
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       int opcao = 0;
       String banco = "";
       System.out.println(" Informe a opção desejada ; ");
       
       System.out.println(" 1 - Cliente ");
       System.out.println(" 2 - Convenio ");
       System.out.println(" 3 - especialidades ");
       System.out.println(" 4 - Servicos ");
       System.out.println(" 5 - Profissionais ");
       System.out.println(" 6 - Pagamento ");
       System.out.println(" 7 - Usuarios ");
       System.out.println(" 8 - Recomendação ");
       System.out.println(" 0 - Sair do programa ");
    
       System.out.println("  ");
       opcao = ler.nextInt();
       System.out.println(" ");
       
       ConvenioMetodos obj = new ConvenioMetodos();
       SqlConnection con = new SqlConnection();
       if(opcao == 2){
           
           obj.Cadastrar();
           obj.Consultar();
       }
       con.SqlConnection();
   
   }
}
