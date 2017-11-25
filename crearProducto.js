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
            url: '/marketkolo/api/productos/' + getUrlParameter('idProducto'),
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {
            var idProducto = $('#idProducto').val(data.idProducto);
            var nombreProducto = $('#nombreProducto').val(data.nombreProducto);
            var valorUnitario = $('#valorUnitario').val(data.valorUnitario);
            var marcaProducto = $('#marcaProducto').val(data.marcaProducto);
            var garantiaProducto = $('#garantiaProducto').val(data.garantiaProducto);
            var stockProducto = $('#stockProducto').val(data.stockProducto);
            var imagenProducto = $('#imagenProducto').val(data.imagenProducto);
           

            $('#crearButton').text('Actualizar Cliente').click(function (event) {
                var idProducto = $('#idProducto').val();
                var nombreProducto = $('#nombreProducto').val();
                var valorUnitario = $('#valorUnitario').val();
                var marcaProducto = $('#marcaProducto').val();
                var garantiaProducto = $('#garantiaProducto').val();
                var stockProducto = $('#stockProducto').val();
                var imagenProducto = $('#imagenProducto').val();
                $.ajax({
                    url: '/marketkolo/api/productos/' + idProducto,
                    method: 'PUT',
                    contentType: 'application/json',
                    data: JSON.stringify({
                        idProducto: idProducto,
                        nombreProducto: nombreProducto,
                        valorUnitario: valorUnitario,
                        marcaProducto: marcaProducto,
                        garantiaProducto: garantiaProducto,
                        stockProducto: stockProducto,
                        imagenProducto: imagenProducto
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
        $('#crearProducto').click(function (event) {
            console.log("Crear");
//            console.log($('#idtipoDocumento').val());
            var idProducto = $('#idProducto').val();
            var nombreProducto = $('#nombreProducto').val();
            var valorUnitario = $('#valorUnitario').val();
            var marcaProducto = $('#marcaProducto').val();
            var garantiaProducto = $('#garantiaProducto').val();
            var stockProducto = $('#stockProducto').val();
            var imagenProducto = $('#imagenProducto').val();

            $.ajax({
                url: '/marketkolo/api/proveedores',
                method: 'POST',
                data: JSON.stringify({
                    idProducto: idProducto,
                    nombreProducto: nombreProducto,
                    valorUnitario: valorUnitario,
                    marcaProducto: marcaProducto,
                    garantiaProducto: garantiaProducto,
                    stockProducto: stockProducto,
                    imagenProducto: imagenProducto

                }),
                contentType: 'application/json',
                dataType: 'json'
            }).done(function (data) {
                alertify.success('Producto creado');
                window.location.href = '/marketkolo/productos.html';
            }).fail(function (xhr, status, error) {
                console.log(error);
            });
        });
    }



})(jQuery);

