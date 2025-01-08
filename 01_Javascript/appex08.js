

let dados = require('./dados/listaDados');

let listaCursos = dados.cursos;

// lista com cursos que estão ativos (status = true)
let cursoAtivo = listaCursos.filter(item => item.status);
console.log(cursoAtivo);

// criar uma lista com os cursos longos (ch > 3000)
let cursoLongo = listaCursos.filter(item => item.ch > 3000);
console.log(cursoLongo);
