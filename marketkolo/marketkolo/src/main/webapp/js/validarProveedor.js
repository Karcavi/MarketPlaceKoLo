(function ($) {
    $(document).ready(function () {
        $.ajax({
            url: '/marketkolo/api/proveedores',
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {

//funcion conectar
            $('#conectarpro').on('click', function () {
//                sessionStorage.setItem("NombreUsuario", $('#usuario').val());
//                localStorage.setItem("NombreUsuarioo", $('#usuario').val());
                var usupro = ($('#usuariopro').val());
                var clavepro = ($('#clavepro').val());               
                for (var i = 0; i < data.length; i++) {
                    var datausupro = (data[i].nitProveedor);
                    var dataclavepro = (data[i].claveProveedor);
                    if (datausupro == usupro) {
                        sessionStorage.setItem("NombreProveedor", (data[i].nombreProveedor));
                        var usuario = sessionStorage.getItem("NombreProveedor");
                        if (dataclavepro == clavepro) {                            
                            sessionStorage.setItem("IdProveedor", (data[i].idProveedor));                            
                            var idpro = sessionStorage.getItem("IdProveedor");                            
                            var claveProv = (data[i].claveProveedor);
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
                if (claveProv == null) {
                    alertify.warning('La contraseña no es correcta');
                }

//                document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar";
//                document.getElementById("btnDesconectar").textContent = "Desconecta";
//                alertify.success('Usuario ' + usuario + ' creado');
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

            console.log(data);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });

   $(document).ready(function () {

        var usuario = sessionStorage.getItem("NombreUsuario");
        var usupro = sessionStorage.getItem("NombreProveedor");
        if (usuario != null) {
            document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='#'><i class='fa fa-unlock fa-2x' aria-hidden='true'></i> Bienvenido " + usuario + "</a>";
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar" ;
        } 
        if (usupro != null) {
            document.getElementById("IniSes").innerHTML = "<a class='nav-link'  href='#'><i class='fa fa-unlock fa-2x' aria-hidden='true'></i> Bienvenido " + usupro + "</a>";
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar";
        }else {
            document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
        }
    });



})(jQuery);


