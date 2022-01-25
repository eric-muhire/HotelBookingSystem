/**
*
*/
$('document').ready(function() {
$('.table .btn').on('click',function(event){
    event.preventDefault();
    var href = $(this).attr('href');
    $.get(href, function(room,status){
    $('#roomIdEdit').val(room.roomId)
    $('#room_numberEdit').val(room.room_number);
    $('#room_typeEdit').val(room.roomType);
    $('#number_bedsEdit').val(room.number_beds)
    }

    $('#editModal').modal();

});
$('.table #deleteButton').on('click',function(event){
    event.preventDefault();
    var href = $(this).attr('href');
    $('#deleteModal #delRef').attr('href',href);
    $('#deleteModal').modal();
});
});