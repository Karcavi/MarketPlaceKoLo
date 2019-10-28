(function ($) {

    $(document).ready(function () {
        var usupro = sessionStorage.getItem("NombreProveedor");
        var idusuariopro = sessionStorage.getItem("IdProveedor");
        console.log(idusuariopro);
        if (usupro != null) {
            document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='#'><i class='fa fa-unlock fa-2x' aria-hidden='true'></i>  Bienvenido " + usupro + "</a>";
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar";
            document.getElementById("crearProducto").innerHTML = '<center><a href="crearProducto.html" class="button btn btn-success">Crear Producto</a></center>';
//            alertify.success('Usuario conectado');
//          alertify.success('Usuario '+usuario); 
        } else {
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//          alertify.error('No hay nadie conectado');
        }
    });

//funcion desconectar
            $('#desconectar').on('click', function () {
                var usupro = sessionStorage.getItem("NombreProveedor");
                sessionStorage.removeItem("IdProveedor");
//                var usuarioo = localStorage.getItem("NombreUsuarioo");
                if (usupro != null) {
                    sessionStorage.removeItem("NombreProveedor");
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