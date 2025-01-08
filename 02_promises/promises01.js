// recebe duas funções como parâmetro
// resolve -> param void, chamada quando tiver uma condição favorável
// reject é chamado quando acontece um erro
let promise = new Promise((resolve, reject) => {
    let numberRandom = Math.random(); // gera um número aleátorio entre 0 e 1
    //simulação: se os valores gerados forem acima de 0.5 são aceitáveis (válidos).
    //caso contrário, o valor é inaceitável (inválido)
    if (numberRandom > 0.5)
        resolve(`valor válido: ${numberRandom}`);
    else
        reject(`valor inválido: ${numberRandom}`);
});
 
// promise.then - pode ser chamado várias vezes, é executado no fim da função resolve
// promise.catch - é chamado apenas uma vez, é executado no fim da função reject
// promise.finally - é chamado apenas uma vez, é executado após qualquer função ser executada na promise
console.log('antes do promise');
promise
    .then(s => s.toUpperCase())
    .then(s => s.substring(6))
    .then(s => console.log(s))
    .catch(err => console.error(err))
    .finally(() => console.log('fim da promise'));
console.log('depois do promise');