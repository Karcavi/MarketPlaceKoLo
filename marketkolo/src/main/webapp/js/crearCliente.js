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
            var tipoDocumento = $('#tipoDocumento').val(data.idCliente);
            var nombre = $('#nombre').val(data.nombre);
            var patrocinador = $('#patrocinador').val(data.patrocinador);
            var duracionDias = $('#duracionDias').val(data.duracionDias);
            var id = data.id;

            $('#crearButton').text('Actualizar Festival').click(function (event) {
                var nombre = $('#nombre').val();
                var patrocinador = $('#patrocinador').val();
                var duracionDias = $('#duracionDias').val();
                $.ajax({
                   url: '/Prueba1/api/festivales/'+id,
                   method: 'PUT',
                   contentType: 'application/json',
                   data: JSON.stringify({
                      nombre: nombre,
                      patrocinador: patrocinador,
                      duracionDias: duracionDias,
                      id: id
                   }),                   
                   dataType: 'json'
                }).done(function(data){
                    window.location.href = '/Prueba1';
                }).fail(function(xhr, status, error){
                    console.log(error);
                });
            });
        }).fail(function (xhr, status, error) {

        });
    } else {
        //Codigo de crear
        $('#crearButton').click(function (event) {
            var nombre = $('#nombre').val();
            var duracionDias = $('#duracionDias').val();
            var patrocinador = $('#patrocinador').val();

            $.ajax({
                url: '/Prueba1/api/festivales',
                method: 'POST',
                data: JSON.stringify({
                    nombre: nombre,
                    duracionDias: duracionDias,
                    patrocinador: patrocinador
                }),
                contentType: 'application/json',
                dataType: 'json'
            }).done(function (data) {
                window.location.href = '/Prueba1';
            }).fail(function (xhr, status, error) {
                console.log(error);
            });
        });
    }



})(jQuery);

