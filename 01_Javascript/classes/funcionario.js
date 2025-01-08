// O uso de classes no JS faz parte de uma sintaxe de programação chamada ES6 (ECMAScript 6) ou "sugar sintaxe"

class Funcionário {
    // função especial, executada no momento em que o objeto da classe é executado (execução implícita)
    constructor(){
        this.atribuir('desconhecido', 18, 'desconhecido', 2000);
    }

    atribuir(nome, idade, cargo, salario){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

    mostrarDados(){
        return `Nome: ${this.nome}, Idade: ${this.idade}, Cargo: ${this.cargo}, Salário: ${this.salario}`;
    }
}

module.exports = Funcionário;