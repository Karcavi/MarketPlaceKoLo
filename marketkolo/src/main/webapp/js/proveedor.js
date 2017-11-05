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
               //Td Table division
               var nombreProveedor = $('<td>');
               nombreProveedor.text(data[i].nombre);
               var ciudadProveedor = $('<td>');
               ciudadProveedor.text(data[i].ciudad);
               var rutaFoto = $('<td>');
               rutaFoto.text(data[i].rutaFoto);
               var ventasProveedor = $('<td>');
               ventasProveedor.text(data[i].ventas);
               var reputacionProveedor = $('<td>');
               reputacionProveedor.text(data[i].reputacion);
               var telefonoProveedor = $('<td>');
               telefonoProveedor.text(data[i].telefono);
               var urlChat = $('<td>');
               urlChat.text(data[i].urlChat);
               var direccionAtencion = $('<td>');
               direccionAtencion.text(data[i].direccion);
               
               
               //acciones de la tupla
               var acciones = $('<td>');
               //Agregar una clase a la creación del boton
               var botonEliminar = $('<button>').addClass('btn btn-danger');
               // Tipo de atributo data. Crea un atributo para el transporte de datos
               // En formato texto y se puede llamar data-"cualquierNombre"
               botonEliminar.text('Eliminar').attr('data-id', data[i].id);
               var botonActualizar = $('<a href="/marketkolo/crearProveedor.html?id='+ data[i].id +'">').addClass('btn btn-info');
               botonActualizar.text('Actualizar');               
               botonEliminar.click(eliminar);               
               acciones.append(botonEliminar);
               acciones.append(botonActualizar);               
               //Agregar las columnas a la fila
               tableRow.append(nombreProveedor);
               tableRow.append(ciudadProveedor);
               tableRow.append(rutaFoto);
               tableRow.append(ventasProveedor);               
               tableRow.append(reputacionProveedor); 
               tableRow.append(telefonoProveedor); 
               tableRow.append(urlChat); 
               tableRow.append(direccionAtencion); 
               $('#tableProveedores table tbody').append(tableRow);
            }
           console.log(data);
      }).fail(function(xhr, status, error){
         console.log(error); 
      });
   });
   
   function eliminar(event){
       $.ajax({
           url:'/marketkolo/api/proveedores/'+$(this).attr('data-id'),
           method: 'DELETE',
           contentType: 'application/json',
           dataType: 'json'
       }).done(function(data){
           window.location.href = '/marketkolo';
           console.log('Proveedor Eliminado');
       }).fail(function(xhr,status, error){
           console.log(error);
       });
   }
})(jQuery);


