let fn = require('./funcoes/funcoes'); // Aqui ele vai importar o arquivo (que no caso é um módulo) que está na pasta raiz do projeto no caso funcoes da pasta funcoes

let soma = fn.calcularSoma(2, 3);
console.log(soma);

soma = fn.calcularSoma("dois", "três");
console.log(soma);