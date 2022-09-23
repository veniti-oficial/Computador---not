var container = document.getElementById("root");



function Participante(props) {

    // var votos = 0;
    const [votos, setVotos] = React.useState(0);

function votar() {
    setVotos(votos + 1);
}


    return (
        <>
        <h1>{props.nome}</h1>
        <h2>Votos: {votos}</h2>
        <button onClick={votar}>Votar</button>
        </>
    )
}

function Votacao() {
    return (
        <>
        <Participante nome = "Méqui"/>
        <Participante nome = "BK"/>
        <Participante nome = "KFC"/>
        </>
    )
}

ReactDOM.createRoot(container).render(<Votacao />);






// function Titulo(props) {
//     return  (
//         <>
//             <h1>{props.titulo}</h1>
//         </>
        
//     );
// }

// function Titulos() {
//     return (
//         <>
//         <Titulo titulo = "1º titulo desse componente"/>
//         <Titulo titulo = "2º titulo desse componente"/>
//         </>
//     )
// }


// var titulo = document.createElement("h1");
// titulo.innerHTML = "Esse titulo foi criado pelo JSX :)";

// container.appendChild(titulo);