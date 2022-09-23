const express = require('express');
const bodyParser = require('body-parser');
const app = express();


app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());

app.use((request, response, next) => {
    response.header("Access-Control-Allow-Origin", "*");
    response.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
});

app.use('/api', require('./app/controller'));

const server = app.listen(3000);
console.log("Express started at port %s", server.address().port);

/*aqui cria a porta 3000, que a gente busca la no site, ele que vai começar a PI */
/*ele que é executado quando damos npm start vai executar o package.json*/
