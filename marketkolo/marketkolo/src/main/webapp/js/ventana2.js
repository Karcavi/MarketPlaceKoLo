(function($){
    
  $(document).ready(function(){
      var usuario = sessionStorage.getItem("NombreUsuario");
      console.log(usuario);
      if(usuario != null){
          document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectar:" + usuario;
//          alertify.success('Usuario '+usuario); 
      }
      else{
          document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//          alertify.error('No hay nadie conectado');
      }
  });    
  
  //funcion desconectar
            $('#desconectar').on('click', function () {
                var usuario = sessionStorage.getItem("NombreUsuario");
                var usuarioo = localStorage.getItem("NombreUsuarioo");
                if (usuario != null) {
                    sessionStorage.removeItem("NombreUsuario");
                    localStorage.removeItem("NombreUsuarioo");
                    document.getElementById("numDocumento").innerHTML = "<i class='fa fa-hand-o-right fa-2x' aria-hidden='true'></i>  Desconectado";
//                    alertify.warning('Usuario cerrado');
                } else {
//                    alertify.error('No hay nadie conectado');
                }

            });

})(jQuery);