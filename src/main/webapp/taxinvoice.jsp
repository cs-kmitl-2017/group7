<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> e-Tax Invoice </title>
        <jsp:include page="shared/header.jsp" />
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-md-center">
                <div class="col-12 col-md-auto">
                    <h1><strong> e-Tax Invoice Generate </strong></h1>
                    <small> Please input all field.</small>
                    <hr>
                    <div id="userType">
                        <fieldset class="form-group row">
                            <legend class="col-form-legend col-md-4">ประเภทบุคคล</legend>
                            <div class="col-md-12">
                                <label class="custom-control custom-radio">
                                    <input type="radio" id="userTypeRadio" name="userTypeRadio" value="sellerType" class="custom-control-input" checked>
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Seller (ผู้ซื้อ)</span>
                                </label><br>
                                <label class="custom-control custom-radio">
                                    <input type="radio" id="userTypeRadio" name="userTypeRadio" value="buyerType" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Buyer (ผู้ขาย)</span>
                                </label>
                            </div>
                        </fieldset>
                        <hr>
                        <div class="text-center">
                            <button onClick="showFieldUserType(true)" type="button" class="btn btn-success">Next</button> 
                        </div>
                    </div>
                    <div id="buyerType">
                        <div class="form-group row">
                            <div class="col-4 col-form-label">รหัสผู้ค้า</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="id" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">รหัสผู้ค้าสากล</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="globalId" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">ชื่อผู้ขาย</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="name" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">เลขประจำตัวผู้เสียภาษีอากร</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="taxId" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">อีเมล</div>
                            <div class="col-8">
                                <input class="form-control" type="email" name="uriId" required>
                            </div>
                        </div>
                        <hr>
                        <div class="text-center">
                            <button onClick="showAddress(true)" type="button" class="btn btn-success">Next</button>
                        </div>
                    </div>
                    <div id="sellerType">
                        <div class="form-group row">
                            <div class="col-4 col-form-label">รหัสผู้ค้า</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="id" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">รหัสผู้ค้าสากล</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="globalId" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">ชื่อผู้ซื้อ</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="name" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">เลขประจำตัวผู้เสียภาษีอากร</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="taxId" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-4 col-form-label">อีเมล</div>
                            <div class="col-8">
                                <input class="form-control" type="email" name="uriId" required>
                            </div>
                        </div>
                        <hr>
                        <div class="text-center">
                            <button onClick="showAddress(true)" type="button" class="btn btn-success">Next</button> 
                        </div>
                    </div>
                    <div id="address">
                        <div class="form-group row">
                            <div class="col-2 col-form-label">ที่อยู่ 1</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="lineOne" required> 
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">ที่อยู่ 2</div>
                            <div class="col-8">
                                <input class="form-control" type="text" name="lineTwo">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">บ้านเลขที่</div>
                            <div class="col-2">
                                <input class="form-control" type="text" name="name" required>
                            </div>
                            <div class="col-1 col-form-label text-right">หมู่ที่</div>
                            <div class="col-2">
                                <input class="form-control" type="text" name="lineFive" required>
                            </div>
                            <div class="col-1 col-form-label text-right">ซอย</div>
                            <div class="col-2">
                                <input class="form-control" type="text" name="lineThree" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">ชื่ออาคาร</div>
                            <div class="col-3">
                                <input class="form-control" type="text" name="buildingName" required>
                            </div>     
                            <div class="col-2 col-form-label text-right">หมู่บ้าน</div>
                            <div class="col-3">
                                <input class="form-control" type="text" name="lineFour" required>
                            </div> 
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">ถนน</div>
                            <div class="col-5">
                                <input class="form-control" type="text" name="streetName" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">ตำบล</div>
                            <div class="col-4 dropdown">
                                <button class="btn btn-secondary dropdown-toggle w-75" type="button" name="citySubDivisionName" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    --- เลือกตำบล ---
                                </button>
                                <div class="dropdown-menu">
                                    <c:forEach items="${citySubDivision}" var="citySubDivision">
                                        <option value="${citySubDivision.id}"><c:out value="${citySubDivision.name}" /></option>
                                    </c:forEach>
                                </div>
                            </div>
                            <div class="col-2 col-form-label text-right">อำเภอ</div>
                            <div class="col-3">
                                <div class="dropdown">
                                    <button class="btn btn-secondary dropdown-toggle" type="button" name="cityName" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        --- เลือกอำเภอ ---
                                    </button>
                                    <div class="dropdown-menu">
                                        <c:forEach items="${cityName}" var="city">
                                            <option value="${cityName.id}"><c:out value="${cityName.name}" /></option>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div> 
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">จังหวัด</div>
                            <div class="col-4 dropdown w-100">
                                <button class="btn btn-secondary dropdown-toggle w-100" type="button" name="countrySubDivisionName" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    --- เลือกจังหวัด ---
                                </button>
                                <div class="dropdown-menu">
                                    <c:forEach items="${countrySubDivisionName}" var="countrySubDivision">
                                        <option value="${countrySubDivisionName.id}"><c:out value="${countrySubDivisionName.name}" /></option>
                                    </c:forEach>
                                </div>
                            </div>
                            <div class="col-2 col-form-label text-right">รหัสไปรษณีย์</div>
                            <div class="col-2">
                                <input class="form-control" type="text" name="postCode" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2 col-form-label">ประเทศ</div>
                            <div class="col-10 dropdown w-100">
                                <button class="btn btn-secondary dropdown-toggle w-50" type="button" name="countryName" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    --- เลือกประเทศ ---
                                </button>
                                <div class="dropdown-menu">
                                    <c:forEach items="${countryName}" var="country">
                                        <option value="${countryName.id}"><c:out value="${countryName.name}" /></option>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="text-center">
                            <button type="button" class="btn btn-success">Send</button> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="shared/script.jsp" />
        <script><jsp:include page="js/main.js" /></script>
    </body>
</html>
