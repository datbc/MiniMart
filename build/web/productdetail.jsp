<%-- 
    Document   : productdetail
    Created on : Mar 7, 2021, 3:33:29 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>

    <body>

        <jsp:include page="navigation.jsp" />
        <main class="mt-5 pt-4">
            <div class="container dark-grey-text mt-5">

                <!--Grid row-->
                <div class="row wow fadeIn">

                    <!--Grid column-->
                    <div class="col-md-4 mb-4">

                        <img  src="${product.getImage()}" class="img-fluid" alt="">

                    </div>
                    <!--Grid column-->

                    <!--Grid column-->
                    <div class="col-md-6 mb-4">

                        <!--Content-->
                        <div class="p-4">

                            <div class="mb-3">
                                
                                    <span class="badge purple mr-1">${product.getCategoryName()}</span>
                                
                                
                            </div>
                            <p class="lead">
                                <span>$100</span>
                            </p>

                            <p class="lead font-weight-bold">${product.getName()}</p>

                            <p>${product.getDes()}</p>

                            <form class="d-flex justify-content-left" method="post" action="Cart">
                                <!-- Default input -->
                                <input type="hidden" name="productId" value="${product.getId()}">
                                <input name="count" type="number" value="1" min="1" aria-label="Search" class="form-control" style="width: 100px">
                                <button class="btn btn-primary btn-md my-0 p" type="submit">Add to cart
                                    <i class="fas fa-shopping-cart ml-1"></i>
                                </button>

                            </form>

                        </div>
                        <!--Content-->

                    </div>
                    <!--Grid column-->

                </div>
                <!--Grid row-->

                <hr>

                <!--Grid row-->
                

            </div>
        </main>
        <jsp:include page="footer.jsp"/>
        
    </body>
    
</html>
