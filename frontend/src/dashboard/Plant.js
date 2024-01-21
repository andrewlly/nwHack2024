import React, { useState } from "react";
import "./Dashboard.css";
import ProgressBar from "./ProgressBar";
import tomato from "../assets/tomatoIcon.svg";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faCake } from "@fortawesome/free-solid-svg-icons";
import { faSeedling } from "@fortawesome/free-solid-svg-icons";
import { faDroplet } from "@fortawesome/free-solid-svg-icons";
import { faCircleInfo } from "@fortawesome/free-solid-svg-icons";

const Plant = () => {
  const [isOpen, setIsOpen] = useState(false);

  const handleClick = () => {
    setIsOpen(!isOpen);
  };

  return (
    <div className="plant-container" onClick={handleClick}>
      <div className="plant-top">
        <div className="plant-count-badge">2</div>
        <div className="plant-circle">
          <img alt="tomato" className="tomato" src={tomato} />
        </div>
        <div className="plant-info-container">
          <h3 className="plant-name">
            Jerry - <span className="plant-type">Tomato Plant</span>
          </h3>
          <ProgressBar />
        </div>
      </div>

      <div className="plant-open">
      {isOpen && (
        <div>
          <div className="health-status">Healthy</div>
          <p>
          <span className = "greenIcon"><FontAwesomeIcon icon={faCake} /> </span>January 20th, 2024
          </p>
          <p>
            <span className = "greenIcon"><FontAwesomeIcon icon={faSeedling} /> </span>Next stage is in< strong> 3 weeks!</strong>
          </p>
          <p>
            <span className = "greenIcon"><FontAwesomeIcon icon={faDroplet} /> </span>Next watering is in <strong>3 days!</strong>
          </p>
          <div className="upgrade-button">Upgrade This Plant to Next Stage</div>
          <p
            className="learn-more-button"
            style={{ textDecoration: "underline" }}
          >
            <span className = "space"><FontAwesomeIcon icon={faCircleInfo} /></span> Learn more about this plant!
          </p>
        </div>
      )}
      </div>
      
    </div>
  );
};

export default Plant;
