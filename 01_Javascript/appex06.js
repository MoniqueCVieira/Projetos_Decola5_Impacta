// Objetivo: trabalhar com funções de array
// 1. Exibir a lista1, com todos os elementos que contêm a letra 'j'
// 2. Exibir a lista2, com todos os elementos que têm mais de 4 caracteres
// 3. Exibir a lista3, com todos os elementos que contêm a letra 'r' ou 'R'

let dados = require('./dados/listaDados');
let lista1 = dados.lista1.filter(s => s.includes('j'));
console.log(lista1);

let lista2 = dados.lista2.filter(s => s.length > 4);

let lista3 = dados.lista3.filter(s => s.toUpperCase().includes('R'));

// aplicação de map - mapeamento de dados para gerar uma nova representação
console.log('-------------');
console.log(dados.nomes);

let map1 = dados.nomes.map((elemento, indice) => {return indice + '-' + elemento; });
console.log(map1);