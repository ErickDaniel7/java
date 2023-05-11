/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroalunos;


/**
 *
 * @author Erick
 */


public class Turma {
    
    public int codigoDoCurso;
    public int numeroDaTurma;
    public int totalDeVagas;
    public String sala;
    public String horario;
    
    Aluno alunoNovo1;
    Aluno alunoNovo2;
    Aluno alunoNovo3;

    Turma(Aluno aAluno) {
        alunoNovo1 = aAluno;
    }
   
    
    public void getAluno1(){
        System.out.println(alunoNovo1.getNome());
        
   
    }
    
    public void getAluno2(){
        System.out.println(alunoNovo2.getNome());
        
   
    }
    
    public void getAluno3(){
        System.out.println(alunoNovo3.getNome());
        
   
    }

    public int getcodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodCurso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public int getNumeroDaTurma() {
        return numeroDaTurma;
    }

    public void setNumeroDaTurma(int numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
    }

    public int getTotalVagas() {
        return totalDeVagas;
    }

    public void settotalDeVagas(int totalDeVagas) {
        this.totalDeVagas = totalDeVagas;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
    
}