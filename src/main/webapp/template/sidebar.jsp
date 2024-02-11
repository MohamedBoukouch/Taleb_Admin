<!DOCTYPE html>
<!-- Coding by CodingNepal | www.codingnepalweb.com -->
<html lang="en" dir="ltr">
<head>
  <meta charset="UTF-8">
  <title>Responsive Admin Dashboard | CodingLab</title>
  <link rel="stylesheet" href="css/style.css">
  <!-- Boxicons CDN Link -->
  <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="sidebar">
  <div class="logo-details">
    <i class='bx bxl-c-plus-plus'></i>
    <span class="logo_name">CodingLab</span>
  </div>
  <ul class="nav-links">
    <li>
      <a href="Dashboard.jsp" class="active" onclick="handleClick(this)">
        <i class='bx bx-grid-alt' ></i>
        <span class="links_name">Dashboard</span>
      </a>
    </li>
    <li>
      <a href="Publications.jsp" onclick="handleClick(this)">
        <i class='bx bx-box' ></i>
        <span class="links_name">Publication</span>
      </a>
    </li>
    <li>
      <a href="AllUsers.jsp" onclick="handleClick(this)">
        <i class='bx bx-list-ul' ></i>
        <span class="links_name">All Users</span>
      </a>
    </li>
    <li>
        <a href="#" onclick="handleClick(this)">
            <i class='bx bx-pie-chart-alt-2'></i>
            <span class="links_name">Analytics</span>
        </a>
    </li>
    <li>
      <a href="#" onclick="handleClick(this)">
        <i class='bx bx-coin-stack' ></i>
        <span class="links_name">Annonces</span>
      </a>
    </li>
    <li>
      <a href="#" onclick="handleClick(this)">
        <i class='bx bx-book-alt' ></i>
        <span class="links_name">Concouresr</span>
      </a>
    </li>
    <li>
      <a href="#" onclick="handleClick(this)">
        <i class='bx bx-user' ></i>
        <span class="links_name">Team</span>
      </a>
    </li>
    <li>
      <a href="#" onclick="handleClick(this)">
        <i class='bx bx-message' ></i>
        <span class="links_name">Messages</span>
      </a>
    </li>
    <li>
      <a href="#" onclick="handleClick(this)">
        <i class='bx bx-heart' ></i>
        <span class="links_name">Favorites</span>
      </a>
    </li>
    <li>
      <a href="#" onclick="handleClick(this)">
        <i class='bx bx-cog' ></i>
        <span class="links_name">Setting</span>
      </a>
    </li>
    <li class="log_out">
      <a href="login.jsp">
        <i class='bx bx-log-out'></i>
        <span class="links_name">Log out</span>
      </a>
    </li>
  </ul>
</div>

<script>
  function handleClick(element) {
    // Remove active class from all links
    let navLinks = document.querySelectorAll(".nav-links a");
    navLinks.forEach(link => {
      link.classList.remove("active");
    });

    // Add active class to the clicked link
    element.classList.add("active");
  }
</script>
</body>
</html>
