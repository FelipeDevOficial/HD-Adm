# HD-informatica

![Logo do Projeto](link-para-logo.png)

> :construction: Projeto em construção :construction:

## Índice

- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura](#estrutura).

## Descrição do Projeto

O **HD-informatica** é um sistema desenvolvido em Java para a gestão de alunos e cursos em instituições de ensino. Ele permite o cadastro de usuários, gerenciamento de matrículas, controle de pagamentos e emissão de certificados, garantindo segurança e eficiência nas operações administrativas.

## Funcionalidades

- **Gerenciamento de Usuários**: Cadastro, edição, exclusão e listagem de usuários do sistema.
- **Controle de Alunos**: Registro de alunos com informações detalhadas, incluindo matrícula, curso, datas de início e fim, e status (matriculado, cursando, concluído, cancelado).
- **Histórico de Ações**: Registro de todas as alterações realizadas nas tabelas de alunos, matrículas e pagamentos, incluindo o usuário responsável pela ação.
- **Emissão de Certificados**: Geração de certificados de conclusão de curso em formato HTML, com opção de impressão e salvamento em PDF.
- **Gerenciamento de Cursos**: Adição, edição, exclusão e consulta de cursos disponíveis.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Gerenciamento de Dependências**: Apache Maven
- **Banco de Dados**: MySQL

## Estrutura

```markdown
HD-informatica/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── hdinformatica/
│   │   │   │   │   ├── model/         # Contém as classes de domínio (entidades)
│   │   │   │   │   ├── dao/           # Contém classes para acesso ao banco de dados
│   │   │   │   │   ├── service/       # Contém a lógica de negócios
│   │   │   │   │   ├── controller/    # Contém classes para interação com a interface (CLI ou GUI)
│   │   │   │   │   ├── util/          # Classes auxiliares, como geradores de relatório e utilitários
│   │   │   │   │   ├── Main.java      # Classe principal do sistema
│   │   ├── resources/                 # Contém arquivos de configuração
│   │   │   ├── db/                    # Scripts SQL para criação do banco
│   │   │   ├── application.properties # Configurações gerais do sistema
│── test/                              # Testes automatizados
│── lib/                               # Dependências externas (caso não esteja usando Maven)
│── docs/                              # Documentação do projeto
│── .gitignore                         # Arquivo para ignorar arquivos desnecessários no Git
│── README.md                          # Documentação principal do projeto
│── pom.xml (se usar Maven)            # Gerenciador de dependências (opcional)

