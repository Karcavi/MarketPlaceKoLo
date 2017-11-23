(function ($) {
    $(document).ready(function () {
        $.ajax({
            url: '/marketkolo/api/clientes',
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {

//funcion conectar
            $('#conectar').on('click', function () {
                sessionStorage.setItem("NombreUsuario", $('#usuario').val());
                localStorage.setItem("NombreUsuarioo", $('#usuario').val());
                var usuario = sessionStorage.getItem("NombreUsuario");
                var usuarioo = localStorage.getItem("NombreUsuarioo");
                document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar:" + usuario;
//                document.getElementById("btnDesconectar").textContent = "Desconecta";
//                alertify.success('Usuario ' + usuario + ' creado');
            });

//funcion desconectar
            $('#desconectar').on('click', function () {
                var usuario = sessionStorage.getItem("NombreUsuario");
                var usuarioo = localStorage.getItem("NombreUsuarioo");
                if (usuario != null) {
                    sessionStorage.removeItem("NombreUsuario");
                    localStorage.removeItem("NombreUsuarioo");
                    document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//                    alertify.warning('Usuario cerrado');
                } else {
//                    alertify.error('No hay nadie conectado');
                }

            });

            console.log(data);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });

    $(document).ready(function () {

        var usuario = sessionStorage.getItem("NombreUsuario");
        if (usuario != null) {
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar:" + usuario;
        } else {
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
        }
    });



})(jQuery);


