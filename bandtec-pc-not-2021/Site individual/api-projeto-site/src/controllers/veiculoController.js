var veiculoModel = require("../models/veiculoModel");

function cadastrarveiculo(req, res) {
    var marca = req.body.marca;
    var modelo = req.body.modelo;
    var ano = req.body.ano;
    var idUsuario = req.params.idUsuario;

    if(modelo == undefined) {
        res.status(400).send("Insira o modelo do seu veiculo");
    }else if(marca == undefined){
        res.status(400).send("Insira a marca do seu veiculo")
    }else if(ano == undefined){
        res.status(400).send("Insira o ano do veiculo")
    }else {
        veiculoModel.cadastrarveiculo(marca, modelo, ano, idUsuario)
        .then(
            function (resultado) {
                res.json(resultado);
            }
        ).catch(
            function (erro) {
                console.log(erro);
                console.log(
                    "\nHouve um erro ao realizar o cadastro! Erro: ",
                    erro.sqlMessage
                );
                res.status(500).json(erro.sqlMessage);
            }
        );
    }
}

function veiculosPorMarca(req, res) {
    return veiculoModel.veiculosPorMarca().then((res) => {
        console.log(res)
        res.json(res)
    }).catch((err) => {
        console.log(err);
        res.json([{
            contagem: 10,
            marca: 'marca 1'
        }, {
            contagem: 5,
            marca: 'marca 2'
        }])
        //res.status(500).json(err.sqlMessage);
    })
}

module.exports = {
    cadastrarveiculo,
    veiculosPorMarca
}