
<%@ page import="com.movie.Connect.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.movie.Controller.*"%>
<%@ page import="com.movie.beans.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js h-100" lang="en">


<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Shards Dashboard Lite - Free Bootstrap Admin Template –
	DesignRevision</title>
<meta name="description"
	content="A high-quality &amp; free Bootstrap admin dashboard template pack that comes with lots of templates and components.">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" id="main-stylesheet" data-version="1.1.0"
	href="styles/shards-dashboards.1.1.0.min.css">
<link rel="stylesheet" href="styles/extras.1.1.0.min.css">
<script async defer src="https://buttons.github.io/buttons.js"></script>
</head>
<body class="h-100 accent-secondary active" data-color="danger">
	<%
		ZDanhMucPhim danhmucphim = new ZDanhMucPhim();
	%>
		<%
		ZTrangThai tt = new ZTrangThai();
	%>
	<div class="container-fluid">
		<div class="row">
			<aside class="main-sidebar col-12 col-md-3 col-lg-2 px-0">
				<div class="main-navbar">
					<nav
						class="navbar align-items-stretch navbar-light bg-white flex-md-nowrap border-bottom p-0">
						<a class="navbar-brand w-100 mr-0" href="#"
							style="line-height: 25px;">
							<div class="d-table m-auto">
								<img id="main-logo" class="d-inline-block align-top mr-1"
									style="max-width: 25px;"
									src="images/shards-dashboards-logo.svg" alt="Shards Dashboard">
								<span class="d-none d-md-inline ml-1">Trang quản lý</span>
							</div>
						</a> <a class="toggle-sidebar d-sm-inline d-md-none d-lg-none"> <i
							class="material-icons">&#xE5C4;</i>
						</a>
					</nav>
				</div>
				<form action="#"
					class="main-sidebar__search w-100 border-right d-sm-flex d-md-none d-lg-none">
					<div class="input-group input-group-seamless ml-3">
						<div class="input-group-prepend">
							<div class="input-group-text">
								<i class="fas fa-search"></i>
							</div>
						</div>
						<input class="navbar-search form-control" type="text"
							placeholder="Search for something..." aria-label="Search">
					</div>
				</form>
				<div class="nav-wrapper">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active"
							href="TrangQuanLyPhim.jsp"> <i class="material-icons">edit</i>
								<span>Quản lý phim</span>
						</a></li>
						<li class="nav-item"><a class="nav-link "
							href="TrangDanhMucPhim.jsp"> <i class="material-icons">vertical_split</i>
								<span>Quản lý danh mục phim</span>
						</a></li>
						<li class="nav-item"><a class="nav-link "
							href="add-new-post.html"> <i class="material-icons">note_add</i>
								<span>Quản lý lịch chiếu</span>
						</a></li>
						<li class="nav-item"><a class="nav-link "
							href="form-components.html"> <i class="material-icons">view_module</i>
								<span>Quản lý Khách hàng</span>
						</a></li>
						<li class="nav-item"><a class="nav-link " href="tables.html">
								<i class="material-icons">table_chart</i> <span>Quản lý
									thông tin cá nhân</span>
						</a></li>
						<li class="nav-item"><a class="nav-link "
							href="user-profile-lite.html"> <i class="material-icons">person</i>
								<span>User Profile</span>
						</a></li>
						<li class="nav-item"><a class="nav-link " href="errors.html">
								<i class="material-icons">error</i> <span>Errors</span>
						</a></li>
					</ul>
				</div>
			</aside>
			<main
				class="main-content col-lg-10 col-md-9 col-sm-12 p-0 offset-lg-2 offset-md-3">
			<div class="main-navbar sticky-top bg-white">
				<nav
					class="navbar align-items-stretch navbar-light flex-md-nowrap p-0">
					<form action="#"
						class="main-navbar__search w-100 d-none d-md-flex d-lg-flex">
						<div class="input-group input-group-seamless ml-3">
							<div class="input-group-prepend">
								<div class="input-group-text">
									<i class="fas fa-search"></i>
								</div>
							</div>
							<input class="navbar-search form-control" type="text"
								placeholder="Search for something..." aria-label="Search">
						</div>
					</form>
					<ul class="navbar-nav border-left flex-row ">
						<li class="nav-item border-right dropdown notifications"><a
							class="nav-link nav-link-icon text-center" href="#" role="button"
							id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">
								<div class="nav-link-icon__wrapper">
									<i class="material-icons">&#xE7F4;</i> <span
										class="badge badge-pill badge-danger">2</span>
								</div>
						</a>
							<div class="dropdown-menu dropdown-menu-small"
								aria-labelledby="dropdownMenuLink">
								<a class="dropdown-item" href="#">
									<div class="notification__icon-wrapper">
										<div class="notification__icon">
											<i class="material-icons">&#xE6E1;</i>
										</div>
									</div>
									<div class="notification__content">
										<span class="notification__category">Analytics</span>
										<p>
											Your website’s active users count increased by <span
												class="text-success text-semibold">28%</span> in the last
											week. Great job!
										</p>
									</div>
								</a> <a class="dropdown-item" href="#">
									<div class="notification__icon-wrapper">
										<div class="notification__icon">
											<i class="material-icons">&#xE8D1;</i>
										</div>
									</div>
									<div class="notification__content">
										<span class="notification__category">Sales</span>
										<p>
											Last week your store’s sales count decreased by <span
												class="text-danger text-semibold">5.52%</span>. It could
											have been worse!
										</p>
									</div>
								</a> <a class="dropdown-item notification__all text-center" href="#">
									View all Notifications </a>
							</div></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle text-nowrap px-3"
							data-toggle="dropdown" href="#" role="button"
							aria-haspopup="true" aria-expanded="false"> <img
								class="user-avatar rounded-circle mr-2"
								src="images/avatars/0.jpg" alt="User Avatar"> <span
								class="d-none d-md-inline-block">Sierra Brooks</span>
						</a>
							<div class="dropdown-menu dropdown-menu-small">
								<a class="dropdown-item" href="user-profile-lite.html"> <i
									class="material-icons">&#xE7FD;</i> Profile
								</a> <a class="dropdown-item" href="components-blog-posts.html">
									<i class="material-icons">vertical_split</i> Blog Posts
								</a> <a class="dropdown-item" href="add-new-post.html"> <i
									class="material-icons">note_add</i> Add New Post
								</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item text-danger" href="#"> <i
									class="material-icons text-danger">&#xE879;</i> Logout
								</a>
							</div></li>
					</ul>
					<nav class="nav">
						<a href="#"
							class="nav-link nav-link-icon toggle-sidebar d-md-inline d-lg-none text-center border-left"
							data-toggle="collapse" data-target=".header-navbar"
							aria-expanded="false" aria-controls="header-navbar"> <i
							class="material-icons">&#xE5D2;</i>
						</a>
					</nav>
				</nav>

				<div class="row">

					<div class='col-lg-9 col-md-12'>
						<div class="card card-small mb-3">
							<div class="card-body">
								<form class="add-new-post" action="/WebMovie/PhimServlet"
									method="post">
									<input type="hidden" name="command" value="update">
									<input
											type="hidden" name="id" value="${param.id }">
									 <input
										class="form-control form-control-lg mb-3" type="text"
										placeholder="Tiêu đề phim" name="tieuDe" value="${param.tieuDe }">
									<div
										class="row justify-content-md-center  justify-content-lg-center align-items-center">
										<div class="col-lg-4 col-md-4">
											<input class="form-control form-control-lg mb-3" type="text"
												placeholder="Đạo diễn" name="daoDien"value="${param.daoDien }">
										</div>
										<div class="col-lg-4 col-md-4">
											<input class="form-control form-control-lg mb-3"
												type="number" placeholder="Độ tuổi" name="doTuoi"value="${param.doTuoi }">
										</div>
										<div class="col-lg-4 col-md-3">
											<div class="dropdown mb-1">
												<button class="btn btn-primary dropdown-toggle"
													type="button" id="dropdownMenuButton"
													data-toggle="dropdown" aria-haspopup="true"
													aria-expanded="false">Quốc gia</button>
												<div class="dropdown-menu"
													aria-labelledby="dropdownMenuButton">
													<select multiple class="form-control" id="sel2"
														name="quocGia" >

														<option class="dropdown-item">Việt Nam</option>
														<option class="dropdown-item">Lào</option>
														<option class="dropdown-item">Campuchia</option>
														<option class="dropdown-item">Mỹ</option>
														<option class="dropdown-item">Ấn Độ</option>
													</select>
												</div>
											</div>
										</div>
									</div>
									<input class="form-control form-control-lg mb-3" type="text"
										placeholder="Diễn viên" name="dienVien">
										
									<div
										class="row justify-content-md-center  justify-content-lg-center align-items-center">
										<div class="col-lg-7 col-md-7">
											<input class="form-control form-control-lg mb-3" type="url"
												placeholder="Link trailer phim" name="urlTrailer" value="${param.urlTrailer }">
										</div>
										<div class="col-lg-5 col-md-5">
											<input class="form-control form-control-lg mb-3" type="text"
												placeholder="Link ảnh" name="linkAnh" value="${param.linkAnh }">
										</div>
									</div>
									<input class="form-control form-control-lg mb-3" type="text"
										placeholder="Mô tả" name="moTa"value="${param.moTa }">
									<div class="col-lg-5 col-md-6 pl-0">
										<input class="form-control form-control-lg mb-3" type="text"
											placeholder="Gia ve" name="giaVe"value="${param.giaVe }"> 
											<input
											class="form-control form-control-lg mb-3" type="text"
											placeholder="Độ dài" name="doDai"value="${param.doDai }">
										<div class="card-body border-bottom">
											<div
												class="card-header  border-bottom text-center text-justify">
												<span>Danh mục phim</span>
											</div>
											<select multiple class="form-control" id="sel_Danhmuc"
												name="danhMuc" value="${param.doDai }">
												<%
													int count = 0;
													for (DanhMucPhim c : danhmucphim.getDanhMucPhim()) {
														count++;
												%>
												<option><%=c.getTenDanhMuc()%></option>
												<%
													}
												%>
											</select>
											
										</div>
										<div class="card-body border-bottom">
											<div
												class="card-header  border-bottom text-center text-justify">
												<span>Trạng thái</span>
											</div>
											<select multiple class="form-control" id="sel_TrangThai"
													name="trangThai">
													<%
													int count1 = 0;
													for (TrangThai b : tt.getTT()) {
														count1++;
														
												%>
													<option><%=b.getTenTrangThai()%></option>
													<%
													}
												%>
												</select>
											
										</div>
										
										<input type="submit" class="btn btn-info mb-3 " value="Update">
									</div>
									<div id="editor-container" class="add-new-post__editor mb-1">

									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-12">
						<div class="card card-small mb-3"></div>
						<div class="card-footer">
							<li class="list-group-item d-flex px-3">
								<div class="input-group">
									<input id="CategoryName" type="text" class="form-control"
										placeholder="New category" aria-label="Add new category"
										aria-describedby="basic-addon2">
									<div class="input-group-append">
										<button id="addCategory" class="btn btn-white px-2"
											type="submit">
											<i class="material-icons">add</i>
										</button>
									</div>
								</div>
							</li>
						</div>
					</div>
					<div class="card card-small mb-3">
						<div class="card-header  border-bottom text-center text-justify">
							<span>Tùy Chọn</span>
						</div>
						<div class="card-body">
							<div class="form-check border-bottom text-left ml-2">
								<input type="checkbox" class="form-check-input" id="isComments">
								<label class="form-check-label" for="exampleCheck1">Cho
									Phép Bình Luận</label>
							</div>
						</div>
						<div class="card-body">
							<div class="form-check border-bottom text-left ml-2">
								<input type="checkbox" class="form-check-input" id="isComments">
								<label class="form-check-label" for="exampleCheck1">Khong
									duoc Phép Bình Luận</label>
							</div>
						</div>

						<div class="row    align-items-center mb-4">
							<div class="dropdown mb-1 col-6 text-center">
								<button class="btn btn-primary dropdown-toggle col-9"
									type="button" id="dropdownMenuButton" data-toggle="dropdown"
									aria-haspopup="true" aria-expanded="false">Chế Độ</button>
								<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
									<select multiple class="form-control" id="sel2" name="country">
										<option class="dropdown-item">Hot</option>
										<option class="dropdown-item">Xem Nhiều Nhất</option>
									</select>
								</div>
							</div>
							<div class="dropdown mb-1 col-6 text-center">
								<button class="btn btn-primary dropdown-toggle col-9"
									type="button" id="dropdownMenuButton" data-toggle="dropdown"
									aria-haspopup="true" aria-expanded="false">Quyền Xem</button>
								<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
									<select multiple class="form-control" id="sel2" name="country">
										<option class="dropdown-item">Công Khai</option>
										<option class="dropdown-item">Riêng tư</option>
									</select>
								</div>
							</div>


						</div>

					</div>
				</div>
			</main>

		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
	<script src="https://unpkg.com/shards-ui@latest/dist/js/shards.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Sharrre/2.0.1/jquery.sharrre.min.js"></script>
	<script src="scripts/extras.1.1.0.min.js"></script>
	<script src="scripts/shards-dashboards.1.1.0.min.js"></script>
	<script src="scripts/app/app-blog-overview.1.1.0.js"></script>
</body>