import React, { useState } from "react";
import "./Dashboard.css";
import ProgressBar from "./ProgressBar";
import tomato from "../assets/tomatoIcon.svg";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faCake } from "@fortawesome/free-solid-svg-icons";
import { faSeedling } from "@fortawesome/free-solid-svg-icons";
import { faDroplet } from "@fortawesome/free-solid-svg-icons";
import { faCircleInfo } from "@fortawesome/free-solid-svg-icons";
import { Modal, Box } from "@mui/material";
import PlantInfo from "./PlantInfo";

const Plant = () => {
  const [isOpen, setIsOpen] = useState(false);

  const handleClick = () => {
    setIsOpen(!isOpen);
  };

  const modalStyle = {
    position: "absolute",
    top: "50%",
    left: "50%",
    transform: "translate(-50%, -50%)",
    width: 500,
    height: 550,
    bgcolor: "#F8F5EC",
    borderRadius: "20px",
    p: 4,
    textAlign: "left", // Add this line for left justification
    alignItems: "flex-start", // Align items to the start (top) of the container
  };

  const [plantInfoOpen, setPlantInfoOpen] = useState(false);
  const [modalPlant, setModalPlant] = useState("");

  const openPlantInfo = (plantType) => {
    setModalPlant(plantType);
    setPlantInfoOpen(true);
  };
  const handleExit = () => {
    setPlantInfoOpen(false);
  };

  return (
    <div className="plant-container" onClick={handleClick}>
      <Modal open={plantInfoOpen}>
        <Box sx={modalStyle}>
          <div className="plant-count-badge-exit" onClick={() => handleExit()}>
            X
          </div>
          {plantInfoOpen && <PlantInfo plantType={modalPlant} />}
        </Box>
      </Modal>
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
              <span className="greenIcon">
                <FontAwesomeIcon icon={faCake} />{" "}
              </span>
              January 20th, 2024
            </p>
            <p>
              <span className="greenIcon">
                <FontAwesomeIcon icon={faSeedling} />{" "}
              </span>
              Next stage is in<strong> 3 weeks!</strong>
            </p>
            <p>
              <span className="greenIcon">
                <FontAwesomeIcon icon={faDroplet} />{" "}
              </span>
              Next watering is in <strong>3 days!</strong>
            </p>
            <div className="upgrade-button">
              Upgrade This Plant to Next Stage
            </div>
            <p
              className="learn-more-button"
              style={{ textDecoration: "underline" }}
            >
              <span className="space" onClick={() => setPlantInfoOpen(true)}>
                <FontAwesomeIcon icon={faCircleInfo} /> Learn more about this
                plant!
              </span>
            </p>
          </div>
        )}
      </div>
    </div>
  );
};

export default Plant;
