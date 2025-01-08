// forma tradicional

function calcularSoma(x,y) {
/*    if(typeof(x) != "number"){
        throw new Error("O parâmetro x deve ser numérico")
    }
    if(typeof(y) != "number"){
        throw new Error("O parâmetro y  deve ser numérico")
    }

    return x + y; */
}

// função anonima

let maiorValor = function (x, y) {
    if (x > y) {
        return x;
    } else {
        return y;
    }
}

// Arrow function

let calcularSubtracao = (x, y) => x - y; // Arrow function é uma forma mais simplificada de escrever uma função. Onde temos os parâmetros, a seta e o retorno da função.

module.exports = { calcularSoma, maiorValor }; // Aqui ele vai exportar as funções calcularSoma e maiorValor para que possam ser usadas em outros arquivos