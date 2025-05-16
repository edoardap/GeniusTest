# GeniusTest
> Geração inteligente de testes


## 👨‍🎓 Integrantes
- FRANCISCO BEZERRA DA SILVA NETO
- MARIA EDUARDA PEREIRA DE SOUZA MELO
- MARÍLIA DE ARAUJO SANTOS OLIVEIRA


## 💡 Ideia Principal
Desenvolver um sistema inteligente que automatiza a criação de testes para software, garantindo qualidade e eficiência. Imagine um "robô programador" que entende o código, identifica o que precisa ser testado e gera os testes automaticamente, seguindo boas práticas. Isso ajuda desenvolvedores a economizar tempo e reduzir erros, mantendo o software mais confiável.

## 🎯 Objetivos
- Automatizar a escrita de testes, reduzindo tempo e esforço manual.

- Garantir testes de alta qualidade, com boa cobertura, legibilidade e relevância.

- Identificar edge cases (cenários extremos) e gerar dados de teste inteligentes.

- Integrar métricas de cobertura para destacar partes do código não testadas.

- Ser modular e adaptável, permitindo configurações para diferentes necessidades (ex.: performance, BDD).

## 👥 Público-Alvo
- Desenvolvedores e equipes de QA que precisam criar testes automatizados.

- Startups e empresas de tecnologia que buscam otimizar CI/CD (integração contínua).

- Projetos open-source que necessitam de testes robustos, mas têm recursos limitados.
  
## 🤖 Agentes Envolvidos
- Agente Analisador de Código: Interpreta o código-fonte, identifica métodos e dependências.

- Agente Especialista em Padrões de Teste: Garante que os testes sigam boas práticas.

- Agente Gerador de Teste: Cria os testes.

- Agente Avaliador de Qualidade: Verifica cobertura, legibilidade e eficácia dos testes.

- Agente Orquestrador: Coordena todos os agentes e consolida os testes gerados.

## 🧱 Tecnologias 
- Linguagem de Programação: Java
- Análise de Código: JavaParser
- Geração de Testes Automatizados: JUnit 5 e Mockito


## 📦 Entradas e Saídas Esperadas
Entradas (O que o sistema recebe):
- Código-fonte (arquivos .py, .java, etc.) para análise.

-  Configurações do usuário (ex.: foco em edge cases, estilo BDD, nível de cobertura desejado).

- Dependências do projeto (bibliotecas, frameworks usados no código).

- Requisitos ou documentação (se disponível, para orientar testes baseados em regras de negócio).

Saídas (O que o sistema gera):
- Testes automatizados (scripts prontos em frameworks como pytest, JUnit, etc.).

- Relatório de cobertura (ex.: porcentagem de linhas/métodos testados, áreas críticas não cobertas).

- Sugestões de melhorias (ex.: métodos complexos que precisam de mais testes, edge cases não abordados).

- Dados de teste gerados (ex.: inputs válidos/inválidos para cenários específicos).

- Logs de execução (para debug, mostrando como os agentes tomaram decisões).

## 🔁 Interação entre os Agentes
O sistema funciona como uma orquestra de agentes especializados, onde cada um tem uma tarefa específica, mas colabora com os outros para gerar testes automatizados de alta qualidade. O Agente Orquestrador é o "cérebro" que coordena o fluxo de trabalho.

Fluxo de Interação (Passo a Passo)
Início:
- O usuário envia o código-fonte + configurações (ex.: linguagem, foco em edge cases).

Agente Orquestrador recebe a entrada e aciona:

Agente Analisador de Código:

- Lê o código, identifica funções, classes, dependências e complexidade.

- Gera um mapa de cobertura potencial (áreas que precisam de testes).

Agente Especialista em Padrões de Teste entra em ação:

- Define a estrutura dos testes.

- Sugere nomes descritivos para os testes.

Agente Gerador de Dados de Teste é acionado:

- Cria os testes.

Agente Avaliador de Qualidade verifica:
- Se o teste tem problemas sintáticos.
  
- Se o teste é compilável.
  
- Cobertura de código (quantas linhas/métodos estão testados).

- Legibilidade (se os testes são claros e mantêm boas práticas).

Agente Orquestrador consolida e entrega:

- Gera os arquivos de teste prontos.

- Produz um relatório com métricas de cobertura e sugestões.

## 📌 Status Inicial do Projeto
- [X] Ideia discutida e validada com o professor
- [X] Estrutura básica do repositório criada
- [X] Quadro no GitHub Projects criado
- [X] Primeiras tarefas definidas e atribuídas

## 📄 Documentação Futura
Este repositório poderá incluir:
- Diagramas de arquitetura
- Relatórios parciais de progresso
- Scripts de testes ou simulações
- Resultados e conclusões finais

