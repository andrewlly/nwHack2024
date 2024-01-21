import React from 'react';
import './Landing.css';


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
                <button className='navbar-item'>Log In</button>
            </div>
        </div>
    </nav>
  );
};

export default Navbar;