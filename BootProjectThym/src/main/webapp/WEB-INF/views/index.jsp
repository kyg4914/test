<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<!--
	Editorial by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>Elements - Editorial by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<header id="header">
					<a href="index.html" class="logo"><strong>Editorial</strong> by
						HTML5 UP</a>
				</header>

				<!-- Content -->
				<section>
					<header class="main">
						<h1>게시판 😊😊😊</h1>
					</header>
					
					
					<div class="row gtr-200">
						<div class="col-6 col-12-medium" style="width: 100%">

							<div class="table-wrapper">
								<table>
									<thead>
										<tr>
											<th>번호</th>
											<th>제목</th>
											<th>작성자</th>
											<th>작성일</th>
										</tr>
									</thead>
									<tbody>
										<!-- 게시물 출력 -->
										<c:forEach var="b" items="${list}">
											<tr>
												<td>${b.idx }</td>
												<td><a href="board/content/${b.idx }">${b.title }</a></td>
												<td>${b.writer }</td>
												<td>${b.indate }</td>
											</tr>
										</c:forEach>
										<tr>
											<td colspan="4">
												<button onclick="location.href='writeform'"
													class="btn btn-sm btn-success">글작성</button>
											</td>
										</tr>
									</tbody>
									</tbody>
								</table>
							</div>

							<ul class="pagination">
								<li><span class="button disabled">Prev</span></li>
								<li><a href="#" class="page active">1</a></li>
								<li><a href="#" class="page">2</a></li>
								<li><a href="#" class="page">3</a></li>
								<li><span>&hellip;</span></li>
								<li><a href="#" class="page">8</a></li>
								<li><a href="#" class="page">9</a></li>
								<li><a href="#" class="page">10</a></li>
								<li><a href="#" class="button">Next</a></li>
							</ul>

						</div>

					</div>

				</section>

			</div>
		</div>

		<!-- Sidebar -->
		<div id="sidebar">
			<div class="inner">

				<!-- Search -->
				<section class="alt">
				<c:choose>
				    <c:when test="${empty member}">
						<form method="post" action="member/login" style="display:flex; align-items:stretch; flex-direction:column">
							<input type="text" name="email" placeholder="email" />
							<input type="password" name="pw" placeholder="pw">
							<input type="submit" value="LOGIN"class="primary" />
						</form>
				    </c:when>
				    <c:otherwise>
						${member.email } 님 환영합니다 <br>
						<input>
				    </c:otherwise>
				</c:choose>
					
				</section>

				<!-- Menu -->
				<nav id="menu">
					<header class="major">
						<h2>Menu</h2>
					</header>
					<ul>
						<li><a href="index.html">Homepage</a></li>
						<li><a href="generic.html">Generic</a></li>
						<li><a href="elements.html">Elements</a></li>
					</ul>
				</nav>



				<!-- Section -->
				<section>
					<header class="major">
						<h2>Get in touch</h2>
					</header>
					<p>Sed varius enim lorem ullamcorper dolore aliquam aenean
						ornare velit lacus, ac varius enim lorem ullamcorper dolore. Proin
						sed aliquam facilisis ante interdum. Sed nulla amet lorem feugiat
						tempus aliquam.</p>
					<ul class="contact">
						<li class="icon solid fa-envelope"><a href="#">information@untitled.tld</a></li>
						<li class="icon solid fa-phone">(000) 000-0000</li>
						<li class="icon solid fa-home">1234 Somewhere Road #8254<br />
							Nashville, TN 00000-0000
						</li>
					</ul>
				</section>

				<!-- Footer -->
				<footer id="footer">
					<p class="copyright">
						&copy; Untitled. All rights reserved. Demo Images: <a
							href="https://unsplash.com">Unsplash</a>. Design: <a
							href="https://html5up.net">HTML5 UP</a>.
					</p>
				</footer>

			</div>
		</div>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>