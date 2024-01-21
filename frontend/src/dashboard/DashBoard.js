import React from "react";
import "./Dashboard.css";
import Task from "./Task";
import Profile from "./Profile";
import Plant from "./Plant";
import logo from "../assets/logo.svg";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHome } from "@fortawesome/free-solid-svg-icons";
import { faUsers } from "@fortawesome/free-solid-svg-icons";
import bg from "../assets/aloe.svg";

const Dashboard = () => {
  const currentDate = new Date();
  const options = { year: "numeric", month: "long", day: "numeric" };
  const formattedDate = currentDate.toLocaleDateString("en-US", options);

  return (
    <div className="dashboard-container">
      <div className="sidebar">
        <img alt="logo" src={logo} />
        <p style={{ fontSize: "30px" }}>
          <FontAwesomeIcon icon={faHome} />
        </p>
        <p style={{ fontSize: "30px" }}>
          <FontAwesomeIcon icon={faUsers} />
        </p>
      </div>

      <div className="main-content">
        <div className="header">
          <h2>Dashboard</h2>
          <h3>{formattedDate}</h3>
        </div>
        <h2 className="greeting">Aloe there, <br></br>Jane!</h2>
        <div className="content-box">
          <img alt="logo" className="aloe" src={bg} />
        </div>
        <div className="taskSection">
          <h3 style={{ marginTop: "-80px" }} className="tasks">
            Today's Tasks:
          </h3>
          <Task className="task" />
          <Task className="task" />
          <Task className="task" />
          <h3 className="tasks">Tomorrow's Tasks:</h3>
          <Task className="task" />
          <Task className="task" />
          <Task className="task" />
        </div>
      </div>

      <div className="plants-container">
        <Profile className="profile" />
        <div className="plants-header">
          <h2>Plants</h2>
          <div className="add-plant-button">+</div>
        </div>
        <Plant className="plant" />
      </div>
    </div>
  );
};

export default Dashboard;
