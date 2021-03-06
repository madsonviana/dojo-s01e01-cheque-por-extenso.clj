# Dojo DevMT S01E01 (Versão em Clojure) [![Build Status](https://travis-ci.org/alvarowolfx/dojo-s01e01-cheque-por-extenso.clj.svg?branch=master)](https://travis-ci.org/alvarowolfx/dojo-s01e01-cheque-por-extenso.clj)
#### Versão original desenvolvida em C#. [Disponivel aqui](https://github.com/devmatogrosso/dojo-s01e01-cheque-por-extenso)

## Data e Local
Data: 16/05/2015  
Local: Nuvem Tecnologia  

## Problema
Apesar de o volume de cheques emitidos tenha diminuído drásticamente nos últimos anos,
principalmente devido a popularização dos cartões de crédito e débito, eles ainda são
utilizados em muitas compras, especialmente a de valores altos. E para auxiliar no seu
preenchimento, vários estabelecimentos possuem máquinas que dado o valor da compra,
preenchem o cheque com o seu valor por extenso.
Desenvolva um programa que dado um valor monetário, seja retornado o valor em reais
por extenso.
Exemplo:
15415,16 -> quinze mil quatrocentos e quinze reais e dezesseis centavos
0,05 -> cinco centavos
2,25 -> dois reais e vinte e cinco centavos

[Link do problema](http://dojopuzzles.com/problemas/exibe/cheque-por-extenso/)

### Alguns pré-requisitos

Para este projeto foi Clojure 1.6.0, Leiningen e desenvolvido utilizando o Intellij com plugin Clojure.

### Como rodar

```shell
lein test
```

