$('#buyerType').hide();
$('#sellerType').hide();
$('#address').hide();
function showField(isClick) {
    var whatType = document.getElementById("userTypeRadio").checked;
    if (isClick) {
        $('#userType').hide();
        if (whatType) {
            $('#sellerType').show();
        } else {
            $('#buyerType').show();
        }
    }
    isClick = false;
}
function showAddress(isShow) {
    if (isShow) {
        $('#address').show();
        $('#buyerType').hide();
        $('#sellerType').hide();
    }
}

