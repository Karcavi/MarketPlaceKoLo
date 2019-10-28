(function ($) {
    //Se usan parametros en la url debido a que no es una SPA
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
        //Codigo de actualizar
        $.ajax({
            url: '/marketkolo/api/clientes/' + getUrlParameter('id'),
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {
            var idtipoDocumento = $('#idtipoDocumento').val(data.idtipoDocumento);
            var documento = $('#numeroDocumento').val(data.documento);
            var nombres = $('#nombres').val(data.nombres);
            var apellidos = $('#apellidos').val(data.apellidos);
            var correo = $('#correo').val(data.correo);
            var direccion = $('#direccion').val(data.direccion);
            var telefono = $('#telefono').val(data.telefono);
            var clave = $('#clave').val(data.clave);


            $('#crearCliente').text('Actualizar Cliente').click(function (event) {
                var idtipoDocumento = $('#idtipoDocumento').val();
                var documento = $('#numeroDocumento').val();
                var nombres = $('#nombres').val();
                var apellidos = $('#apellidos').val();
                var correo = $('#correo').val();
                var direccion = $('#direccion').val();
                var telefono = $('#telefono').val();
                var clave = $('#clave').val();
                $.ajax({
                    url: '/marketkolo/api/clientes/' + idCliente,
                    method: 'PUT',
                    contentType: 'application/json',
                    data: JSON.stringify({
                        tipoDocumento: idtipoDocumento,
                        nombres: nombres,
                        apellidos: apellidos,
                        correo: correo,
                        direccion: direccion,
                        telefono: telefono,
                        clave: clave,
                        documento: documento
                    }),
                    dataType: 'json'
                }).done(function (data) {
                    window.location.href = '/marketkolo';
                }).fail(function (xhr, status, error) {
                    console.log(error);
                });
            });
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    } else {
        //Codigo de crear        
        $('#crearCliente').click(function (event) {
            console.log("Crear");
            console.log($('#idtipoDocumento').val());
            var documento = $('#numeroDocumento').val();
            var idtipoDocumento = $('#idtipoDocumento').val();
            var nombres = $('#nombres').val();
            var apellidos = $('#apellidos').val();
            var correo = $('#correo').val();
            var direccion = $('#direccion').val();
            var telefono = $('#telefono').val();
            var clave = $('#clave').val();

            $.ajax({
                url: '/marketkolo/api/clientes',
                method: 'POST',
                data: JSON.stringify({
                    documento: documento,
                    nombres: nombres,
                    apellidos: apellidos,
                    telefono: telefono,
                    correo: correo,
                    clave: clave,
                    direccion: direccion,
                    tipoDocumentodto: {idTipoDocumento: idtipoDocumento}
                }),
                contentType: 'application/json',
                dataType: 'json'
            }).done(function (data) {
                alertify.success('Cliente creado');
                window.location.href = '/marketkolo/inicioSesion.html';
            }).fail(function (xhr, status, error) {
                console.log(error);
            });
        });
    }



})(jQuery);

