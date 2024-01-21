import { useState, useEffect } from "react";
import Tomato from "./../assets/tomato.svg";
import Basil from "./../assets/basil.svg";
import Info from "./../assets/info.svg";
import "./Dashboard.css";

const PlantInfo = ({ plantType }) => {
  return (
    <>
      <img alt="Info" className="Info" src={Info} />
    </>
  );
};

export default PlantInfo;
