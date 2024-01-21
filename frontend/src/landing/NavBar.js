import React from 'react';
import { Link } from 'react-router-dom';
import './Landing.css';

const Navbar = () => {
  return (
    <nav className="navbar">
      <div className="logo-container">
        <div className="logo-icon"></div>
        <span className="logo-text">BestBuds</span>
      </div>
      <div className="navbar-items-container">
        <p className="navbar-item">About</p>
        <p className="navbar-item">How It Works</p>
        <Link to="/login">
          <button className="navbar-item login-button">Log In</button>
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;
