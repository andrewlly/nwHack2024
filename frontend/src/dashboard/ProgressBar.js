import React from "react";
import "./Dashboard.css";
import ProgressBar from "../assets/progressbar.svg";

const ProgressComponent = () => {
  return (
    <div className="progress-container">
      <div className="progress-header">
        <p className="progress-stage">Stage 2</p>
        <p className="progress-percentage">33%</p>
      </div>
      <div className="progress-bar">
        <img alt="ProgressBar" className="ProgressBar" src={ProgressBar} />
      </div>
    </div>
  );
};

export default ProgressComponent;
