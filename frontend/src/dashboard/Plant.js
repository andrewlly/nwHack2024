import React, { useState } from 'react';
import './Dashboard.css';
import ProgressBar from './ProgressBar';

const Plant = () => {
  const [isOpen, setIsOpen] = useState(false);

  const handleClick = () => {
    setIsOpen(!isOpen);
  }
  
  return (
    
    <div className="plant-container" onClick={handleClick}>
      <div className="plant-count-badge">2</div>
      <div className="plant-circle"></div>
      <div className="plant-info-container">
        <h3 className="plant-name">Jerry - <span className="plant-type">Tomato Plant</span></h3>
        <ProgressBar />
        {isOpen && (<div>
          <div className='health-status'>Healthy</div>
          <p>Cake<span> January 20th, 2024</span></p>
          <p><span>Leaf </span>Next stage is in<span>3 weeks!</span></p>
          <p><span>Drop </span>Next watering is in<span>3 days!</span></p>
          <div className='upgrade-button'>Upgrade This Plant to Next Stage</div>
          <p className="learn-more-button" style={{ textDecoration: 'underline' }}><span>i</span>Learn more about this plant!</p>
        </div>)}
      </div>
    </div>
  );
};

export default Plant;