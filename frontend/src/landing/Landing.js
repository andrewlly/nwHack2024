import React from 'react';
import Navbar from './NavBar';
import './Landing.css';

const Landing = () => {
  return (
    <div>
    <Navbar />
    <div className='main-container'>
        <h1 style={{fontSize: '48px'}}>BIG MESSAGE HERE</h1>
        <button>GET STARTED</button>
        <img src="your_image_url_here"/>
    </div>
    </div> 
  );
};

export default Landing;