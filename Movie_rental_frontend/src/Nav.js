import React from "react";
import "./App1.scss";
import { Link } from "react-router-dom";

function Nav() {
  return (
    <nav>
      <Link className="NavLink" to="/movies">
        <h3>Movie Rental Site</h3>
      </Link>
      <ul className="nav-link">
        <Link className="NavLink" to="/movies">
          <li>Movies</li>
        </Link>
        <Link className="NavLink" to="/contact">
          <li>Contact</li>
        </Link>
        <Link className="NavLink" to="profile">
          <li>Profile</li>
        </Link>
      </ul>
    </nav>
  );
}

export default Nav;
