# dio-trilha-java-basico
## Simulando uma Agência de Banco

----
Projeto do módulo Sintaxe

## Sobre o desafio:
O desafio consiste em uma ideia bem simples, e o conceito mais trabalhado foi o uso da classe Scanner.
Diferente de linguagens mais modernas, que utilizam corriqueiramente as funções ``` input ```, em Java se usa o Scanner, que tem algumas particulares que precisam ser estudadas. Entre elas, a classe deve ser importada do pacote de utilitários do ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white).

## Paralelos:
Já tinha criado estruturas parecidas em outros projetos, então colocarei alguns exemplos abaixo:

![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)

### Conversor de Moedas

---

```python
n = float(input('Quanto dinheiro você tem na carteira?'))

us = n/3.27

print('Você pode comprar {}US${:.2f}{} com {}R${:.2f}{}'.format('\033[34m',us,'\033[m','\033[32m',n,'\033[m'))
```
---
``` Matlab ```
### Configurador de Gráficos

---
[![Open in MATLAB Online](https://www.mathworks.com/images/responsive/global/open-in-matlab-online.svg)](https://matlab.mathworks.com/open/github/v1?repo=[my_repo_address]&project=MY_REPO.prj)

```Matlab
%% Configurando o Gráfico:
ans3 = input('Você quer abrir as configurações adicionais do plot? Y/N \n','s')

if ans3 == 'Y'
else
return
end

hor = input('Digite o nome do eixo horizontal:\n','s');
vert = input('Digite o nome do eixo vertical:\n','s');

xlabel(hor)
ylabel(vert)

text = input('Digite o nome do gráfico:\n','s');

title(text,'Fontsize',18,'FontWeight','normal')

ans2 = input('Você quer adicionar legendas? Y/N \n','s');

if ans2 == 'Y'

label1 = input('Digite o nome da legenda do primeiro plot:\n','s');
label2 = input('Digite o nome da legenda do segundo plot:\n','s');
label3 = input('Digite o nome da legenda do terceiro plot:\n','s');
legend(label1,label2,label3)

end

lim1x = input('Digite o limite inferior de exibição de x:\n');
lim2x = input('Digite o limite superior de exibição de x:\n');

lim1y = input('Digite o limite inferior de exibição de y:\n');
lim2y = input('Digite o limite superior de exibição de y:\n');

xlim([lim1x lim2x])
ylim([lim1y lim2y])

grid on
grid minor

end
```
