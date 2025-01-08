// declarando variáveis
// var curso = "Monique World!"; // var: visibilidade global
let nome = "JK World"; // let: visibilidade local
nome = "Hope World"; // alterando o valor da variável
let ch = 186; // number
let st = true; // boolean
let verifica = (ch > 100); // varialvel que verifica se ch é maior que 100

let lista = ['Java', 'Oracle', 'Angular', 113]; // array
let empresa = {
    decricao: 'Avanade',
    cidade: 'Recife',
    ano: 2024,
    funcinarios: ['Monique', 'JK', 'Hope'],
} // Aqui temas uma chave(empresa) e dentro dela temos outras chaves, que podem ser strings, números, arrays, etc. 
// JSON JavaScript Object Notation, é um objeto javascript. JSON é um objeto javascript, mas nem todo objeto javascript é um JSON. JSON tem que estar entre aspas.

let empresaJson = JSON.stringify(empresa); // Aqui ele vai transformar o objeto empresa em um JSON. JSON.stringify: transforma um objeto em um JSON

// console.log(curso, '-', typeof(curso)); // typeof: tipo da variável para verificar se é string, number, etc
console.log(nome, '-', typeof(nome)); // Aquele console.log é para mostrar o valor da variável curso
console.log(ch, '-', typeof(ch)); // verificando qual tipo de variável é ch
console.log(st, '-', typeof(st));
console.log(verifica, '-', typeof(verifica));
console.log(lista, '-', typeof(lista));
console.log(empresa, '-', typeof(empresa)); // Aqui ele vai mostrar o valor da variável empresa e o tipo dela que no caso seria objeto
console.log(empresaJson); // Aqui ele vai mostrar o valor da variável empresaJson e o tipo dela que no caso seria objeto