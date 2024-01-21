import React from 'react';
import Navbar from './NavBar';
import './Landing.css';
import { Link } from 'react-router-dom';

const Landing = () => {
  return (
    <div>
    <Navbar />
    <div className='main-container'>
        <h1 style={{fontSize: '48px'}}>BIG MESSAGE HERE</h1>
        <Link to="/get-started">
        <button>GET STARTED</button>
      </Link>
        <img src="your_image_url_here"/>
    </div>
    </div> 
  );
};

export default Landing;