$('.hamburger-button').click(function(){
    $('.mobile-menu').fadeToggle(100);
    $(this).toggleClass('active');
  });




jQuery(document).ready(function($) {
    $('.image img').click(function(event) {
        // detect data-id for later
        var id = $(this).data('id');
        // grab src to replace #featured
        var src = $(this).attr('src');
        // set featured image
        var img = $('#featured img');

        img.fadeOut('fast', function() {
            $(this).attr({src: src,});
            $(this).fadeIn('fast');
        });
    });
});


<script sec="/main.js"></script>






$(document).ready(function() {

    // This is the pop-up gallery
    $('[data-fancybox="gallery"]').fancybox({
      protect: true,
      keyboard: true,
      arrows: true,
      infobar: false,
      buttons: [
      "close"
      ],
    });
  
  });
  