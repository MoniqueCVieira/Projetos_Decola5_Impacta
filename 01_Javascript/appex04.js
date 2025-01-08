let pessoa = require('./modulos/pessoa_obj_fn.js');
let app = pessoa();

app.atribuir('Mingi', 25);
console.log(app.mostrar());