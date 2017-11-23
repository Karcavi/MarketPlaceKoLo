(function($){
   $(document).ready(function(){
      $.ajax({
         url:'/marketkolo/api/proveedores',
         method: 'GET',
         contentType: 'application/json',
         dataType: 'json'
      }).done(function(data){
           for(var i=0; i<data.length; i++){
               var tableRow = $('<tr>');
               //Td Table divition
               var numProveedor = $('<td>');
               numProveedor.text(i+1);
               var nombreProveedor = $('<td>');
               nombreProveedor.text(data[i].nombreProveedor);
               var nivelProveedor = $('<td>');
               nivelProveedor.text(data[i].nivelReputacion);
               //acciones de la tupla
//               var acciones = $('<td>');
               //Agregar una clase a la creación del boton
//               var botonEliminar = $('<button>').addClass('btn btn-danger');
               // Tipo de atributpo data crea un atributo para el transporte de datos
               // en formato texto y se puede llamar data-"cualquierNombre"
//               botonEliminar.text('Eliminar').attr('data-id', data[i].id);
//               var botonActualizar = $('<a href="/marketkolo/crearCliente.html?id='+ data[i].id +'">').addClass('btn btn-info');
//               botonActualizar.text('Actualizar');               
//               botonEliminar.click(eliminar);               
//               acciones.append(botonEliminar);
//               acciones.append(botonActualizar);               
               //Agregar las columnas a la fila
               tableRow.append(numProveedor);
               tableRow.append(nombreProveedor);
               tableRow.append(nivelProveedor);               
               $('#tableProveedores table tbody').append(tableRow);
           }
           console.log(data);
      }).fail(function(xhr, status, error){
         console.log(error); 
      });
   });
   
   function eliminar(event){
       $.ajax({
           url:'/marketkolo/api/clientes/'+$(this).attr('data-id'),
           method: 'DELETE',
           contentType: 'application/json',
           dataType: 'json'
       }).done(function(data){
           window.location.href = '/marketkolo';
           console.log('Cliente Eliminado');
       }).fail(function(xhr,status, error){
           console.log(error);
       });
   }
})(jQuery);

