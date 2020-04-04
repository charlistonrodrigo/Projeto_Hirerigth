/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hireright;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import hireright.Convenio;
import hireright.ConvenioMetodos;
import static hireright.ConvenioMetodos.id;
import static hireright.ConvenioMetodos.nome;
import static hireright.ConvenioMetodos.nomeConvenio;
import static hireright.ConvenioMetodos.numeroCarteira;
import static hireright.ConvenioMetodos.telefone;
import java.sql.Statement;
import java.util.Scanner;


/**
 *
 * @author Operador
 */
public class SqlConnection {
        
     
     public void SqlConnection(){
     PreparedStatement stm = null;
             Connection conn = null;
           
         try{
           
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireright_bd", "root", "");
               
                 stm = conn.prepareStatement("INSERT INTO convenio(nome,nomeConvenio, telefone, numeroCarteira,id) VALUES (?,?,?,?,?)"); 
                 System.out.println("Sucesso na coneção ");
                  
                 stm.setString(1, nome);
                 stm.setString(2, nomeConvenio);
                 stm.setInt(3, telefone);
                 stm.setInt(4,numeroCarteira);
                 stm.setInt(5,id);
                 int res = stm.executeUpdate();                  
                 
                 if(res > 0){
                  
                         System.out.println("certo, incluido com sucesso "+nome+" "+nomeConvenio+" "+telefone+" "+numeroCarteira+" "+id);
                    
                } else{
                      System.out.println("erro");
                }
                
                System.out.println("Conexao realizada com sucesso !");
         }catch(SQLException e){
            e.printStackTrace();
            
                }   
           
       }  
                                            
}


