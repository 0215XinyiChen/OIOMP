
function test(id) {
    //alert(id);
    var pageUrl=document.getElementById("content");
    switch (id) {
        case "test1":pageUrl.src("../views/test1.jsp");alert(id);break;
        case "test2.1":pageUrl.src("../views/test2-1.jsp");alert(id);break;
    }
}

$( "li" ).hover(
    function() {
        $(this).find("a").css("color","#FFF");
        $(this).find("span").stop().animate({
            width:"100%",
            opacity:"1",
        }, 600, function () {
            // Animation complete.
            // Show Navigation
        })
    }, function() {
        $(this).find("a").css("color","#555");
        $(this).find("span").stop().animate({
            width:"0%",
            opacity:"0",
        }, 600, function () {
            // Animation complete.
            // Show Navigation
        })
    }
);

/*
$( "i" ).click(function () {
    var item = $(this).href;
    alert("var");
    if(item=="1"){
        alert("var");
    }
    else if(item=="2"){
        alert("var");
    }
})*/
