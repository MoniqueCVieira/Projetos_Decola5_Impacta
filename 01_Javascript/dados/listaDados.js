// Objetivo: armazenar dados para serem utilizados em outros arquivos

exports.nomes = ["Carlos", "Daniela", "Marcos", "Bernardo", "Ana Paula"]

exports.empresa = {
    decricao: 'Avanade',
    cidade: 'São Paulo',
    ano: 2024,
    funcinarios: this.nomes,
}

exports.lista1 = ["Jungkook", "Namjoon", "Hoseok", "Minhyuk"]

exports.lista2 = ["Jin", "Jimin", "Taehyung", "Yoongi"]

exports.cursos = [
    {descricao: 'Psicologia', ch: 4800, periodo: 'MANHÃ', status: true},
    {descricao: 'Análise e Desenvolvimento de Sistemas', ch: 2400, periodo: 'NOITE', status: true},
    {descricao: 'Turismo', ch:2800, periodo: 'NOITE', status: false},
]