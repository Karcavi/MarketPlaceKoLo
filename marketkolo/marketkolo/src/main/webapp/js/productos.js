(function ($) {
    $(document).ready(function () {
        $.ajax({
            url: '/marketkolo/api/productos',
            method: 'GET',
            contentType: 'application/json',
            dataType: 'json'
        }).done(function (data) {
            for (var i = 0; i < data.length; i++) {
                //Td Table divition
                
                var Producto = $('<tr>');
                Producto.html('<td align="center"><div class="card-body"><h6 class="card-subtitle">' + data[i].nombreProducto + '</h6></div><img style="height: 100px; width: 150px; display: block;" src="' + data[i].imagenProducto + '" alt="Card image"><div class="card-body"><p class="card-text">$' + data[i].valorUnitario + '</p></div></div></td>');
                var Comprar = $('<button>').addClass('btn btn-info');;
                Comprar.text('Comprar').attr('producto', data[i]);
                Comprar.click(comprarProducto);  

                $('#tableProductos table tbody').append(Producto, Comprar);
            }


            console.log(data);
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });

    function comprarProducto(producto) {
        $.ajax({
           url:'/marketkolo/api/productos/'+$(this).attr('producto'),
           contentType: 'application/json',
           dataType: 'json'
       })
        console.log('Entro: ' + producto.idProducto);
        if (producto) {
            //Alamcenar variable en cache
            var carrito = localStorage.getItem('carrito');
            //Verificar que exista un carrito
            if (carrito) {
                carrito = JSON.parse(carrito)
            } else {
                //Si no existe se crea el carrito
                carrito = [];
            }
            //Verificar si una producto ya existe en el carrito
            var prod = carrito.filter(function (val) {
                return val.producto.idProducto === producto.idProducto;
            })[0];

            //Si el producto existe se actualiza la cantidad
            if (prod) {
                prod.cantidad++;
            } else {
                //Si no existe el producto lo creamos
                prod = {producto: producto, cantidad: 0};
                prod.cantidad = 1;
                carrito.push(prod);
            }
            console.log(carrito);
            //Guardar el carrito en cache
            localStorage.setItem('carrito', JSON.stringify(carrito));
        }
    

    }
    ;
//   function eliminar(event){
//       $.ajax({
//           url:'/marketkolo/api/clientes/'+$(this).attr('data-id'),
//           method: 'DELETE',
//           contentType: 'application/json',
//           dataType: 'json'
//       }).done(function(data){
//           window.location.href = '/marketkolo';
//           console.log('Cliente Eliminado');
//       }).fail(function(xhr,status, error){
//           console.log(error);
//       });
//   }

})(jQuery);

