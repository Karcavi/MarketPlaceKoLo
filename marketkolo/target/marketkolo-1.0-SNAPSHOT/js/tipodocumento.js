(function ($) {
    $(document).ready(function () {
        $.ajax({
            url: '/marketkolo/api/tipoDocumentos',
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {
            for (var i = 0; i < data.length; i++) {
                var nombreTipoDocumento = $('<option value="'+data[i].nomTipoDocumento+'">');
                nombreTipoDocumento.text(data[i].nomTipoDocumento);
                $('#TiposDocumentos select').append(nombreTipoDocumento);
            }
            console.log(data);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });
})(jQuery);