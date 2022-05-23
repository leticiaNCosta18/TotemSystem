function cadastrarEstacao(){
        
    var nome = input_nome_estacao.value;
    var linha = input_linha.value;
    var bairro = input_bairro.value;
    var latitude = input_latitude.value;
    var longitude = input_longitude.value;
    console.log(nome, linha, bairro, longitude, latitude)


    fetch("usuarios/cadastrarEstacao", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            linhaServer: linha,
            nomeServer: nome,
            bairroServer: bairro,
            latitudeServer: latitude,
            longitudeServer: longitude
        })
    }).then(function (resposta) {

        console.log("resposta: ", resposta);



        if (resposta.ok) {
            window.alert("Cadastro da estação realizado com sucesso!");

        } else {
            throw ("Houve um erro ao tentar realizar o cadastro!");

        }
    }).catch(function (resposta) {
        console.log(`#ERRO: ${resposta}`);
        //finalizarAguardar();
    });

    return false
}