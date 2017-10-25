(function ($){
    
   $(document).ready(function(){
       
       $.ajax({
          url:'/Prueba1/api/festivales',
          method: 'GET',
          contentType: 'application/json', 
          dataType: 'json'
           
       }) .done(function(data){
           for(var i=0; i<data.length; i++){
               var tableRow = $('<tr>');
               //Td Table Division
               var nombreFestival = $('<td>');
               nombreFestival.text(data[i].nombre);
               var patrocinador = $('<td>');
               patrocinador.text(data[i].patrocinador);
               var duracionDias = $('<td>');
               duracionDias.text(data[i].duracionDias);
               //acciones de la tupla
               var acciones = $('<td>');
               //Agregar una clase a la creación del botón
               var botonEliminar = $('<button>').addClass('btn btn-danger');
               // Tipo de atributo data crea un atributo para el transporte de datos en formato texto
               // Se puede llamar data-"cualquier-nombre"
               botonEliminar.text('Eliminar').attr('data-id', data[i].id);
               var botonActualizar = $('<a>').addClass('btn btn-primary');
               botonActualizar.text('Actualizar');
               
               botonEliminar.click(eliminar);
               
               acciones.append(botonEliminar);
               acciones.append(botonActualizar);              
               
               //Agregar las columnas a la fila
               tableRow.append(nombreFestival);
               tableRow.append(duracionDias);
               tableRow.append(patrocinador);
               tableRow.append(acciones);
               
               $('#tablaFestivales table tbody').append(tableRow);
               
           }
           console.log(data);
       }).fail(function(xhrm, status, error){
          console.log(error); 
       });
       
   }); 
   
   function eliminar(event){
       $.ajax({
           url:'/Prueba1/api/festivales/'+$(this).attr('data-id'),
           method:'DELETE',
           contentType: 'application/json',
           dataType: 'json'
       }).done(function(data){
           console.log('Eliminar');
      }).fail(function(xhr, status, error){
          console.log(error);
       });
      
   }
    
})(jQuery);
