import React from "react";
import Navbar from "./NavBar";
import "./Landing.css";
import { Link } from "react-router-dom";
import landing from "../assets/landing.svg";
import sun from "../assets/sun.svg";
import cloud1 from "../assets/cloud1.svg";
import cloud2 from "../assets/cloud2.svg";
import cloud3 from "../assets/cloud3.svg";

const Landing = () => {
  return (
    <div>
      <Navbar />
      <div className="main-container">
        <img alt="sun" className="sun" src={sun} />
        <h1 style={{ fontSize: "48px", color: '#0a3c57'}}>Grow Smarter, Not Harder</h1>
        <Link to="/get-started">
          <button className="getStarted">GET STARTED</button>
        </Link>
        <img alt="landing" className="landing" src={landing} />
        <img alt="cloud1" className="cloud1" src={cloud1} />
        <img alt="cloud2" className="cloud2" src={cloud2} />
        <img alt="cloud3" className="cloud3" src={cloud3} />
      </div>
    </div>
  );
};

export default Landing;
