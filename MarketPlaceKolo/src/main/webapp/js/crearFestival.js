(function ($) {
    //Se usan parámetros en la url debido a que no es una Single-Page Application
    var getUrlParameter = function getUrlParameter(sParam) {
        var sPageURL = decodeURIComponent(window.location.search.substring(1)),
                sUrlVariable = sPageURL.split('&'),
                sParameterName,
                i;

        for (i = 0; i < sUrlVariable.length; i++) {
            sParameterName = sUrlVariable[i].split('=');
            if (sParameterName[0] == sParam) {
                return sParameterName[1] === undefined ? true : sParameterName[1];
            }
        }

    };

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
})(jQuery);

