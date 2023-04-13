## Resoluções: 

**1) Descreva os quatro elementos básicos de repetição controlada por contador.**

R:  Inicialização define o valor inicial do contador.
    Teste de condição verifica a condição para o loop ser verdadeira ou falsa.
    Corpo do loop contém as instruções a serem repetidas até que a condição seja falsa.
    Incremento ou decremento é executado no final de cada iteração do loop para garantir que o loop eventualmente pare quando a condição for falsa.

**2) Compare e contraste as instruções de repetição while e for.**

R: Diferença entre as estruturas de repetição é que o for é usado quando sabemos a quantidade de repetições, já o while é utilizado até que uma condição seja verdadeira.

**3) Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.**

R: Apesar quas duas estruturas de repetições exerçam o mesmo papel, é recomendado utilizar o do-while quando queremos que um bloco de código execute peleo menos uma vez, ou seja, a condição de parada só será verificada no final da execução, já o while testa a condição de parada antes de executar o código

**4) Compare e contraste as instruções break e continue.**

R: A instrução break é usada para sair de um loop de forma forçada, já o continue é usado para pular uma iteração de um loop sem executar as linhas abaixo nessa iteração.

**5) Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:**

R:
a) 
For (int i = 100; i >= 1; i--) System.out.println(i);
b)
switch (value % 2) {
    case 0:
        System.out.println("Inteiro par");
        break;
    case 1:
        System.out.println("Inteiro ímpar");
        break;
}
c) 
for(int i = 19; i >= 1; i -=2) System.out.println(i);
d)
int counter = 2;
do {
    System.out.println(counter);
    counter += 2;
} while (counter <= 100); 

**6) O que o seguinte programa faz?**

R: O código irá executar duas estruturas de repetições, uma de cada vez, por exemplo ele primeiro executa o for interno, e vai incrementar até que j seja igual a 5. Depois executa de novo o for mais externo, uma vez incrementado o for interno irá executar mais uma vez, com j inicializado em 1. O programa só vai parar quando i for igual a 10.
