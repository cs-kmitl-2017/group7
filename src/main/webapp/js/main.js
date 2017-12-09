$('#buyerType').hide();
$('#sellerType').hide();
$('#address').hide();

function showFieldUserType(isClick) {
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

