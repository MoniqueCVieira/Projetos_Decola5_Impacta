const Funcionario = require('./classes/funcionario');
// Instanciando a classe.

// O construtor chama o atribuir, se tiver mais de uma, o último constructor é o que vale.
let p = new Funcionario('Minhyuk', 31, 'Analista de Sistemas', 5000);

// Se não atribuir valor, aparece undefined.
p.atribuir('Jongin', 30, 'Desenvolvedor', 6000);
console.log(p.mostrarDados());

// undefined = não foi atribuído valor mas tem referencia.
// null = não foi atribuído valor e não tem referencia.