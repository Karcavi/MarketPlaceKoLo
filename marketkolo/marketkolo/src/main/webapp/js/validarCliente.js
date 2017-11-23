(function ($) {
    $(document).ready(function () {
        $.ajax({
            url: '/marketkolo/api/clientes',
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {

//funcion conectar
            $('#conectarcli').on('click', function () {
//                sessionStorage.setItem("NombreUsuario", $('#usuario').val());
//                localStorage.setItem("NombreUsuarioo", $('#usuario').val());
                var usucli = ($('#usuariocli').val());
                var clavecli = ($('#clavecli').val());               
                for (var i = 0; i < data.length; i++) {
                    var datausu = (data[i].documento);
                    var dataclave = (data[i].clave);
                    if (datausu == usucli) {
                        sessionStorage.setItem("NombreUsuario", (data[i].nombres));
                        var usuario = sessionStorage.getItem("NombreUsuario");
                        if (dataclave == clavecli) {                            
                            sessionStorage.setItem("IdUsuario", (data[i].id));                            
                            var idusuario = sessionStorage.getItem("IdUsuario");                            
                            var clave = (data[i].clave);
//                        var usuarioo = localStorage.getItem("NombreUsuarioo");                        
                            alertify.success('Usuario conectado');
                            document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='#'><i class='fa fa-unlock fa-2x' aria-hidden='true'></i> Bienvenido " + usuario + "</a>";
                            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar";
                       window.location.href = '/marketkolo'; 
                        }
                    } 
                }
                if (usuario == null) {
                    alertify.warning('El usuario no existe');
                }
                if (clave == null) {
                    alertify.warning('La contraseña no es correcta');
                }

//                document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar";
//                document.getElementById("btnDesconectar").textContent = "Desconecta";
//                alertify.success('Usuario ' + usuario + ' creado');
            });

//funcion desconectar
            $('#desconectar').on('click', function () {
                var usuario = sessionStorage.getItem("NombreUsuario");
                sessionStorage.removeItem("IdUsuario");
//                var usuarioo = localStorage.getItem("NombreUsuarioo");
                if (usuario != null) {
                    sessionStorage.removeItem("NombreUsuario");
//                    localStorage.removeItem("NombreUsuarioo");
                    document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//                    alertify.warning('Usuario cerrado');
                    alertify.success('Usuario desconectado');
                    document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='inicioSesion.html'><i class='fa fa-lock fa-2x' aria-hidden='true'></i>  Ingreso y Registro</a>";
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


