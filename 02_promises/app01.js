const getPromise = require('./Promise01');

// função assíncrona que chama a promise e trata o resultado com try/catch vendo se tem erro.

async function testPromise (){
    try {
        const valor = await getPromise();
        console.log(valor);
    } catch (error) {
        console.error(error);
    }
}

testPromise();