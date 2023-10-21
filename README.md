
# API para sistema escolar

## Descrição

Uma api Básica com o intuito de implementar uma tela de aluno em um sistema.

## Modelo

O modelo da página foi criado no figma e pode ser encontrado [aqui](https://www.figma.com/file/JmTG3CDK5viEAyAVShfdjc/Modelo_aplicativo_escolar?type=design&node-id=0%3A1&mode=design&t=ZH6NuBff9MuaeULY-1).

![](src/main/resources/imgs/tela_projeto.jpg)

## Diagrama de classes

```mermaid
classDiagram
    class Student {
      - Long id
      - String name
      - String grade
      - String registrationNumber
      - BigDecimal cr
      - List<Notice> notices
      - List<Subject> subjects
      - Classroom classroom
    }

    class Notice {
      - Long id
      - String title
      - String body
    }

    class Subject {
      - Long id
      - String name
    }
    
    class Curriculum {
      - Long id
      - Subject subject
      - BigDecimal assessment
    }

    class Classroom {
      - Long id
      - String classCode
    }

    Student "1" *-- "many" Notice
    Student "1" *-- "many" Subject
    Student "many" -- "1" Classroom
    Curriculum "1" -- "many" Subject
    Student "1" *-- "1" Curriculum

```

## Endpoints
Get - /aluno/{id}

Post - /aluno

Delete - /aluno/id

## TODO
- Adcionar Curriculo como uma classe com matérias e notas
- Adcionar Professor, com um professor podendo dar aula pra uma matéria e uma matéria podendo ter vários professores.
