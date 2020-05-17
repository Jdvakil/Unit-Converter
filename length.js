$(document).ready(function () {
    $('.conv').hide();
    $('#kmSub').hide();
    $("#kmNum").keyup(function () {
        if ($(this).val().length > 0) {
            $('#kmSub').width($('#kmNum').width());
            $("#kmSub").slideDown(1000);
            $("#kmSub").html(function () {
                return "Submit" + " <i class='fa fa-spinner fa-spin'>";
            });
        }
        else {
            $("#kmSub").hide(1000);
        }
    });
    $('#kmSub').click(function () {
        //change button stats
        $("#kmSub").html(function () {
            return "Submit" + "<i class='fas fa-check-circle'></i>";
        });
        setTimeout(hideF, 1000);
        function hideF() {
            $('#kmSub').hide(1000);
        }
        if ($('#kmNum').val() == '') {
            alert('Km cannot be empty please enter a valid number')
        } else {
            $('#kmEmpty').empty();
            $('#kmConv').slideDown(1000, function () {
                let km = $('#kmNum').val();
                $('#kmEmpty').append(km + " Kilometers(km) = " + (km * 1000) + " Meters(m). <br>");
                $('#kmEmpty').append(km + " Kilometers(km) = " + (km * 100000) + " Centimeters(cm). <br>");
                $('#kmEmpty').append(km + " Kilometers(km) = " + (km * 1e+6) + " Millimeters(mm). <br>");
                $('#kmEmpty').append(km + " Kilometers(km) = " + (km * 1000) + " Meters(m). <br>");
                $('#kmEmpty').append(km + " Kilometers(km) = " + (km * 1000) + " Meters(m). <br>");
                $('#kmEmpty').append(km + " Kilometers(km) = " + (km * 1000) + " Meters(m). <br>");

            });
        }
    });
    $('#kmUp').click(function () {
        $('#kmUp').css('cursor', 'pointer');
        $('#kmConv').slideUp(1000, function () {
            $('#kmEmpty').empty();
        });
    });
});