const express = require('express'); /*require ta pegando o codigo de outro modulo */
const { ArduinoData } = require('./serial')
const router = express.Router();
const db = require('./connection');

router.get('/temperature', (request, response, next) => {

    let sum = ArduinoData.ListTemp.reduce((a, b) => a + b, 0);
    let average = (sum / ArduinoData.ListTemp.length).toFixed(2);

    response.json({
        data: ArduinoData.ListTemp,
        total: ArduinoData.ListTemp.length,
        average: isNaN(average) ? 0 : average,
    });

});

router.get('/humidity', (request, response, next) => {

    let sum = ArduinoData.List.reduce((a, b) => a + b, 0);
    let average = (sum / ArduinoData.List.length).toFixed(2);

    response.json({
        data: ArduinoData.List,
        total: ArduinoData.List.length,
        average: isNaN(average) ? 0 : average,
    });

});

router.post('/sendData', (request, response) => {
    temperatura = ArduinoData.ListTemp[ArduinoData.ListTemp.length - 1];
    umidade = ArduinoData.List[ArduinoData.List.length - 1];

    var sql = `
        INSERT INTO medida (temperatura, umidade, momento, fk_aquario) 
        VALUES (${temperatura}, ${umidade}, now(), ${((Math.random() * 3) + 1)})
    `;
    db.query(sql, function(err, result){
        if(err) throw err;
        console.log("Medidas inseridas: " + result.affectedRows)
    });
    response.sendStatus(200);
})

module.exports = router;