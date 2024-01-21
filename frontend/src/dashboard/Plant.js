import React from 'react';
import './Dashboard.css';
import ProgressBar from './ProgressBar';

const Plant = () => {
  return (
    <div className="plant-container">
      <div className="plant-count-badge">2</div>
      <div className="plant-circle"></div>
      <div className="plant-info-container">
        <h3 className="plant-name">Jerry - <span className="plant-type">Tomato Plant</span></h3>
        <ProgressBar />
      </div>
    </div>
  );
};

export default Plant;
