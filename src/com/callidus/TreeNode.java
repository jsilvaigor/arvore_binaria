
package com.callidus;

/**
 *
 * @author linda
 * 
 * AQUI ESTÃO OS METODOS PARA INSERIR NA ARVORE
 */
public class TreeNode {
   public TreeNode esquerdaNode;
   public TreeNode direitaNode;
   public String nome;
   public double salario;
   
 
   public TreeNode(String nome,  double salario){
       this.nome = nome;
      
       this.salario = salario;
       
       esquerdaNode = direitaNode = null;
   }
   
   public void insereNode (String name, double salario){
       int result = nome.compareTo( name );
       if (result > 0){
           if (esquerdaNode == null)
               esquerdaNode = new TreeNode(name,salario);
           else
               esquerdaNode.insereNode(name, salario);
       }
       else if (result < 0) {
           if (direitaNode == null)
               direitaNode = new TreeNode(name,salario);
           else 
               direitaNode.insereNode(name, salario);
       }
   }

}
