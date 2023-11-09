# Sistema-de-Vendas-POO 

Um Sistema de Vendas construído utilizando a Programação Orientada a Objetos.

O programa consiste num sistema no qual você é um funcionário responsável por gerenciar uma loja. 

O funcionário é capaz de cuidar dos registros de clientes, dos produtos da loja e sua disponibilidade no estoque, além das vendas. 


Dentro dessas categorias citadas você será capaz de realizar novos cadastros, remover itens existentes ou listá-los para análise. 

Tendo todos esses dados guardados em arquivos para que não se percam. 


Indo mais afundo no código, para realizar estas ações, todas as mecânicas foram separadas em suas respectivas classes, sendo agrupadas em pacotes que as classificam por Função, Menu e Telas, de forma que tudo trabalha pelo chamado inicial da MAIN de forma orgânica e sistematizada. 

SOBRE A EXECUÇÃO DO CÓDIGO  

A função principal inicializa os arquivos que guardam os dados e depois instancia a tela do menu principal.  
Essa por sua vez dá a escolha para o usuário transitar entre os menus de produto, estoque, cliente e vendas. 

Em relação ao menu produto, o usuário tem a possibilidade de cadastrar, excluir, listar e alterar as informações do produto. 

O mesmo ocorre no menu cliente (cadastrar, excluir, listar e alterar). 

Já no menu estoque, é possível adicionar um produto ao estoque, além de alterar a quantidade, listar e excluir. 

E no menu vendas é possível realizar uma venda, ver o histórico e o saldo total.  
A venda é realizada para um cliente, escolhendo a quantidade de um produto. 
As informações salvas no histórico de vendas são o nome do cliente, o nome e o preço do produto, a quantidade do estoque, o valor total e a data da venda. 
