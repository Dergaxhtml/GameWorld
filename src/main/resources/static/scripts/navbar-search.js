$(document).ready(() => {

    $(".navbar-search-clear").click(() => {
        $(".navbar-search").val("");
        $(".navbar-search-clear").removeClass("active");
    });

    $(".navbar-search").keyup(() => {
        if ($(".navbar-search").val().length > 0) {
            $(".navbar-search-clear").addClass("active");
        } else {
            $(".navbar-search-clear").removeClass("active");
        }
    });

});