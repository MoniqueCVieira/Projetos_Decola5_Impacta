/* 
    a função deste arquivo recebera três parâmetros:
    dia, mes, ano

    Com base nestas informações, determinar quantos dias restam para terminar o ano
*/

module.exports = function (dia, mes, ano){

    // produzir os parametros como tipos numericos interios
    dia = parseInt(dia);
    mes = parseInt(mes);
    ano = parseInt(ano);

    if(mes < 1 || mes > 12){
        throw new Error("Mês inválido! Digite um número entre 1 e 12."); // throw new Error é uma forma de lançar um erro. Nesta function estamos falando "O mes deve ser entre 1 e 12"
    }

    // const define uma variável que não permite que seu valor seja alterado
    const meses = [31, ano % 4 == 0 ? 29:28 ,31,30,31,30,31,31,30,31,30,31]; // Array de meses com a quantidade de dias de cada mês
    
/*   if(ano % 4 == 0 ) {
        meses[1] = 29; // define ano bissexto
    } else {
        meses[1] = 28; // define ano não bissexto
    }
*/
    
if(dia < 1 || dia > meses[mes - 1]){ // criei uma condição para verificar se o dia é menor que 1 ou maior que a quantidade de dias do mês escolhido
    throw new Error("Dia inválido! Digite um número entre 1 e " + meses[mes - 1] + " para o mês " + mes);
    }
    let diasRestantes = meses[mes -1] - dia; // variavel que irá armazenar a quantidade de dias restantes
    for (let i = mes; i < meses.length, i++;){ // for que irá percorrer o array de meses para somar a quantidade de dias restantes
        diasRestantes = diasRestantes + meses[i];
    }



}