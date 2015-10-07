package com.callidus;

import java.lang.String;

/**
 *
 * @author linda
 * 
 * AQUI ESTÃO OS MÉTODOS PARA PERCORRER A ARVORE
 */
public class ArvoreBinaria {

    
    
    private TreeNode raiz;
    
    int qtdMenosQueMil = 0;

    String operarios = "";
    double salarioOperarios = 0;

 

    public ArvoreBinaria() {
        raiz = null;
    }

    public void insereNode(String nome, double salario) {
        if (raiz == null) {
            raiz = new TreeNode(nome, salario);
        } else {
            raiz.insereNode(nome, salario);
        }
    }

    //começa percurso na pré-ordem 
    public void preOrder() {
        preOrder(raiz);
    }

    //fazer percurso na pre ordem
    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.nome + " , ");
        //percorrendo a subarvore esquerda
        preOrder(node.esquerdaNode);
        //percorrendo a subarvore direita
        preOrder(node.direitaNode);
    }

    //começa o percurso na ordem
    public void inorder() {
        inorder(raiz);
    }

    //método recursivo para fazer o percurso na ordem alfabetica
    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        //percorre a subarvore a esquerda
        inorder(node.esquerdaNode);

        System.out.print(node.nome + " , ");

        //percorre a subarvore a direita
        inorder(node.direitaNode);
    }

    //começa o percurso para verificar salario
    public void recebeMenosDeMil() {
        recebeMenosDeMil(raiz);
    }

    public void recebeMenosDeMil(TreeNode node) {
        
        if (node == null) {
            return ;
        }
        else if (node.salario < 1000){
            System.out.println(node.nome + " , ");
           qtdMenosQueMil +=1;
        }
        //percorrendo a subarvore esquerda
       recebeMenosDeMil(node.esquerdaNode);
        //percorrendo a subarvore direita
        recebeMenosDeMil(node.direitaNode);
    }
    //retorna qtd que recebe menos que 1000
       public int getQtdMenosQueMil() {
        return qtdMenosQueMil;
    }

    //imprime os diretores
    public String imprimeDiretores(){
        String diretores = "";
        diretores += raiz.esquerdaNode.nome + " e " + raiz.direitaNode.nome;
        return diretores;
    }

    //imprime os operarios
    public String imprimeOperarios(){
      return percorreListaOperarios(raiz,"nome");
    }

    public String percorreListaOperarios(TreeNode node,String dado){

            if(node == null)
                return "";
            if(node.esquerdaNode == null && node.direitaNode==null) {
                operarios += node.nome + ", ";
                salarioOperarios += node.salario;
            }
            percorreListaOperarios(node.esquerdaNode,dado);
            percorreListaOperarios(node.direitaNode,dado);
        if(dado=="nome")
            return operarios;
        else if(dado=="salario")
            return Double.toString(salarioOperarios);
        else
            return "";
    }

    //retorna a soma do salario dos diretores
    public double somaSalarioDiretores(){
        return (raiz.esquerdaNode.salario + raiz.direitaNode.salario);
    }

    //retorna salario dos operarios
    public String somaSalarioOperarios(){

        return percorreListaOperarios(raiz,"salario");
    }

    //retorna salario dado o nome
    public double retornaSalarioNome(String nome){
        return percorreArvoreNome(raiz,nome);
    }

    public double percorreArvoreNome(TreeNode node,String nome){
       double salario = 0;
        if (node == null) {
            return 0;
        }
        if(node.nome == nome){
            salario +=  node.salario;

        }else{
            percorreArvoreNome(node.esquerdaNode,nome);
            percorreArvoreNome(node.direitaNode,nome);
        }
        return salario;
    }

    //dar aumento para os operarios
    public String aumentoOperarios(double valor){
        percorreOperariosAumento(raiz,valor);
        return "Aumento efetuado";
    }
    public void percorreOperariosAumento(TreeNode node,double valor){
        if(node == null)
            return;
        if(node.esquerdaNode == null && node.direitaNode==null) {
            node.salario += valor;
            return;
        }
        percorreOperariosAumento(node.esquerdaNode, valor);
        percorreOperariosAumento(node.direitaNode, valor);
    }

}
