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
            var idCliente = $('#numeroDocumento').val(data.id);
            var nombres = $('#nombres').val(data.nombres);
            var apellidos = $('#apellidos').val(data.apellidos);
            var correo = $('#correo').val(data.correo);
            var direccion = $('#direccion').val(data.direccion);
            var telefono = $('#telefono').val(data.telefono);
            var clave = $('#clave').val(data.clave);
            

            $('#crearButton').text('Actualizar Cliente').click(function (event) {
                var idtipoDocumento = $('#idtipoDocumento').val();
                var idCliente = $('#numeroDocumento').val();
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
                        idtipoDocumento: idtipoDocumento,
                        nombres: nombres,
                        apellidos: apellidos,
                        correo: correo,
                        direccion: direccion,
                        telefono: telefono,
                        clave: clave,
                        id: idCliente
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
        //Codigo de crear
        $('#crearButton').click(function (event) {
            var idCliente = $('#numeroDocumento').val();
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
                    
                    id: idCliente,                    
                    nombres: nombres,
                    apellidos: apellidos,
                    telefono: telefono,                    
                    correo: correo,                                       
                    clave: clave,
                    direccion: direccion,  
                    idtipoDocumento: idtipoDocumento
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

