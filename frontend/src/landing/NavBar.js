import React from 'react';
import { Link } from 'react-router-dom';
import './Landing.css';
import logo from "../assets/logo.svg";

const Navbar = () => {
  return (
    <nav className="navbar">
      <div className="logo-container">
        <img alt="logo" src={logo} />
        <span className="logo-text">BestBuds</span>
      </div>
      <div className="navbar-items-container">
        {/* <p className="navbar-item">About</p>
        <p className="navbar-item">How It Works</p> */}
        <Link to="/login">
          <button className="navbar-item login-button">LOG IN</button>
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;
