'use strict';

function carregarDadosNaPagina() {
    $.ajax({ url: urlCavaleiroGet, type: 'GET' })
    .then(
        function onSuccess(res) {
            console.log(res.data);
            var $cavaleiros = $('#cavaleiros');
            res.data.forEach(function (cava) {
                $cavaleiros.append(
                    criarHtmlCavaleiro(cava)
                );
            });
        },
        function onError(res) {
            console.error(':(');
            console.error(res);

            var criarSpanComErro = function (msg) {
                return $('<span>').text(msg).addClass('erro');
            };

            $('#feedback')
            .append(criarSpanComErro(res.status))
            .append($('<br>'))
            .append(criarSpanComErro(res.statusText));
        }
    )
    .always(function (res) {
        console.log('acabouuuuuuuu');
    });
};

carregarDadosNaPagina();

function criarHtmlCavaleiro(cava) {
    return $('<li>').text(cava.Nome).append('<button>')
}

function excluirCavaleiro() {
    alert('Excluido com sucesso');
}

var cavaleirosAntigos = $('li').length;

function renderizaNovosCavaleiros(listaNova) {
    for (var i=cavaleirosAntigos; i<listaNova.length; i++) {
        var $cavaleiros = $('#cavaleiros');
        $cavaleiros.append(criarHtmlCavaleiro(listaNova[i]));
    }
}

function Notificar(numeroCavaleirosNovos) {
    Notification.requestPermission().then(function (result) {
        console.log(result);
        if (result === 'granted') {
            var options = {
                body: numeroCavaleirosNovos + ' Novos Cavaleiros Adicionados',
                icon: 'http://www.brandsoftheworld.com/sites/default/files/styles/logo-thumbnail/public/072012/logo_cavaleiros_do_zodiaco.jpg?itok=8KpuJsI2'}
                new Notification('', options);
            }
    });
};

function VerificaBanco() {
    cavaleirosAntigos = $('li').length;
    $.ajax({ url: urlCavaleiroGet, type: 'GET' }).done(function (result) {
        if (cavaleirosAntigos < result.data.length) {
            renderizaNovosCavaleiros(result.data);
            Notificar(result.data.length - cavaleirosAntigos);
        };
        console.log('verifica');
    })
}

var myTimer = setInterval(VerificaBanco, 5000);


function registrarEventoDoBotao() {
    $('#btnCriar').click(function () {

        $.ajax({
            url: urlCavaleiroPost,
            type: 'POST',
            data: {
                Nome: 'Xiru ' + new Date().getTime(),
                AlturaCm: 187,
                Signo: 7,
                TipoSanguineo: 1,
                DataNascimento: new Date(),
                Golpes: ['Cólera do Dragão', 'Cólera dos 100 dragões'],
                LocalNascimento: {
                    Texto: 'Beijing'
                },
                LocalTreinamento: {
                    Texto: '5 picos de rosan'
                },
                Imagens: [{
                    Url: 'http://images.uncyc.org/pt/3/37/Shiryumestrepokemon.jpg',
                    IsThumb: true
                }, {
                    Url: 'http://images.uncyc.org/pt/thumb/5/52/Shyryugyarados.jpg/160px-Shyryugyarados.jpg',
                    IsThumb: false
                }]
            }
        });

    });
};
registrarEventoDoBotao();





/*.done(function (res) {
    console.log(res.data);
        var $cavaleiros = $('#cavaleiros');
        res.data.forEach(function (cava) {
            $cavaleiros.append(
                $('<li>').append(cava.Nome)
            );
        });
})
.fail(function (res) {
    console.error(':(');
    console.error(res);

    var criarSpanComErro = function (msg) {
        return $('<span>').text(msg).addClass('erro');
    };

    $('#feedback')
    .append(criarSpanComErro(res.status))
    .append($('<br>'))
    .append(criarSpanComErro(res.statusText));
});*/