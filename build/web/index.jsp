<%-- 
    Document   : index
    Created on : Mar 5, 2021, 8:44:40 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"></jsp:include>
    <body>
    <jsp:include page="navigation.jsp"></jsp:include>  
    <div id="carousel-example-1z" class="carousel slide carousel-fade pt-4" data-ride="carousel">

    <!--Indicators-->
    <ol class="carousel-indicators">
      <li data-target="#carousel-example-1z" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-example-1z" data-slide-to="1"></li>
      <li data-target="#carousel-example-1z" data-slide-to="2"></li>
    </ol>
    <!--/.Indicators-->

    <!--Slides-->
    <div class="carousel-inner" role="listbox">

      <!--First slide-->
      <div class="carousel-item active">
        <div class="view" style="background-image: url('https://images.unsplash.com/photo-1566385101042-1a0aa0c1268c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1189&q=80'); background-repeat: no-repeat; background-size: cover;">

          <!-- Mask & flexbox options-->
          <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>Shopping on my store</strong>
              </h1>

              <h5>
                <strong>Diversification of goods </strong>
              </h5>

              <h5 class="mb-4 d-none d-md-block">
                <strong>High-quality products</strong>
              </h5>

              <a target="_blank" href="#" class="btn btn-outline-white btn-lg">Start Shopping                
               
              </a>
            </div>
            <!-- Content -->

          </div>
          <!-- Mask & flexbox options-->

        </div>
      </div>
      <!--/First slide-->

      <!--Second slide-->
      <div class="carousel-item">
        <div class="view" style="background-image: url('https://images.unsplash.com/photo-1575218823251-f9d243b6f720?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'); background-repeat: no-repeat; background-size: cover;">

          <!-- Mask & flexbox options-->
          <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>Shopping on my store</strong>
              </h1>

              <h5>
                <strong>Diversification of goods</strong>
              </h5>

              <h5 class="mb-4 d-none d-md-block">
                <strong>High-quality products</strong>
              </h5>

              <a target="_blank" href="#" class="btn btn-outline-white btn-lg">Start Shopping 
                
              
              </a>
            </div>
            <!-- Content -->

          </div>
          <!-- Mask & flexbox options-->

        </div>
      </div>
      <!--/Second slide-->

      <!--Third slide-->
      <div class="carousel-item">
        <div class="view" style="background-image: url('https://images.unsplash.com/photo-1498837167922-ddd27525d352?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'); background-repeat: no-repeat; background-size: cover;">

          <!-- Mask & flexbox options-->
          <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>Shopping on my store</strong>
              </h1>

              <h5>
                <strong>Diversification of goods</strong>
              </h5>

              <h5 class="mb-4 d-none d-md-block">
                <strong>High-quality products</strong>
              </h5>

              <a target="_blank" href="#" class="btn btn-outline-white btn-lg">Start Shopping 
               
               
              </a>
            </div>
            <!-- Content -->

          </div>
          <!-- Mask & flexbox options-->

        </div>
      </div>
      <!--/Third slide-->

    </div>
    <!--/.Slides-->

    <!--Controls-->
    <a class="carousel-control-prev" href="#carousel-example-1z" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carousel-example-1z" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
    <!--/.Controls-->

  </div>
  <!--/.Carousel Wrapper-->

  <!--Main layout-->
  <main>
    <div class="container">

      <!--Navbar-->
      <nav class="navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5">

        <!-- Navbar brand -->
        <span class="navbar-brand">Categories:</span>

        <!-- Collapse button -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
          aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Collapsible content -->
        <div class="collapse navbar-collapse" id="basicExampleNav">
            
            
          <!-- Links -->
          <ul class="navbar-nav mr-auto">
              <li class="nav-item ${categoryId!=null ? "" : "active"}">
              <a class="nav-link" href="Home">All
                  <span class="sr-only">(current)</span>
              </a>
          </li>
          <c:forEach items="${category}" var="ca">            
                  <li class="nav-item ${ca.getId()==categoryId ? "active" : ""}">
                      <a class="nav-link" href="Filter?id=${ca.getId()}">${ca.getName()}</a>
                  </li>
          </c:forEach>
        </ul>
          <!-- Links -->

          <form class="form-inline" action="Search">
            <div class="md-form my-0">
                <input  name="search" class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            </div>
          </form>
        </div>
        <!-- Collapsible content -->

      </nav>
      <!--/.Navbar-->

      <!--Section: Products v.3-->
      <section class="text-center mb-4">
          <c:if test="${size>0}">
              <c:forEach begin="0" step="1" end="${size-1}" var="i">
          
          <!--Grid row-->
        <div class="row wow fadeIn">
            <c:forEach begin="0" step="1" end="3" var="j">
                <div class="col-lg-3 col-md-6 mb-4">
                    <c:if test="${(4*i+j)<product.size()}">
                        <div class="card hover_tag">

              <!--Card image-->
              <div class="view overlay">
                <img height="300px" src="${product.get(4*i+j).getImage()}" class="card-img-top"
                  alt="">
                <a href="Detail?id=${product.get(4*i+j).getId()}">
                  <div class="mask rgba-white-slight"></div>
                </a>
              </div>
              <!--Card image-->

              <!--Card content-->
              <div class="card-body text-center">
                <!--Category & Title-->
                <a href="" class="grey-text">
                  <h5>${product.get(4*i+j).getCategoryName()}</h5>
                </a>
                <h5>
                  <strong>
                    <a href="" class="dark-grey-text">${product.get(4*i+j).getName()}
                      <span class="badge badge-pill danger-color">NEW</span>
                    </a>
                  </strong>
                </h5>

                <h4 class="font-weight-bold blue-text">
                  <strong>${product.get(4*i+j).getPrice()}$</strong>
                </h4>

              </div>
              <!--Card content-->

            </div>
                    </c:if>
            <!--Card-->
            
            <!--Card-->

          </div>
            </c:forEach>
          

        </div>
        <!--Grid row-->
</c:forEach>
          </c:if>
      
      </section>
          
      <!--Section: Products v.3-->

      <!--Pagination-->
      <nav class="d-flex justify-content-center wow fadeIn">
        <ul class="pagination pg-blue">

          <!--Arrow left-->
          <li class="page-item disabled">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
              <span class="sr-only">Previous</span>
            </a>
          </li>

          <li class="page-item active">
            <a class="page-link" href="#">1
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">2</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">3</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">4</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">5</a>
          </li>

          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
              <span class="sr-only">Next</span>
            </a>
          </li>
        </ul>
      </nav>
      <!--Pagination-->
      
        

    </div>
  </main>
    <jsp:include page="footer.jsp"></jsp:include>
    </body>
    
</html>
