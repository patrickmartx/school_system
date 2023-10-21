
# API para sistema escolar

## Descrição

Uma api Básica com o intuito de implementar uma tela de aluno em um sistema.

## Modelo

O modelo da página foi criado no figma e pode ser encontrado [aqui](https://www.figma.com/file/JmTG3CDK5viEAyAVShfdjc/Modelo_aplicativo_escolar?type=design&node-id=0%3A1&mode=design&t=ZH6NuBff9MuaeULY-1).

## Diagrama de classes

```mermaid
classDiagram
    class Student {
      - String name
      - String grade
      - String registrationNumber
      - float cr
      - List<Notice> notices
      - List<Subject> subjects
      - Classroom classroom
    }

    class Notice {
      - String title
      - String body
    }

    class Subject {
      - String name
    }

    class Classroom {
      - String classCode
      - List<Professor> professors
    }

    class Professor {
      - String name
      - Subject subject
      - float evaluation
    }

    User "1" *-- "many" Notice
    User "1" *-- "many" Subject
    User "1" -- "1" Classroom
    Classroom "1" *-- "many" Professor
    Professor "1" -- "1" Subject

```

## Endpoints
