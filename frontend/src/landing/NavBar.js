import React from 'react';
import './Landing.css';
import { Link } from 'react-router-dom';

const Navbar = () => {
  return (
    <nav>
        <div style={{display: 'flex', justifyContent: 'space-between'}}>
            <div style={{display: 'flex', alignItems: 'center'}}>
                <div style={{ backgroundColor: '#8EC6DD', height: '6vh', width: '6vh', margin: '15px', borderRadius: '100%'}} />
                <span style={{fontSize: '20px'}}>BestBuds</span>
            </div>
            <div style={{display: 'flex', alignItems: 'center', marginRight: '20px'}}>
                <p className='navbar-item'>About</p>
                <p className='navbar-item'>How It Works</p>
                <Link to="/login">
                <button className='navbar-item'>Log In</button>
                </Link>
              </div>
        </div>
    </nav>
  );
};

export default Navbar;