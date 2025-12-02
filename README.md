📚 Sistema de Cursos Online — Java (Console)

Este projeto é um mini sistema desenvolvido em Java (modo console) para gerenciar cursos, alunos, instrutores e matrículas, aplicando conceitos fundamentais de Programação Orientada a Objetos (POO), composição entre classes, tratamento de exceções e armazenamento em ArrayList.

O trabalho segue exatamente os requisitos solicitados pela atividade acadêmica.

🎯 Objetivo do Sistema

O sistema simula uma plataforma simples de cursos online, permitindo:

Cadastrar cursos

Cadastrar alunos

Listar registros

Realizar matrículas

Exibir todas as matrículas realizadas

Tudo isso por meio de um menu interativo no console.

🛠 Tecnologias Utilizadas

Java 17+

POO (Programação Orientada a Objetos)

Tratamento de exceções (try/catch)

Exceção personalizada

ArrayList para armazenamento de dados

🧩 Estrutura das Classes

O projeto possui 5 classes principais, conforme exigido:

1. Curso

Representa um curso da plataforma.
Atributos: nome, categoria.

2. Aluno

Armazena informações de um aluno.
Atributos: nome, email.

3. Instrutor

Representa um professor do curso.
Atributos: nome, especialidade.

4. Aula

Relacionada ao curso como composição.
Atributos: título, duração.

5. Matricula

Associa Aluno + Curso.
Usada para registrar as matrículas realizadas no sistema.

6. Exceção Personalizada

CursoNaoEncontradoException
Lançada quando o usuário tenta matricular um aluno em um curso inexistente.

7. Main

Contém o menu interativo e toda a operação do sistema.

📌 Funcionalidades do Menu

O usuário pode:

Cadastrar curso

Listar cursos

Cadastrar aluno

Listar alunos

Matricular aluno em curso

Listar matrículas

Sair do sistema

⚠️ Tratamento de Exceções

O sistema utiliza try/catch em dois pontos-chave:

Para erros de entrada do usuário (ex.: digitar letras onde deveria digitar números)

Para validar matrículas com a exceção personalizada CursoNaoEncontradoException

📁 Estrutura do Projeto
src/
 ├── Curso.java
 ├── Aluno.java
 ├── Instrutor.java
 ├── Aula.java
 ├── Matricula.java
 ├── CursoNaoEncontradoException.java
 └── Main.java

▶️ Como Executar

Baixe o repositório:

git clone https://github.com/seuusuario/cursos-online


Compile os arquivos .java.

Execute o Main.java.
