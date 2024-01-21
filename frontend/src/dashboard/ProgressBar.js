import React from 'react';
import './Dashboard.css';

const ProgressComponent = () => {
  return (
    <div className="progress-container">
      <div className="progress-header">
        <p className="progress-stage">Stage 2</p>
        <p className="progress-percentage">33%</p>
      </div>
      <div className="progress-bar"></div>
    </div>
  );
};

export default ProgressComponent;
