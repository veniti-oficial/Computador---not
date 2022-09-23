var express = require("express");
var router = express.Router();

var usuarioController = require("../controllers/usuarioController");
var veiculoController = require("../controllers/veiculoController")

router.get("/", function(req, res) {
    usuarioController.testar(req, res);
});

router.get("/listar", function(req, res) {
    usuarioController.listar(req, res);
});

router.post("/cadastrar", function(req, res) {  
    usuarioController.cadastrar(req, res);
})

router.post("/veic/:idUsuario", function(req, res) {
    veiculoController.cadastrarveiculo(req, res)
})/*Criando a rota de cadastrar veiculo*/

router.get("/veic/metrica", function(req, res) {
    veiculoController.veiculosPorMarca(req, res)
})

router.post("/autenticar", function(req, res) {
    usuarioController.entrar(req, res);
});
  
module.exports = router;