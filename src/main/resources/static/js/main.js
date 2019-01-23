$(document).ready(function(){


    $.getJSON("/pasajeros", function( dataResult ){
        console.log(dataResult)

        var pasajerosData;
        $.each(dataResult, function(value){
            pasajerosData += '<tr>';
            pasajerosData += '<th scope="row">' + value.idBoleto + '</th>'
            pasajerosData += '<th>' + value.nombre + '</th>';
            pasajerosData += '<th>' + value.asiento + '</th>';
            pasajerosData += '<th>' + value.vuelo.idVuelo + '</th>';
            pasajerosData += '</tr>';
        })

        $('#pasajeroTable').append(pasajerosData);
    })

});

