// Requere o arquivo listaDados.js e exibe os dados da empresa e do primeiro curso, situado no lugar 0 do array cursos.
let dados = require('./dados/listaDados');

let empresa = dados.empresa;

console.log(empresa);
console.log(empresa.descricao);

let curso = dados.cursos[0];
console.log(curso);