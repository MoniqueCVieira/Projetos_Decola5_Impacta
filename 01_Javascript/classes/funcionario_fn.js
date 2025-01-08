// Uma classe escrita como função

function Funcionario(nome = 'desconhecido', idade = 18, cargo = 'desconhecido', salario = 2000){
    if(nome == undefined || idade == undefined || cargo == undefined || salario == undefined){
        throw new Error('Dados incorretos');
    }

    // Atributos da classe não devem ser anônimos
    this.atribuir = function(nome, idade, cargo, salario){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

    this.mostrarDados = function(){
        return `Nome: ${this.nome}, Idade: ${this.idade}, Cargo: ${this.cargo}, Salário: ${this.salario}`;
    }
}