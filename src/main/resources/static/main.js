/**
*
*/
$('document').ready(function() {
$('.table .btn').on('click',function(event){
    event.preventDefault();
    var href = $(this).attr('href');
    $.get(href, function(room,status){
    $('#room_numberEdit').val(room.roomId);
    $('#room_typeEdit').val(room.roomType);
    $('#number_bedsEdit').val(room.number_beds)
    }

    $('#editModal').modal();

});
});