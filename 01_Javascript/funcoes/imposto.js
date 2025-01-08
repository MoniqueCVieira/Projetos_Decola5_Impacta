module.exports = function (valor) {

    const valores = [0, 2259.20, 2829.65, 3751.05, 4464.68]; // 5 elementos que vão da posição 0 até 4
    const taxas = [0, 7.50, 15, 22.50, 27.50];

    let imposto = 0;
    let baseCalculo = valor;

    for(let i = valores.length - 1; i >= 0; i--){
        if(baseCalculo > valores[i]){
            imposto = imposto + ((baseCalculo - valores[i]) * (taxas[i] / 100)); 
            // calculando o imposto pegando o valor da base de calculo e subtraindo o valor da posição i do array valores, assim, meu salário (valor) - imposto.


        }
    }
    return imposto;
}
