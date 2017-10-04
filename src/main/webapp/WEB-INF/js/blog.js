// blog
(function ($) {
    $(document).ready(function () {
        var child = $('#warp-content').children();
        // console.log(child.length);
        var slideHeight = 250;
        var n = child.length;
        var currHeight = 0;
        var pos = -1;
        for (var i = 0; i < n; i++) {
            currHeight += $(child[i]).height();
            // console.log(currHeight);
            if (currHeight > slideHeight) {
                pos = i;
                break;
            }
        }
        // console.log(pos);
        if (pos !== -1) {
            for (var i = pos + 1; i < n; i++) {
                $(child[i]).fadeOut();
            }
            var tmpHeight = slideHeight - (currHeight - $(child[pos]).height());
            var tt = $(child[pos]).height();
            $(child[pos]).css('height', tmpHeight + 'px');
            console.log(tt);
            $('#warp-content').append('<nav><ul class="pager"><li><a href="javascript:void(0);" id="read-more-button">Read more</a></li></ul></nav>');
            $('#read-more-button').click(function () {
                $(child[pos]).css('height', tt + 'px');
                $('#read-more-button').remove();
                for (var i = pos + 1; i < n; i++) {
                    $(child[i]).fadeIn();
                }
                return false;
            });
        }
    });
})(jQuery);