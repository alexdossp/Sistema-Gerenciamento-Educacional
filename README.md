<p align="center">
  <img src="https://i.imgur.com/5gt8sOg.png" width="100%" alt="Capa do Projeto SGE">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-red" />
  <img src="https://img.shields.io/badge/Editor-VS%20Code-blue" />
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen" />
  <img src="https://img.shields.io/badge/Arquitetura-Camadas-yellow" />
  <img src="https://img.shields.io/badge/Projeto-Acadêmico-lightgrey" />
</p>

# 🎓 Sistema de Gerenciamento Educacional (SGE)
### *Projeto acadêmico – Java, POO e Arquitetura em Camadas*

---

## 📌 Sobre o Projeto

O **Sistema de Gerenciamento Educacional (SGE)** é um projeto acadêmico desenvolvido para aplicação prática dos conceitos de **Programação Orientada a Objetos em Java**, estruturado em múltiplas fases, evoluindo desde classes simples até um sistema completo com menu interativo.

Este projeto integra conceitos fundamentais como:

- Criação de classes e objetos  
- Encapsulamento e validações  
- Relacionamento entre entidades  
- Herança e polimorfismo  
- Interfaces e abstração  
- Estrutura em camadas (Repository, Service, UI)  
- Relatórios dinâmicos  
- Menu interativo completo  

---

## 🧠 Objetivos Didáticos

O projeto demonstra, na prática:

- Modelagem orientada a objetos  
- Estruturação modular com packages  
- Manipulação de listas e coleções  
- Construtores personalizados  
- Sobrescrita e sobrecarga de métodos  
- Separação de responsabilidades  
- Arquitetura limpa e reutilizável  
- Execução de etapas através de testes separados  

---

## 🚀 Funcionalidades por Fase

### ✔️ Fase 1 — Modelagem Inicial  
Instâncias de alunos, professores e cursos.

### ✔️ Fase 2 — Relacionamentos  
Associação entre aluno, curso, professor e turma.

### ✔️ Fase 3 — Avaliações  
Criação de avaliações, média e validações internas.

### ✔️ Fase 4 — Herança  
Implementação de Curso Presencial e Curso EAD.

### ✔️ Fase 5 — Perfis e Autenticação  
Administrador, Professor e Aluno com autenticação.

### ✔️ Fase 6 — Relatórios  
Relatórios detalhados usando polimorfismo.

### ✔️ Fase 7 — Arquitetura em Camadas  
Repository → Service → UI funcionando em conjunto.

### ✔️ Fase Final — Sistema Completo  
Menu com:

- Cadastro de aluno  
- Cadastro de curso  
- Criação de turma  
- Matrícula de aluno  
- Registro de avaliação  
- Relatórios  
- Saída do sistema  

---

## 🔧 Como Rodar o Projeto

### 1️⃣ Compilar (VS Code / PowerShell Windows)
javac model*.java repository*.java service*.java ui*.java main*.java

### 2️⃣ Executar fases individuais
java main.Fase1Teste
java main.Fase2Teste
java main.Fase3Teste
java main.Fase4Teste
java main.Fase5Teste
java main.Fase6Teste


### 3️⃣ Rodar o sistema completo (menu)
java ui.MainFinal


---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- VS Code
- Programação Orientada a Objetos
- Arquitetura em Camadas
- Estrutura modular com packages

---

## 🎓 Finalidade Acadêmica

Este projeto foi desenvolvido como atividade avaliativa acadêmica, demonstrando aplicação real de conceitos fundamentais de POO e boas práticas de desenvolvimento Java.

---

## 🧩 O que Aprendi

Durante o desenvolvimento deste projeto, pude aplicar e consolidar diversos conceitos fundamentais da Programação Orientada a Objetos e da estruturação de software em Java. Entre os aprendizados mais importantes estão:

### ✔️ Modelagem Orientada a Objetos
Compreensão clara de como representar entidades reais (Aluno, Curso, Professor) por meio de classes, atributos e métodos.

### ✔️ Encapsulamento e validações internas
Uso de getters/setters para proteger o estado dos objetos, incluindo validações como notas válidas e propriedades obrigatórias.

### ✔️ Relacionamento entre classes
Associação entre cursos, turmas, professores e alunos, compreendendo como objetos interagem entre si.

### ✔️ Herança e Polimorfismo
Criação de subclasses como CursoEAD e CursoPresencial, sobrescrita de métodos e comportamento polimórfico em relatórios.

### ✔️ Interfaces e abstração
Implementação de contratos de autenticação e perfis, reforçando boas práticas de desacoplamento.

### ✔️ Manipulação de coleções
Uso de listas para armazenar alunos, turmas, avaliações e demais entidades do sistema.

### ✔️ Arquitetura em camadas
Separação do projeto em:
- `model` (entidades)
- `repository` (armazenamento e simulação de banco)
- `service` (regra de negócio)
- `ui` (entrada do usuário)
- `main` (testes por fase)

### ✔️ Menu interativo
Aplicação prática de loops, entrada de dados e fluxo de execução controlado.

### ✔️ Organização de projeto real
Estrutura modular, pacotes organizados, testes por fase e documentação estruturada como em projetos profissionais.

Este projeto serviu não apenas como avaliação acadêmica, mas também como base sólida para evoluir meus conhecimentos em Java, arquitetura limpa e boas práticas de desenvolvimento.

---

## 👤 Autor

**Alex**  
Estudante de Análise e Desenvolvimento de Sistemas  
Projeto acadêmico documentado para fins de estudo e portfólio.

---
