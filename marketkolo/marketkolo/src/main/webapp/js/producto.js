(function($){
   $(document).ready(function(){
      $.ajax({
         url:'/marketkolo/api/productos',
         method: 'GET',
         contentType: 'application/json',
         dataType: 'json'
      }).done(function(data){
           for(var i=0; i<data.length; i++){
               var tableRow = $('<tr>');
               //Td Table divition
               var idProducto = $('<td>');
               idProducto.number(i+1);
               var nombreProducto = $('<td>');
               nombreProducto.text(data[i].nombreProducto);
               var valorUnitario = $('<td>');
               valorUnitario.number(data[i].valorUnitario);
               var marcaProducto = $('<td>');
               marcaProducto.text(data[i].marcaProducto);
               var garantiaProducto = $('<td>');
               garantiaProducto.number(data[i].garantiaProducto);
               var stockProducto = $('<td>');
               stockProducto.number(data[i].stockProducto);
               var imagenProducto = $('<td>');
               imagenProducto.text(data[i].imagenProducto);
               
               //acciones de la tupla
               var acciones = $('<td>');
               //Agregar una clase a la creación del boton
               var botonEliminar = $('<button>').addClass('btn btn-danger');
               // Tipo de atributpo data crea un atributo para el transporte de datos
               // en formato texto y se puede llamar data-"cualquierNombre"
               botonEliminar.text('Eliminar').attr('data-id', data[i].id);
               var botonActualizar = $('<a href="/marketkolo/crearProducto.html?id='+ data[i].id +'">').addClass('btn btn-info');
               botonActualizar.text('Actualizar');               
               botonEliminar.click(eliminar);               
//               acciones.append(botonEliminar);
//               acciones.append(botonActualizar);               
               //Agregar las columnas a la fila
               tableRow.append(idProducto);
               tableRow.append(nombreProducto);
               tableRow.append(valorUnitario);               
               $('#tableProductos table tbody').append(tableRow);
           }
           console.log(data);
      }).fail(function(xhr, status, error){
         console.log(error); 
      });
   });
   
   function eliminar(event){
       $.ajax({
           url:'/marketkolo/api/productos/'+$(this).attr('data-id'),
           method: 'DELETE',
           contentType: 'application/json',
           dataType: 'json'
       }).done(function(data){
           window.location.href = '/marketkolo';
           console.log('Producto Eliminado');
       }).fail(function(xhr,status, error){
           console.log(error);
       });
   }
})(jQuery);


