(function ($) {

    $(document).ready(function () {
        var usuario = sessionStorage.getItem("NombreUsuario");
        var idusuario = sessionStorage.getItem("IdUsuario");
        console.log(idusuario);
        if (usuario != null) {
            document.getElementById("Carro").innerHTML = "<a class='nav-link' style='color: #5bc0de;' href='#'><i class='fa fa-shopping-cart fa-2x' aria-hidden='true'></i>  Carrito</a> ";
            document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='#'><i class='fa fa-unlock fa-2x' aria-hidden='true'></i>  Bienvenido " + usuario + "</a>";
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar";
//            alertify.success('Usuario conectado');
//          alertify.success('Usuario '+usuario); 
        } else {
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//          alertify.error('No hay nadie conectado');
        }
    });

//funcion desconectar
            $('#desconectar').on('click', function () {
                var usuario = sessionStorage.getItem("NombreUsuario");
                ;
//                var usuarioo = localStorage.getItem("NombreUsuarioo");
                if (usuario != null ) {
                    sessionStorage.removeItem("NombreUsuario");
                    sessionStorage.removeItem("IdUsuario");
//                    localStorage.removeItem("NombreUsuarioo");
                    document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//                    alertify.warning('Usuario cerrado');
                    alertify.success('Usuario desconectado');
                    document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='inicioSesion.html'><i class='fa fa-lock fa-2x' aria-hidden='true'></i>  Ingreso y Registro</a>";
                } else {
//                    alertify.error('No hay nadie conectado');
                }

            });

})(jQuery);