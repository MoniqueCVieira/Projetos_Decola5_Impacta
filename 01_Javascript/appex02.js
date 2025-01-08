let calcularImposto = require('./funcoes/imposto.js');
let irpf = calcularImposto(2000);
console.log("O irpf vai ser de R$: " + irpf.toFixed(2));            