package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        for (Integer i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if (aluno != null && !(existsAlunoPorNome(nome))) {
            alunos.add(aluno);
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        for (Integer i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)) {
                alunos.get(i).setAtivo(false);
                System.out.println("caiu aqui");
                System.out.println(alunos);
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        Integer quantidade = 0;
        for (Integer i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).isAtivo().equals(true)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer qtdsemestre = 0;

        for (Integer i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getSemestre().equals(semestre)) {
                qtdsemestre++;
            }
        }
        return qtdsemestre;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer qtdCancelados = 0;
        for (Integer i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).isAtivo().equals(false)) {
                qtdCancelados++;
            }
        }

        return qtdCancelados;
    }

    public String getNome() {
        return null;
    }
}
