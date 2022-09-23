var database = require ("../database/config");

function cadastrarveiculo(marca, modelo, ano, idUsuario){
    console.log("ACESSEI O USUARIO MODEL \n \n\t\t >> Se aqui der erro de 'Error: connect ECONNREFUSED',\n \t\t >> verifique suas credenciais de acesso ao banco\n \t\t >> e se o servidor de seu BD está rodando corretamente. \n\n function cadastrarveiculo():", marca, modelo, ano, idUsuario);
    var instrucao = `
        INSERT INTO veiculo (marca, modelo, ano, fkUsuario) VALUES ('${marca}', '${modelo}', ${ano}, ${idUsuario});
    `;
    return database.executar(instrucao);
}

function veiculosPorMarca() {
    var instrucao = `
        SELECT COUNT(*) AS contagem, marca FROM veiculo group by marca
    `;

    return database.executar(instrucao);
}

module.exports = {
    cadastrarveiculo,
    veiculosPorMarca
}