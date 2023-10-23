# dio-desafio-api-rest

### DESCRIÇÃO
Esse é um desafio feito pelo isntrutor [Venilton FalvoJr](https://github.com/falvojr) durante o do Boot Camp Backend Java oferecido pela DIO.

### DESAFIO
Desafio proposto duranto o Boot Camp Back-end Java da Dio em parceria com o Santander, com o objetivo de aplicar todos os conhecimentos adquiridos durante o Boot Camp.



´´´ mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News

´´´