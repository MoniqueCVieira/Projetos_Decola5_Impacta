let pessoa = {
    atribuir: function(nome, idade){
        this.nome = nome;
        this.idade = idade;
    },
    verificar: function(){
        // Retornar verdadeiro ou falso se a pessoa for maior de idade
        return this.idade >= 18;
    },
    mostrar: function(){
        let status = this.verificar() ? "Maior de idade" : "Menor de idade";
        return `Nome: ${this.nome}, Idade: ${this.idade}, Status: ${status}`;
    }
}

module.exports = pessoa;