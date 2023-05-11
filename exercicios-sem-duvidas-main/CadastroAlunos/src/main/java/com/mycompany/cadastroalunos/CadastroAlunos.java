/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroalunos;

import java.util.Scanner;

/**
 *
 * @author Erick
 */

public class CadastroAlunos {

    public static void main(String[] args) {
        

        Scanner Ler = new Scanner(System.in);
        int codigoDoCurso = 0;
        int numeroDaTurma = 0;
        int totalDeVagas = 0;
        String sala = "";
        String horario = "";
        
        
        
        String nome = "";
        int idade = 0;
        String email = "";
        String telefone = "";
        String cpf = "";
        
        
        
        Aluno novoAluno1 = new Aluno(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do aluno 1: ");
        nome = Ler.next();
        System.out.println("Informe A idade do aluno 1: ");
        idade = Ler.nextInt();
        System.out.println("Informe O e-mail do aluno 1: ");
        email = Ler.next();
        System.out.println("Informe O telefone do aluno 1: ");
        telefone = Ler.next(); 
        System.out.println("Informe O CPF do aluno 1: ");
        cpf = Ler.next();
        
        
        novoAluno1.setNome(nome);
        novoAluno1.setIdade(idade);
        novoAluno1.setEmail(email);
        novoAluno1.setTelefone(cpf);
        novoAluno1.setCpf(cpf);
        

        Turma turma1 = new Turma(novoAluno1);
        System.out.println("Informe o codigo do Curso: ");
        codigoDoCurso = Ler.nextInt();
        turma1.setCodCurso(codigoDoCurso);
        
        
        System.out.println("Informe o numero da turma: ");
        numeroDaTurma = Ler.nextInt();
        turma1.setNumeroDaTurma(numeroDaTurma);
        
        
        System.out.println("Informe o total de vagas: ");
        totalDeVagas = Ler.nextInt();
        turma1.settotalDeVagas(totalDeVagas);
        
        
        System.out.println("Informe a sala: ");
        sala = Ler.next();
        turma1.setSala(sala);
        
        
        System.out.println("Informe o horario: ");
        horario = Ler.next();
        turma1.setHorario(sala);
        
        
        
        if(novoAluno1.getNome() != ""){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
        
        // -_-_-_-_-_-_-_-_- //
        
        
        Aluno novoAluno2 = new Aluno(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do aluno 2: ");
        nome = Ler.next();
        System.out.println("Informe A idade do aluno 2: ");
        idade = Ler.nextInt();
        System.out.println("Informe O e-mail do aluno 2: ");
        email = Ler.next();
        System.out.println("Informe O telefone do aluno 2: ");
        telefone = Ler.next();
        System.out.println("Informe O CPF do aluno 2: ");
        cpf = Ler.next();
        
        
        novoAluno2.setNome(nome);
        novoAluno2.setIdade(idade);
        novoAluno2.setEmail(email);
        novoAluno2.setTelefone(cpf);
        novoAluno2.setCpf(cpf);
        

        Turma turma2 = new Turma(novoAluno2);
        System.out.println("Informe o codigo do Curso: ");
        codigoDoCurso = Ler.nextInt();
        turma2.setCodCurso(codigoDoCurso);
        
        
        System.out.println("Informe o numero da turma: ");
        numeroDaTurma = Ler.nextInt();
        turma2.setNumeroDaTurma(numeroDaTurma);
        
        
        System.out.println("Informe o total de vagas: ");
        totalDeVagas = Ler.nextInt();
        turma2.settotalDeVagas(totalDeVagas);
        
        
        System.out.println("Informe a sala: ");
        sala = Ler.next();
        turma2.setSala(sala);
        
        
        System.out.println("Informe o horario: ");
        horario = Ler.next();
        turma2.setHorario(sala);
        
        
        
        // -_-_-_-_-_-_-_-_- //
        
        Aluno novoAluno3 = new Aluno(nome, idade, email, telefone, cpf);
        System.out.println("Informe o nome do aluno 3: ");
        nome = Ler.next();
        System.out.println("Informe a idade do aluno 3: ");
        idade = Ler.nextInt();
        System.out.println("Informe O e-mail do aluno 3: ");
        email = Ler.next();
        System.out.println("Informe O telefone do aluno 3: ");
        telefone = Ler.next();
        System.out.println("Informe O CPF do aluno 3: ");
        cpf = Ler.next();
        
        novoAluno2.setNome(nome);
        novoAluno2.setIdade(idade);
        novoAluno2.setEmail(email);
        novoAluno2.setTelefone(cpf);
        novoAluno2.setCpf(cpf);

        Turma turma3 = new Turma(novoAluno3);
        System.out.println("Informe o codigo do Curso: ");
        codigoDoCurso = Ler.nextInt();
        turma2.setCodCurso(codigoDoCurso);
        
        System.out.println("Informe o numero da turma: ");
        numeroDaTurma = Ler.nextInt();
        turma3.setNumeroDaTurma(numeroDaTurma);
        
        System.out.println("Informe o total de vagas: ");
        totalDeVagas = Ler.nextInt();
        turma3.settotalDeVagas(totalDeVagas);
        
        System.out.println("Informe a sala: ");
        sala = Ler.next();
        turma3.setSala(sala);
        
        System.out.println("Informe o horario: ");
        horario = Ler.next();
        turma3.setHorario(sala);
    }
}
