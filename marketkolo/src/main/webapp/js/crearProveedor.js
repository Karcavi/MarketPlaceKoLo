(function ($) {
   
    var getUrlParameter = function getUrlParameter(sParam) {
        var sPageURL = decodeURIComponent(window.location.search.substring(1)),
                sUrlVariable = sPageURL.split('&'),
                sParameterName,
                i;
        for (i = 0; i < sUrlVariable.length; i++) {
            sParameterName = sUrlVariable[i].split('=');
            if (sParameterName[0] === sParam) {
                return sParameterName[1] === undefined ? true : sParameterName[1];
            }
        }
    };
    if (getUrlParameter('id')) {
        //Código de actualizar
        $.ajax({
            url: '/marketkolo/api/proveedores/' + getUrlParameter('id'),
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {
            var idProveedor = $('#numeroDocumento').val(data.idProveedor);
            var nombre = $('#nombre').val(data.nombre);
            var ciudad = $('#ciudad').val(data.ciudad);
            var rutaFoto = $('#rutaFoto').val(data.rutaFoto);
            var ventas = $('#ventas').val(data.ventas);
            var reputacion = $('#reputacion').val(data.reputacion);
            var telefono = $('#telefono').val(data.telefono);
            var urlChat = $('#urlChat').val(data.urlChat);
            var direccion = $('#direccion').val(data.direccion);


            $('#crearButton').text('Actualizar Proveedor').click(function (event) {
                var idProveedor = $('#numeroIdentificacion').val();
                var nombre = $('#nombre').val();
                var ciudad = $('#ciudad').val();
                var rutaFoto = $('#rutaFoto').val();
                var ventas = $('#ventas').val();
                var reputacion = $('#reputacion').val();
                var telefono = $('#telefono').val();
                var urlChat = $('#urlChat').val();
                var direccion = $('#direccion').val();
                $.ajax({
                    url: '/marketkolo/api/proveedores/' + idProveedor,
                    method: 'PUT',
                    contentType: 'application/json',
                    data: JSON.stringify({
                        nombre: nombre,
                        ciudad: ciudad,
                        rutaFoto: rutaFoto,
                        ventas: ventas,
                        reputacion: reputacion,
                        telefono: telefono,
                        urlChat: urlChat,
                        direccion: direccion,
                    }),
                    dataType: 'json'
                }).done(function (data) {
                    window.location.href = '/marketkolo';
                }).fail(function (xhr, status, error) {
                    console.log(error);
                });
            });
        }).fail(function (xhr, status, error) {

        });
    } else {
        //Código de crear
        $('#crearButton').click(function (event) {
            var idProveedor = $('#ID Proveedor').val();
            var nombre = $('#nombre').val();
            var ciudad = $('#ciudad').val();
            var nombre = $('#nombre').val();
            var rutaFoto = $('#rutaFoto').val();
            var ventas = $('#ventas').val();
            var reputacion = $('#reputacion').val();
            var telefono = $('#telefono').val();
            var urlChat = $('#urlChat').val();
            var direccion = $('#direccion').val();
            
            $.ajax({
                url: '/marketkolo/api/proveedores',
                method: 'POST',
                data: JSON.stringify({

                    id: idProveedor,
                    nombre: nombre,
                    ciudad: ciudad,
                    nombre: nombre,
                    rutaFoto: rutaFoto,
                    ventas: ventas,
                    reputacion: reputacion,
                    telefono: telefono,
                    urlChat: urlChat,
                    direccion: direccion
                }),
                contentType: 'application/json',
                dataType: 'json'
            }).done(function (data) {
                window.location.href = '/marketkolo';
            }).fail(function (xhr, status, error) {
                console.log(error);
            });
        });
    }
})(jQuery);


